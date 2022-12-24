package com.core.merph.studentmanagementsystembackend.dto.login;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */

@AllArgsConstructor
@Getter
@Setter
public class LoginRequestDTO implements Serializable {

    @NotNull(message = "username can not be null")
    @NotEmpty(message = "username can not be empty")
    private String username;

    @NotNull(message = "password can not be null")
    @NotEmpty(message = "password can not be empty")
    private String password;

}
