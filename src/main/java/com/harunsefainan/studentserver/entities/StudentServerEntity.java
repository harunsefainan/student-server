package com.harunsefainan.studentserver.entities;

import jakarta.persistence.*;

@Entity
@lombok.Data
@Table(name = "student")
public class StudentServerEntity {

    @Id
    @Column(name = "oid")
    private String oid;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "tc_no")
    private String tcNo;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "registration_date")
    private String registrationDate;

    @Column(name = "course_time")
    private int courseTime;

    @Column(name = "remaining_day")
    private String remainingDay;

    @Column(name = "optime")
    private String optime;

}
