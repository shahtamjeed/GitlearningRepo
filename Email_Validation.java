package com.company;
import java.util.Scanner;

class Email02{
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
        Email02 obj=new Email02();
        obj.isValid();
    }
}

//class task02{
//    void name01(){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your name here.");
//        String username=sc.next();
//        for(int i=0;i<username.length();i++){
//            System.out.println(username.charAt(i));
//        }
//    }
//
//    public static void main(String[] args) {
//       task02 obj=new task02();
//       obj.name01();
//    }
//}

//class task03{
//    void reverseName(){
//     Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the sentence to reverse it.");
//        String sentence= sc.nextLine();
//        for(int i=sentence.length()-1;i>=0;i--){
//            System.out.print(sentence.charAt(i));
//        }
//    }
//
//    public static void main(String[] args) {
//        task03 obj=new task03();
//        obj.reverseName();
//    }
//}