package com.harunsefainan.studentserver.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserDetailsConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user1 = User
                .withUsername("user1")
                .password("{noop}" + "user1")
                .roles("USER")
                .build();
        // Other users work here
        return new InMemoryUserDetailsManager(user1);
    }
}
