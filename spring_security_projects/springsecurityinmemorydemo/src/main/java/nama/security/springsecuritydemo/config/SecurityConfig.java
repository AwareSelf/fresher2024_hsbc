package nama.security.springsecuritydemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {



    // User Creation
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {

     // InMemoryUserDetailsManager
        UserDetails admin = User.withUsername("ram")
                .password(encoder.encode("ram"))
                .roles("ADMIN", "USER")
                .build();

        UserDetails user = User.withUsername("shyam")
                .password(encoder.encode("shyam"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }





    // Configuring HttpSecurity
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(c->c.disable())
                .authorizeHttpRequests(request -> request.requestMatchers("/auth/welcome").permitAll()
                        .requestMatchers("/auth/admin/**").authenticated()
                        .requestMatchers("/auth/user/**").authenticated()
                      )
                .formLogin(Customizer.withDefaults())
                .build();
    }

    // Password Encoding
    @Bean
    public PasswordEncoder passwordEncoder() {
       return new BCryptPasswordEncoder(); //use with InMemoryUserDetailService

    }

}

