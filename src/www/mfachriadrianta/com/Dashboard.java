package www.mfachriadrianta.com;

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
                    calculationFragment();
                    break;
                case "2":
                    calculationConvertationUnit();
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

    private static void calculationFragment(){
        System.out.println("Fragment");
    }

    private static void calculationConvertationUnit(){
        System.out.println("Convertation Unit");
    }

    private static void calculationSpeed(){
        Scanner valueInput = new Scanner(System.in);
        Float valueSpeed, valueTimeStart, valueTimeFinish;
        System.out.print("Speed average per hour : ");
        valueSpeed = valueInput.nextFloat();
        System.out.print("Time start : ");
        valueTimeStart = valueInput.nextFloat();
        System.out.print("Time finish : ");
        valueTimeFinish = valueInput.nextFloat();
        System.out.println("Traveling time : " + (valueTimeFinish - valueTimeStart) + " Clock");
        System.out.println("Distance time  : " + (valueSpeed * (valueTimeFinish - valueTimeStart) + " Km"));
    }

    private static void calculationKPKandFPB(){
        Scanner valueKPKandFPB = new Scanner(System.in);
        Integer inputValueKPKandFPBOne, inputValueKPKandFPBTwo, a, b, c, KPK, FPB;
        inputValueKPKandFPBOne = valueKPKandFPB.nextInt();
        inputValueKPKandFPBTwo = valueKPKandFPB.nextInt();

    }

    private static void calculationScalaMap(){
        Scanner valueScala = new Scanner(System.in);
        String inputDistanceFromMap, inputDistanceActually;
        Integer inputScalaInt, valueScalaOriginal;
        valueScalaOriginal = 10;
        System.out.print("Distance value : " );
        inputScalaInt = valueScala.nextInt();
        System.out.print("Distance from map : ");
        inputDistanceFromMap = valueScala.next();
        System.out.print("Distance actually : ");
        inputDistanceActually = valueScala.next();

        if (!inputDistanceFromMap.equalsIgnoreCase("km") &&
            !inputDistanceFromMap.equalsIgnoreCase("hm") &&
            !inputDistanceFromMap.equalsIgnoreCase("dam") &&
            !inputDistanceFromMap.equalsIgnoreCase("m") &&
            !inputDistanceFromMap.equalsIgnoreCase("dm") &&
            !inputDistanceFromMap.equalsIgnoreCase("cm") &&
            !inputDistanceFromMap.equalsIgnoreCase("mm") &&
            !inputDistanceActually.equalsIgnoreCase("km") &&
            !inputDistanceActually.equalsIgnoreCase("hm") &&
            !inputDistanceActually.equalsIgnoreCase("dam") &&
            !inputDistanceActually.equalsIgnoreCase("m") &&
            !inputDistanceActually.equalsIgnoreCase("dm") &&
            !inputDistanceActually.equalsIgnoreCase("cm") &&
            !inputDistanceActually.equalsIgnoreCase("mm")){
            System.out.println("Nothing!");
        }

        if (inputDistanceFromMap.equalsIgnoreCase("km") &&
            inputDistanceFromMap.equalsIgnoreCase("hm") &&
            inputDistanceFromMap.equalsIgnoreCase("dam") &&
            inputDistanceFromMap.equalsIgnoreCase("m") &&
            inputDistanceFromMap.equalsIgnoreCase("dm") &&
            inputDistanceFromMap.equalsIgnoreCase("cm") &&
            inputDistanceFromMap.equalsIgnoreCase("mm") &&
            inputDistanceActually.equalsIgnoreCase("km") &&
            inputDistanceActually.equalsIgnoreCase("hm") &&
            inputDistanceActually.equalsIgnoreCase("dam") &&
            inputDistanceActually.equalsIgnoreCase("m") &&
            inputDistanceActually.equalsIgnoreCase("dm") &&
            inputDistanceActually.equalsIgnoreCase("cm") &&
            inputDistanceActually.equalsIgnoreCase("mm")){
//            if (inputDistanceFromMap.equalsIgnoreCase("km") &&
//                inputDistanceActually.equalsIgnoreCase("cm")) {
//            }
                System.out.println(inputScalaInt * valueScalaOriginal);
        }

//        if (inputDistanceFromMap.equalsIgnoreCase("km") &&
//            inputDistanceFromMap.equalsIgnoreCase("dam")){
//            System.out.println(valueScalaOriginal * valueScalaOriginal++);
//        }
//
//        if (inputDistanceFromMap.equalsIgnoreCase())
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
