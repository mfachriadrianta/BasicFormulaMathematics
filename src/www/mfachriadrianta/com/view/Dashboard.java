package www.mfachriadrianta.com.view;

import www.mfachriadrianta.com.scanning.ScanningInput;
import www.mfachriadrianta.com.controller.Operation;

import java.io.IOException;
import java.util.Scanner;

public class Dashboard {

    static Operation operation = new Operation();
    static ScanningInput scanningInput = new ScanningInput();
    String inputUserMenu;
    public void menuDashboard() throws IOException{
        boolean nexttwo = true;
        while (nexttwo) {
            System.out.println("=== Dashboard Menu ===");
            System.out.println("1. Calculation Fragment");
            System.out.println("2. Calculation Convertation Unit");
            System.out.println("3. Calculation Speed");
            System.out.println("4. Calculation KPK and FPB");
            System.out.println("5. Calculation Scala Map");
            System.out.print("How many your choice menu ?");
            inputUserMenu = scanningInput.Scan().nextLine();
            switch (inputUserMenu) {
                case "1":
                    gettingOperationFragment();
                    break;
                case "2":
                    gettingOperationConvertationUnit();
                    break;
                case "3":
                    gettingOperationSpeed();
                    break;
                case "4":
                    gettingOperationKPKandFPB();
                    break;
                case "5":
                    gettingOperationScalaMap();
                    break;
                default:
                    System.out.println("Not found menu!");
            }
                nexttwo = repeatMessageTwo("Are you want next! ");
        }
    }

    private static void gettingOperationFragment(){
        operation.operationFragment();
    }

    private static void gettingOperationConvertationUnit() throws IOException {
        operation.operationConvertationUnit(true);
    }

    private static void gettingOperationSpeed(){
        operation.operationSpeed();
    }

    private static void gettingOperationKPKandFPB(){
        operation.operationKPKandFPB();
    }

    private static void gettingOperationScalaMap(){
        operation.operationScalaMap();
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
            System.err.println("No can't clear system");
        }
    }

}
