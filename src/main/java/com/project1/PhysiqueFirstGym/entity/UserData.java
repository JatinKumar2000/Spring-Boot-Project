package com.project1.PhysiqueFirstGym.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class UserData {
    @Id
    @GeneratedValue
    @Column(name = "UserId")
    private Long userId;
    private String name;
    private Long age;
    private String gender;
    private String email;
    private Long contact;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date joinDate;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "Membership_End_Date")
    private Date membEnddate;   //User Membership end date


    public UserData() {
    }

    public UserData(Long userId, String name, Long age, String gender, String email, Long contact, Date joinDate, Date membEnddate) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.contact = contact;
        this.joinDate = joinDate;
        this.membEnddate = membEnddate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getMembEnddate() {
        return membEnddate;
    }

    public void setMembEnddate(Date membEnddate) {
        this.membEnddate = membEnddate;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", contact=" + contact +
                ", joinDate=" + joinDate +
                ", membEnddate=" + membEnddate +
                '}';
    }
}
