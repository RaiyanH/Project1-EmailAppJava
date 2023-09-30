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

    // Constructor to receive the first and last name
    public Email (String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + firstName + " " + lastName);
        this.department = setDepartment();
        this.password = generatePassword();
    }

    // Ask for the department

    private String setDepartment() {
        System.out.println("DEPARTMENT CODES:\n1: Sales\n2: Development\n3: Accounting\n0: None\nType department code below:");
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
            default -> "Insert a DEPARTMENT CODE from between 0 to 4";
        };

        System.out.println(depOut);
        return depOut;
    };

    // Generate a random password

    private String generatePassword(){

        String lowerCase = "qwertyuiopasdfghjklzxcvbnm";
        String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String number = "1234567890";
        String characters = "!£$%&#?@";

        /*
        Note:
        Math.random() gives a random number between 0 and 1 (or referred as 1 unit).

        1. To get a random number between 0 to n, we have to do Math.random * n
        Eg: Random number between 0 to 8 requires a transformation of 8,
            Math.random * 8;

        2. To get a random number between x to y, where x is not starting from 0, we have to do Math.random + or - x
        Eg: Random number between 3 and 4 requires a translation of 3:
            Math.random + 3;

        3. Tp get a random number between x to y, where x is not starting from 0 and range is more than 1 unit (i.e. y is not x + 1),
        we have to do both translation and transformation
        Eg: Random number between 3 to 8 requires a translation of 3 and a transformation of 5 (since between 3 & 8 there is an increase of 5 units):
            (Math.random + 3) * 5

         */

        int pwdlength = 10;
        String pwd = "";

        for (int i = 0; i < pwdlength; i++){

            int rand = (int) (Math.random() * 4);

            switch (rand) {
                case 0:
                    rand = (int) (Math.random() * lowerCase.length());
                    pwd += String.valueOf(lowerCase.charAt(rand));
                    break;
                case 1:
                    rand = (int) (Math.random() * upperCase.length());
                    pwd += String.valueOf(upperCase.charAt(rand));
                    break;
                case 2:
                    rand = (int) (Math.random() * number.length());
                    pwd += String.valueOf(number.charAt(rand));
                    break;
                case 3:
                    rand = (int) (Math.random() * characters.length());
                    pwd += String.valueOf(characters.charAt(rand));
                    break;
            }

        }

        System.out.println("Your email PASSWORD is as follows: \n" + pwd);

        return pwd;
    };

    // Set the mailbox capacity



    // Set the alternate mail

    // Change the password
}
