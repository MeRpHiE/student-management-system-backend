package com.core.merph.studentmanagementsystembackend.service;

import com.core.merph.studentmanagementsystembackend.dto.login.LoginRequestDTO;
import com.core.merph.studentmanagementsystembackend.dto.login.LoginResponseDTO;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */
public interface LoginService {

    LoginResponseDTO authenticateUser(LoginRequestDTO loginRequestDTO);

}
