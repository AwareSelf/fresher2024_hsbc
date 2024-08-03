package nama.security.springsecuritydemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import nama.security.springsecuritydemo.repo.CustomerRepository;
import nama.security.springsecuritydemo.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	
        Customer c = customerRepository.findByUsername(username);//create this Rrepository

        if (c == null) {
            throw new UsernameNotFoundException("User details not found for the user : " + username);
        }

        String[] roles = c.getRoles().split(",");
        System.out.println(c.getUsername()+","+c.getPasswordd());
        for(String s:roles)
            System.out.println(s);

        return User.withUsername(c.getUsername())
                .password(c.getPasswordd())
                //.authorities("ROLE_USER","ROLE_ADMIN")
                .authorities(roles)
                .accountExpired(false)
                .accountLocked(false)
                .credentialsExpired(false)
                .disabled(false)
                .build();

    }

}
