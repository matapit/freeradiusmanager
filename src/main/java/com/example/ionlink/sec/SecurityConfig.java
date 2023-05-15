package com.example.ionlink.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource).usersByUsernameQuery("select username as principal, password as credentials, active from customer where username=?")
                .authoritiesByUsernameQuery("select username as principal, role as role from customer where username=?")
                .passwordEncoder(new MessageDigestPasswordEncoder("MD5"))
                .rolePrefix("Role_");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();
        http.formLogin();
        //http.authorizeHttpRequests().antMatchers("/admin","/admin/*","/admin/billingPlan/","/admin/billingPlan/add","/admin/billingPlan/new").hasRole("admin");
    }
}
