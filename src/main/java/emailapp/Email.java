package emailapp;

import java.util.Scanner;
//import org.apache.commons.lang.RandomStringUtils;

public class Email
{
    /*
    Project 1
    Email Application

    Scenario: You are an IT Support Administrator Specialist and are
    charged with the task of creating email accounts for new hires.

    Your application should do the following:
    * Generate an email with the following syntax: firstname.lastname@department.company.com
    * Determine the department (sales, development, accounting), if none leave blank
    * Generate a random String for a password
    * Have set methods to change the password, set the mailbox capacity, and define an alternate
      email address
    * Have get methods to display the name, email, and mailbox capacity
    */
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int emailboxCapacity;
    private String alternateEmail;

    private Email () {}

    // Constructor to receive the first and last name
    public Email (String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + firstName + " " + lastName);
        this.department = setDepartment();
    }
    // Constructor to receive the first name, last name and department
    private Email (String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
    }
    // Ask for the department

    private String setDepartment() {
        System.out.println("Enter the department by number\n1: Sales\n2: Development\n3: Accounting\n0: None");
        Scanner depIn = new Scanner(System.in);
        int depNum = depIn.nextInt();

        /*
        String depOut = null;
        if (depNum == 1){
            depOut = "Sales";
        } else if (depNum == 2){
            depOut = "Development";
        } else if (depNum == 3) {
            depOut = "Accounting";
        } else {
            depOut = "";
        }
        */
        /*
        String depOut = null;
        switch (depNum) {
            case 1:
                depOut = "Sales";
                break;
            case 2:
                depOut = "Development";
                break;
            case 3:
                depOut = "Accounting";
                break;
            case 0:
                depOut = "";
                break;
        }
        */

        String depOut = switch (depNum) {
            case 1 -> "Sales";
            case 2 -> "Development";
            case 3 -> "Accounting";
            case 0 -> "";
            default -> null;
        };

        System.out.println(depOut);
        return depOut;
    };

    // Generate a random password

    private String generatePassword(){
        return "";
    };

    // Set the mailbox capacity

    // Set the alternate mail

    // Change the password
}
