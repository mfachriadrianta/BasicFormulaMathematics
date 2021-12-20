package www.mfachriadrianta.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Dashboard {

    public void menuDashboard() throws IOException{
        Scanner inputMenu = new Scanner(System.in);
        String inputUserMenu;
        boolean nexttwo = true;
        while (nexttwo) {
            System.out.println("Dashboard Menu");
            System.out.println("1. Calculation Fragment");
            System.out.println("2. Calculation Convertation Unit");
            System.out.println("3. Calculation Speed");
            System.out.println("4. Calculation KPK and FPB");
            System.out.println("5. Calculation Scala Map");
            System.out.print("How many your choice menu ?");
            inputUserMenu = inputMenu.nextLine();
            switch (inputUserMenu) {
                case "1":
                    callCalculationFragment();
                    break;
                case "2":
                    callCalculationConvertationUnit();
                    break;
                case "3":
                    callCalculationSpeed();
                    break;
                case "4":
                    callCalculationKPKandFPB();
                    break;
                case "5":
                    callCalculationScalaMap();
                    break;
                default:
                    System.out.println("Not found menu!");
            }
                nexttwo = repeatMessageTwo("Are you want next! ");
        }
    }

    public static void callCalculationFragment() throws IOException{
        Operation operation = new Operation();
        operation.calculationFragment();
    }

    public static void callCalculationConvertationUnit() throws IOException{
        Operation operation = new Operation();
        operation.calculationConvertationUnit(true);
    }

    public static void callCalculationSpeed() throws IOException{
        Operation operation = new Operation();
        operation.calculationSpeed();
    }

    public static void callCalculationKPKandFPB() throws IOException{
        Operation operation = new Operation();
        operation.calculationKPKandFPB();
    }

    public static void callCalculationScalaMap() throws IOException{
        Operation operation = new Operation();
        operation.calculationScalaMap();
    }

    private static boolean repeatMessageTwo(String message) throws IOException{
        Scanner inputOne = new Scanner(System.in);
        System.out.print(message + "Yes or No?");
        String inputUser = inputOne.nextLine();

        while (!inputUser.equalsIgnoreCase("Yes") && !inputUser.equalsIgnoreCase("No")){
            System.err.println("Your only choice, yes or no!");
            System.out.println("============================");
            if (!inputUser.equalsIgnoreCase("Yes") && !inputUser.equalsIgnoreCase("No")){
                System.out.print(message);
                inputUser = inputOne.nextLine();
            } else {
                clearScreenTwo();
            }
        }

        return inputUser.equalsIgnoreCase("Yes");
    }

    public static void clearScreenTwo() throws IOException{
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        }catch (Exception e){
            System.err.println("No cant clear system");
        }
    }
}
