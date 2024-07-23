package Email_package;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private String alternateEmail;
    private String companySuffix = "riteshacompany.com";
    private int mailbox_Capacity=10;


    // constructor to receive firstname and lastname

    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        //call a method asking for department - return the department
       this.department=setDepartment();
       System.out.println("Department: " + this.department);

       //call a method that return random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " +this.password);

        //combine elements to generate Email
        email = firstName.toLowerCase()+"." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email: " + email);
    }

    //ask for the department

    private String setDepartment(){
        System.out.println("New Worker: "+ firstName +" Enter the department\n1 for sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1){return "Sales";}
        else if(depChoice == 2){return "Department";}
        else if(depChoice == 3){return "Accounting";}
        else{return "";}
    }

    // generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
         for(int i=0;i<length;i++){
             int rand = (int) (Math.random() * passwordSet.length()); //passwordSet.length() = 41 ,so rand
                                            // m 41 tak ke range m value mil raha
             password[i]=passwordSet.charAt(rand);
         }
         return new String(password); //---as password is string
    }

    //set the mailboxCapacity
    public void setMailBoxCapacity(int capacity){
        this.mailbox_Capacity=capacity;
    }

    //set alternate email
    public void setAlternateEmail(String altEmail){
        alternateEmail=altEmail;
    }

    //change the password
    public void changePassword(String password){
        this.password=password;
    }

    //to get all
    public  int getMailBoxCapacity(){return mailbox_Capacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return  password;}

    //show all infor
    public String shoeInfor(){
        return ("DISPLAY NAME: " +  firstName + " " + lastName + "\n"+
                "COMPANY NAME: " + email + "\n"+
                "MAILBOX CAPACITY: "+ mailbox_Capacity);
    }
}
