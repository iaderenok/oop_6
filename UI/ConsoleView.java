package UI;

import java.util.Scanner;

import Core.MVP.View;
import CustomExceptions.EmailException;
import CustomExceptions.PhoneException;

public class ConsoleView implements View, EmailException, PhoneException {
    Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }
    @Override
    public String getFirstName() {
        System.out.printf("FirstName: ");
        return in.nextLine();
    }

    @Override
    public void setFirstName(String value) {
        System.out.printf("FirstName: %s\n", value);
    }

    @Override
    public String getLastName() {
        System.out.printf("LastName: ");
        return in.nextLine();
    }

    @Override
    public void setLastName(String value) {
        System.out.printf("LastName: %s\n", value);
    }

    @Override
    public String getDescription() {
        System.out.printf("Description: ");
        return in.nextLine();
    }

    @Override
    public void setDescription(String value) {
        System.out.printf("Description: %s\n", value);        
    }
    public String getEmail(){
        System.out.printf("Email: ");
        return in.nextLine();
    }
    public void setEmail(String value){
        int index_gmail = value.indexOf("@gmail.com");
        int index_mail = value.indexOf("@mail.ru");
        if (index_gmail!= -1 || index_mail!=-1){
            System.out.printf("Email: %s\n", value);
        }
else{
        System.out.println("Email: " + value + " is wrong email");
    }      
    }
    public String getPhone(){
        System.out.printf("Phone: ");
        return in.nextLine();
    }
    public void setPhone(String value){
        int index_phone_rus = value.indexOf("89");
        if (index_phone_rus!= -1 && value.length()==11){
            System.out.printf("Phone: %s\n", value);
        }
else{
        System.out.println("Phone: " + value + " is wrong phone");
    }      
}
}
