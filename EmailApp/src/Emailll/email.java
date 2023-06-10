package Emailll;

import java.util.Scanner;

public class email {

    private String FirstName;
    private String LastName;
    private String Password;
    private String Department;
    private int MailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "TCS.com";
    private int defaultPasswordLength = 10;
    private String email;

    //constructor to receive the first name and the last name
    email(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        System.out.println("Email created for :" + FirstName + " " + LastName);
        //call a method dept and run the method
        this.Department = setDepartment();
        System.out.println("Depatment :" + this.Department);
        //call a method to generate a random password
        this.Password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is :" + this.Password);
        // combine elements to generate email
        String email = FirstName.toLowerCase() + "." + LastName.toLowerCase() + "@" + Department + "." + companySuffix;
        System.out.println("Your email is " + email);
        this.email = email;
    }


    //Ask for department
    private String setDepartment() {
        System.out.println("Enter the dept code:\n " + "1 : Sales\n 2 : Development\n 3 : Accounting \n 0 : none \n ENTER DEPTCODE:  ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) {
            return "Sales";
        } else if (deptChoice == 2) {
            return "dev";
        } else if (deptChoice == 3) {
            return "acct";
        } else {
            return "";
        }

    }


    //generate a random password
    private String randomPassword(int length) {
        String passwordSet = "asdfhhjlloiytrewqzxcvbnmASDFGHJKLQWERTYUIOPZXCVBNM1234567890@#$%^&*()";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    //set mailbox capacity
    public void MailBoxCapacity(int Capacity) {
        this.MailboxCapacity = Capacity;
    }

    //set alt email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //change password
    public void setchangePassword(String Password1) {
        this.Password = Password1;
    }

    public int getMailboxCapacity() {
        return MailboxCapacity;
    }

    public String getPassword() {
        return Password;
    }

    public String getaltEmail() {
        return alternateEmail;
    }

    public void showInfo() {
        System.out.println("Name :" + FirstName + " " + LastName + "\n" + "Email :" + email + "\nMailbox capacity :" + MailboxCapacity+ "Alt email :"+ alternateEmail+"Password :"+ Password);
    }

}

