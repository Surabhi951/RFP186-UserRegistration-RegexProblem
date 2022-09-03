package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationRegex {


    public void validFirstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(firstName);
        if(match.matches()){
            System.out.println("First name is valid");
        }
        else {
            System.out.println("First name is invalid");
        }
    }


    public void validLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(lastName);
        if(match.matches()){
            System.out.println("Last name is valid");
        }
        else {
            System.out.println("Last name is invalid");
        }
    }

    public void validEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@(.+)$");
        Matcher match = pattern.matcher(email);
        if(match.matches()){
            System.out.println("email is valid");
        }
        else {
            System.out.println("email is invalid");
        }
    }

    public void validMobileNo(String mobileNo) {
        Pattern pattern = Pattern.compile("^[\\d]{2}\\s[\\d]{10}$");
        Matcher match = pattern.matcher(mobileNo);
        if(match.matches()){
            System.out.println("Mobile number is valid");
        }
        else {
            System.out.println("Mobile number is invalid");
        }
    }

    public void passwordRule1(String passwordRule1) {
        Pattern pattern = Pattern.compile("[0-9a-zA-Z@!+_.-]{8,}");
        Matcher match = pattern.matcher(passwordRule1);
        if(match.matches()){
            System.out.println("Valid");
        }
        else {
            System.out.println("Password must have 8 character");
        }
    }

    public void passwordRule2(String passwordRule2) {
        Pattern pattern = Pattern.compile("(?=.*[A-Z])[0-9a-zA-Z@!+_.]{8,}");
        Matcher match = pattern.matcher(passwordRule2);
        if(match.matches()){
            System.out.println("Valid");
        }
        else {
            System.out.println("Password must have atleast one uppercase letter");
        }
    }

}
