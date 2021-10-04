package com.method.spring.security.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.method.spring.security.service.AgentService;

@RestController
@RequestMapping("agent")
public class AgentController {
	@Autowired
	AgentService agentService;
	
    @GetMapping("anonymous")
    public String anonymous() {
        return agentService.anonymous();
    }

    @GetMapping("has-role")
    public String hasAdminRole() {
        return agentService.hasAdminRole();
    }

}
