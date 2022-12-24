package com.core.merph.studentmanagementsystembackend.controller;

import com.core.merph.studentmanagementsystembackend.dto.login.LoginRequestDTO;
import com.core.merph.studentmanagementsystembackend.dto.login.LoginResponseDTO;
import com.core.merph.studentmanagementsystembackend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */

@RestController
@RequestMapping("/login")
public class LoginController {

    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }

    //Get user logged status

    //Log user in
    @PostMapping
    public ResponseEntity<Object> authenticateUser(@Valid @RequestBody LoginRequestDTO loginRequestDTO){
        LoginResponseDTO loginResponseDTO = loginService.authenticateUser(loginRequestDTO);
        return new ResponseEntity<>(loginResponseDTO, HttpStatus.OK);
    }

    //Logout user
}
