package com.method.spring.security.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class AgentService {
	
	@Secured("ROLE_ANONYMOUS")
    public String anonymous() {
        return "Hello World!!!";
    }

    @Secured("ROLE_ADMIN")
    public String hasAdminRole() {
        return "Hello World!!!";
    }

}
