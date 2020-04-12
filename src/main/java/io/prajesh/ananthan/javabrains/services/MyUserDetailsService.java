package io.prajesh.ananthan.javabrains.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by prajesh.ananthan on 11/4/2020.
 *
 * @author Prajesh Ananthan, AirAsia BIG Sdn. Bhd.
 */

@Service
public class MyUserDetailsService implements UserDetailsService {


    private static final String USERNAME = "foo";
    private static final String PASSWORD = "foo";

    // Load the username from this method
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return new User(USERNAME, PASSWORD, new ArrayList<>());
    }
}
