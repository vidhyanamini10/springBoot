package com.cislibrary.library.model;

import lombok.Getter;

@Getter
public class Member {

    private long memberId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
