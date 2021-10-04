package com.method.spring.security.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {
	
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
    public String hasAdmUsrRole() {
        return "Hello World!!!";
    }
    
    @PreAuthorize("permitAll()")
    public String anonymous() {
        return "Hello World!!!";
    }

}
