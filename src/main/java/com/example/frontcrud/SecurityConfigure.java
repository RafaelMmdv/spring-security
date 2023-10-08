package com.example.frontcrud;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface SecurityConfigure {
    void configure(HttpSecurity http) throws Exception;
}


