package com.core.merph.studentmanagementsystembackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author MeRpHiEa
 * e-mail : asiri.abayakoon@gmail.com
 */

@Entity(name = "assignments")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Assignment extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

}
