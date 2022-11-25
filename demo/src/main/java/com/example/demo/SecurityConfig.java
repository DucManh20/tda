package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true, jsr250Enabled = true)

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;
//
    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    // xac thuc
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    /*
     * @Override public void configure(WebSecurity web) throws Exception {
     * web.ignoring().antMatchers("/css/**", "/img/**"); }
     */

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/admin/**").// antmatchers : tat ca duong dan bat dau bang /admin/
                hasAnyRole("ADMIN", "SUBADMIN").antMatchers("/hello/hi").authenticated()
                .anyRequest()														// duoc
                .permitAll().and().csrf().disable() // anyRequest : request con lai
                 //.httpBasic(); // form cua trinh duyet
                .formLogin() // form cua spring
                .loginPage("/system/login")
			//	.loginProcessingUrl("system/login")
                .defaultSuccessUrl("/user/hi", true)
                .failureUrl("/system/login?e=ten dang nhap hoac mat khau sai!")
                .and().exceptionHandling();
//                .accessDeniedPage("/login");
    }
}
