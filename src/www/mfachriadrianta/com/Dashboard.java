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
                    calculationSpeed();
                    break;
                case "4":
                    calculationKPKandFPB();
                    break;
                case "5":
                    calculationScalaMap();
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
}
