package com.project1.PhysiqueFirstGym.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class UserData {
    @Id
    @SequenceGenerator(name = "MY_ENTITY_SEQ_2", sequenceName = "MY_ENTITY_SEQ_2", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "MY_ENTITY_SEQ_2" )
    private Long userId;
    @NotBlank(message = "Please enter your name")
    private String name;
    private Long age;
    private String gender;
    private Long contact;

    public UserData() {
    }

    public UserData(Long userId, String name, Long age, String gender, Long contact) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
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

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", contact=" + contact +
                '}';
    }
}
