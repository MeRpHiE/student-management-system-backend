package com.core.merph.studentmanagementsystembackend.entity;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */
public class BaseEntity {

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "created_date_time")
    private Date createdDateTime;

    @Column(name = "updated_date_time")
    private Date updatedDateTime;

    @Column(name = "is_deleted")
    private boolean isDeleted;
}
