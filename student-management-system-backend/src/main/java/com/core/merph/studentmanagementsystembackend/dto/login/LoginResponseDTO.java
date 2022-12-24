package com.core.merph.studentmanagementsystembackend.dto.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoginResponseDTO implements Serializable {

    private String token;

    private String message;

    @JsonProperty("is_success")
    private boolean isSuccess;

    @JsonProperty("created_at")
    private Date createdAt;

}
