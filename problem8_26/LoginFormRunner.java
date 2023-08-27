package problem8_26;

import java.util.Scanner;

public class LoginFormRunner {
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm("tasnim233","123abc");
        Scanner scanner = new Scanner(System.in);
        while (!loginForm.loggedIn()){
            System.out.println("Login Form");
            System.out.println("Enter Username");
            String userName = scanner.next();
            loginForm.input("Username",userName);
            System.out.println("Enter password :");
            String password = scanner.next();
            loginForm.input("Password",password);
            loginForm.click("Submit");
        }
        System.out.println("Login Successfull");
    }
}
