package com.core.merph.studentmanagementsystembackend.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */


@Entity(name = "teachers")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Teacher extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

}
