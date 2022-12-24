package com.core.merph.studentmanagementsystembackend.service;

import com.core.merph.studentmanagementsystembackend.dto.login.LoginRequestDTO;
import com.core.merph.studentmanagementsystembackend.dto.login.LoginResponseDTO;
import com.core.merph.studentmanagementsystembackend.exception.LoginException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */

@Service
@Slf4j
public class SMSLoginService implements LoginService{

    @Override
    public LoginResponseDTO authenticateUser(LoginRequestDTO loginRequestDTO) {
        LoginResponseDTO loginResponseDTO = new LoginResponseDTO();
        //TODO : call and convert response from auth service authenticate API.
        try{

        }catch (Exception ex){
            log.error("Error occurred while authenticating user with error : {}" , ex.getMessage());
            throw new LoginException("Authentication failed", HttpStatus.UNAUTHORIZED);
        }
        return loginResponseDTO;
    }

}
