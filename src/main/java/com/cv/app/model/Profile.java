package com.cv.app.model;

import javax.persistence.Entity;

@Entity
public class Profile extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String aboutMe;
    private String nicknames; // separated by comma ','

    public Profile() {
    }

    public Profile(String firstName, String lastName, String email, String phoneNumber, String aboutMe, String nicknames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.aboutMe = aboutMe;
        this.nicknames = nicknames;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getNicknames() {
        return nicknames;
    }

    public void setNicknames(String nicknames) {
        this.nicknames = nicknames;
    }
}
