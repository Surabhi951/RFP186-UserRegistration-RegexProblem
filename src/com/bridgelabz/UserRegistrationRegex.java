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
}
