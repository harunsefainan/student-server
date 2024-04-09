package com.harunsefainan.studentserver.models;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class StudentServerModel {

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("tcNo")
    private String tcNo;

    @JsonProperty("birthDate")
    private String birthDate;

    @JsonProperty("registrationDate")
    private String registrationDate;

    @JsonProperty("courseTime")
    private int courseTime;

}
