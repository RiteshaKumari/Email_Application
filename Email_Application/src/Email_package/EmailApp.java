package Email_package;

public class EmailApp {

    public static void main(String[] args) {

        Email emp=new Email("Chandrayan","pragyan");
         
        emp.setAlternateEmail("rit@gmail.com");
        System.out.println(emp.getAlternateEmail());

        System.out.println(emp.shoeInfor());
    }
}
