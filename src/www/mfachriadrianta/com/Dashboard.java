package www.mfachriadrianta.com;

import java.io.IOException;
import java.util.Scanner;

public class Dashboard {

    public void menuDashboard() throws IOException {
        Scanner inputMenu = new Scanner(System.in);
        String inputUserMenu;
        boolean nexttwo = true;
        while (nexttwo) {
            System.out.println("Dashboard Menu");
            System.out.println("1. Calculation Fragment");
            System.out.println("2. Calculation Convertation Unit");
            System.out.println("3. Calculation Speed");
            System.out.println("4. Calculation ");
            System.out.print("How many your choice menu ?");
            inputUserMenu = inputMenu.nextLine();
            switch (inputUserMenu) {
                case "1":
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

    private static void calculationFragment(){
        System.out.println("Fragment");
    }

    private static void calculationConvertationUnit(){
        System.out.println("Convertation Unit");
    }

    private static boolean repeatMessage(String message){
        Scanner inputOne = new Scanner(System.in);
        System.out.print(message + "Yes or No ?");
        String inputUser = inputOne.nextLine();

        while (!inputUser.equalsIgnoreCase("Yes") && !inputUser.equalsIgnoreCase("No")){
            System.err.print("Your only choice Yes or No!");
            inputUser = inputOne.nextLine();
            System.out.print(message);
        }

        return inputUser.equalsIgnoreCase("Yes");
    }
}
