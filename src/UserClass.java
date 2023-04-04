// used this to understand interfaces

import java.util.Scanner;

public class UserClass implements IStudent{

    @Override
    public void setUserType() {
        boolean userIsStudent = true;
        System.out.println("User is a student: " + userIsStudent);
    }

    public static void collectUser() {
        try {
            Scanner scan = new Scanner(System.in);

            String name, email, school, courseOfStudy;
                
            System.out.println("Enter your name:");
            name = scan.nextLine();
    
            System.out.println("Enter your email:");
            email = scan.nextLine();
    
            System.out.println("Enter your school:");
            school = scan.nextLine();
    
            System.out.println("Enter your course of study:");
            courseOfStudy = scan.nextLine();
    
            scan.close(); // close the scanner
    
            // confirmation message
            System.out.println("Your name is: " + name + '\n' + "Your email is: " + email + '\n' + "Your school is: " + school + '\n' + "Your course of study is: " + courseOfStudy);
        } 
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}


