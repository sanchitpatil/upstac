package org.upgrad.upstac.auth.register;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.upgrad.upstac.users.models.Gender;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RegisterRequest {


    private String userName;

    private String password;
    private String firstName;

    private String email="";

    private String phoneNumber="";


    private String lastName;

    private String address;

    private Integer pinCode;


    private String dateOfBirth;


    private Gender gender;


    public void setUserName(String userNameinLowerCase) {
    }

    public void setPassword(String password) {
    }

    public void setFirstName(String user) {
    }

    public void setLastName(String s) {
    }

    public void setGender(Gender randomGender) {
    }

    public void setAddress(String randomAddress) {
    }

    public void setPhoneNumber(String aPhoneNumber) {
    }

    public void setPinCode(int pincode) {
    }

    public void setDateOfBirth(String randomDateOfBirth) {
    }

    public void setEmail(String s) {
    }
}
