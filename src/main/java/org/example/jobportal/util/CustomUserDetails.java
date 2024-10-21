package org.example.jobportal.util;

import org.example.jobportal.entity.Users;
import org.example.jobportal.entity.UsersType;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetails  implements UserDetails {


    private final Users user;

    public CustomUserDetails(Users user) {
        this.user = user;
    }

    // This method is used to get the authorities of the user
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Get the user type of the user
        UsersType usersType = user.getUserTypeId();
        // Create a list of authorities
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        // Add the user type to the authorities list
        authorities.add(new SimpleGrantedAuthority(usersType.getUserTypeName()));
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
