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
    @Autowired
    private UserDetailsService userDetailsService;



    // Configuring HttpSecurity
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(c->c.disable())
                .authorizeHttpRequests(request -> request.requestMatchers("/auth/welcome").permitAll()
                        .requestMatchers("/auth/admin/**").authenticated()
                        .requestMatchers("/auth/user/**").authenticated()

                )
                .formLogin(Customizer.withDefaults())
                .userDetailsService(userDetailsService)
                .build();
    }

    /*

    //only if @EnableMethodSecurity on this class anno and @PreAuthorize anno on UserController
    // is removed/commented then below securityFilterChain method can be used to
    //give authorization permissions using hasRole,hasAnyRole methods.

      @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(c->c.disable())
                .authorizeHttpRequests(request -> request.requestMatchers("/auth/welcome").permitAll()
                        .requestMatchers("/auth/admin/**").hasRole("ADMIN")
                        .requestMatchers("/auth/user/**").hasAnyRole("USER","ADMIN")
                        .anyRequest().authenticated()

                )
                .formLogin(Customizer.withDefaults())
                .userDetailsService(userDetailsService)
                .build();
    }
     */

    // Password Encoding
    @Bean
    public PasswordEncoder passwordEncoder() {
     //  return new BCryptPasswordEncoder(); //use with InMemoryUserDetailService
        return NoOpPasswordEncoder.getInstance();
    }

}

