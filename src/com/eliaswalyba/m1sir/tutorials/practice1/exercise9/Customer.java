package com.eliaswalyba.m1sir.tutorials.practice1.exercise9;

public class Customer {

    private String identityCardNumber, firstName, lastName, gender;

    public Customer(String identityCardNumber) {
        try {
            this.setIdentityCardNumber(identityCardNumber);
        } catch (IllegalIdentityCardNumberException e) {
            e.printStackTrace();
        }
    }

    public Customer(String identityCardNumber, String fName, String lName, String gender) {
        this(identityCardNumber);
        this.firstName = fName;
        this.lastName = lName;
        this.gender = gender;
    }

    public void setIdentityCardNumber(String identityCardNumber) throws IllegalIdentityCardNumberException {
        if (!identityCardNumber.matches("/^[0-9]{13}$/")) {
            throw new IllegalIdentityCardNumberException();
        } else {
            this.identityCardNumber = identityCardNumber;
        }
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
