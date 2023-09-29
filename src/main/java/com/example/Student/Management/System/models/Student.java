package com.example.Student.Management.System.models;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "st_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "FirstName")
    private String fName;
    @Column(name = "LastName")
    private String lName;
    @Column(name = "Email")
    private String email;
    @Column(name = "PhoneNumber")
    private Long pNumber;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "DateofBirth")
    private java.sql.Date dateOfBirth;

    //getters and setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getpNumber() {
        return pNumber;
    }

    public void setpNumber(Long pNumber) {
        this.pNumber = pNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
