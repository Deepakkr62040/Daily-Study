package Java.dataType;

import java.util.Scanner;

public class PreDefinedSign {
    public void signIn(String userName, String userPassword){
        if(userName.equals("anand@gmail.com")&& userPassword.equals("123456")){
            System.out.println("Welcome Anand");
        } 
        else{
            System.out.println("Invalid username or password:");
        }
    }
}

class SignIn{
    public void signIn(){
        Scanner sc=new Scanner(System.in);
        PreDefinedSign pre=new PreDefinedSign();

        System.out.println("Enter user name: ");
        String userName=sc.nextLine();

        System.out.println("Enter user password: ");
        String userPassword=sc.nextLine();
        pre.signIn(userName, userPassword);

        sc.close();

    }
}
