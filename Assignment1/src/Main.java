/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();

        // REGISTER
        System.out.println("Enter username:");
        String username = input.nextLine();

        System.out.println("Enter password:");
        String password = input.nextLine();

        System.out.println("Enter phone (+27...):");
        String phone = input.nextLine();

        String result = login.registerUser(username, password, phone);
        System.out.println(result);

        // LOGIN
        if (result.equals("User successfully registered.")) {

            System.out.println("Login now");

            System.out.println("Username:");
            String loginUser = input.nextLine();

            System.out.println("Password:");
            String loginPass = input.nextLine();

            boolean success = login.loginUser(loginUser, loginPass);
            System.out.println(login.returnLoginStatus(success));
        }
    }
}
