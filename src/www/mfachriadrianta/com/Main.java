package www.mfachriadrianta.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        checkingLogin();
    }

    private static void checkingLogin(){

        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("database.txt");
            bufferedReader = new BufferedReader(fileReader);
            String dataUsername = bufferedReader.readLine();
            String dataPassword = bufferedReader.readLine();
            boolean next = true;

            while (next){
            clearScreen();
            System.out.println("");
            System.out.println("Login");
            Scanner systemInput = new Scanner(System.in);
            String edt_username, edt_password;
            System.out.print("Username : ");
            edt_username = systemInput.nextLine();
            System.out.print("Password : ");
            edt_password = systemInput.nextLine();

                if(!edt_username.equalsIgnoreCase(dataUsername) && !edt_password.equalsIgnoreCase(dataPassword)){
                    System.out.println("Login failed!");
                    next = repeatMessage("Are you want next ? ");
                } else {
                    dashboardMenu();
                    next = false;
                }
            }
            }catch (Exception e){
            System.err.println("Nothing data");
            }
    }

    private static boolean repeatMessage(String message){
        Scanner inputOne = new Scanner(System.in);
        System.out.print(message + "Yes or No ?");
        String inputUser = inputOne.next();

        while (!inputUser.equalsIgnoreCase("Yes") && !inputUser.equalsIgnoreCase("No")){
            System.err.println("Your only choice Yes or No!");
            inputUser = inputOne.next();
            System.out.print(message);
        }

        return inputUser.equalsIgnoreCase("Yes");
    }

    private static void dashboardMenu() throws IOException {
        Scanner inputMenu = new Scanner(System.in);
        String inputUserMenu;
        boolean nexttwo = true;
        while (nexttwo){
            System.out.println("Dashboard Menu");
            System.out.println("1. Calculation Fragment");
            System.out.println("2. Calculation Convertation Unit");
            System.out.println("3. Calculation Speed");
            System.out.println("4. Calculation ");
            System.out.print("How many your choice menu ?");
            inputUserMenu = inputMenu.nextLine();
            switch (inputUserMenu){
            case "1" :
                    calculationFragment();
                break;
                case "2":
                    calculationConvertationUnit();
                break;
            default:
                System.out.println("Not found menu!");
        }
            nexttwo = repeatMessage("Are you want next ?");
        }
    }

    private static void calculationFragment() throws IOException{
        System.out.println("Fragment");
    }

    private static void calculationConvertationUnit() throws IOException {
        System.out.println("Convertation Unit");
    }
    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143");
            }
        }catch (Exception e){
            System.err.println("Can not proccess clear system!");
        }
    }
}
