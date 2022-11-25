package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LoginService implements UserDetailsService {
    @Autowired
    UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        com.example.demo.model.User st = userRepo.findByName(name);

        // Khong ton tai st co name
        if (st == null) {
            throw new UsernameNotFoundException("not found");
        }
        List<SimpleGrantedAuthority> list = new ArrayList<SimpleGrantedAuthority>();

         list.add(new SimpleGrantedAuthority(st.getRole()));
        // tao user cua security // user dang nhap hien tai
        User currentUser = new User(name, st.getPassword(), list);
// extend User de them thuoc tinh.
        return currentUser;
    }

}
