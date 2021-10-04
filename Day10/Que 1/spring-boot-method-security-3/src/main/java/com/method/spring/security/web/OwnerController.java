package com.method.spring.security.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.method.spring.security.service.OwnerService;

@RestController
@RequestMapping("owner")
public class OwnerController {
	@Autowired
	OwnerService ownerService;
	
    @GetMapping("anonymous")
    public String anonymous() {
        return ownerService.anonymous();
    }

    @GetMapping("has-role")
    public String hasAdmUsrRole() {
        return ownerService.hasAdmUsrRole();
    }

}
