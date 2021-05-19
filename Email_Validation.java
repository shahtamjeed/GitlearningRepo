package com.company;
import java.util.Scanner;

class emailValidation{
    void isValid(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your email here.");
        String email=sc.next();
        int atrate= email.indexOf('@');
        int dot1=email.lastIndexOf('.');
        int dot2=email.indexOf('.');
        if (atrate < dot1) {
            if (atrate < 5 || dot1 - atrate <= 3)
            {
                if(dot1-dot2<=3){

                }
                System.out.println("Invalid email.");
            } else {
                System.out.println("Valid email");
            }
        }

        else {
            System.out.println("Invalid Email.");
        }
    }

    public static void main(String[] args) {
        emailValidation obj=new emailValidation();
        obj.isValid();
    }
}