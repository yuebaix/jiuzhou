package com.yuebaix.jiuzhou.svc.uaa.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@Api(tags = "用户接口")
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDetailsService userDetailsService;

    @SneakyThrows
    @ApiOperation("用户信息")
    @GetMapping("/userInfo")
    public Map<String, String> userInfo() {
        UserDetails userDetails = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        userDetails = userDetailsService.loadUserByUsername(userDetails.getUsername());

        ObjectMapper om = new ObjectMapper();
        String json = om.writer().withDefaultPrettyPrinter().writeValueAsString(userDetails);
        log.info(json);

        return Collections.singletonMap("username", userDetails.getUsername());
    }
}
