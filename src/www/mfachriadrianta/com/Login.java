package www.mfachriadrianta.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws IOException {
        checkingData();
    }

    private static void checkingData() throws IOException{

        FileReader fileReader;
        BufferedReader bufferedReader;
        System.out.println("Login");
        try {
            fileReader = new FileReader("database.txt");
            bufferedReader = new BufferedReader(fileReader);
            String dataUsername = bufferedReader.readLine();
            String dataPassword = bufferedReader.readLine();
            Scanner systemInput = new Scanner(System.in);
            String edt_username, edt_password;
            System.out.print("Username : ");
            edt_username = systemInput.nextLine();
            System.out.print("Password : ");
            edt_password = systemInput.nextLine();
            if(!edt_username.equalsIgnoreCase(dataUsername) && !edt_password.equalsIgnoreCase(dataPassword)){
                clearScreen();
            } else {
                Intent
            }

            }catch (Exception e){
            System.err.println("Nothing data");
            }
    }

    private static void clearScreen(){
        try {
            if (){

            }
        }catch (Exception e){
            System.err.println("Can not proccess system!");
        }
    }
}
