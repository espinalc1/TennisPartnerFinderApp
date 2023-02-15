package com.tennisApp.Auth.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class SignInController {

    @PostMapping("/signin")
    public void signIn(){
        /**
         * 1. Client Send Sign in request
         * 2. Server responds with cookie
         * 3. client stores cookie information
         */
    }
}
