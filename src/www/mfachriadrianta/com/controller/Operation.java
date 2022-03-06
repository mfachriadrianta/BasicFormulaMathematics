package www.mfachriadrianta.com.controller;

import www.mfachriadrianta.com.scanning.ScanningInput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Operation {

    static ScanningInput scanningInput = new ScanningInput();

    public static void operationFragment(){
        CalculationFragment calculation = new CalculationFragment();
        String inputUserMenuFragment;
        System.out.println("=== List Operation Fragment ===");
        System.out.println("1. Fragment normal");
        System.out.println("2. Fragment mixture");
        System.out.println("3. Fragment decimal");
        System.out.println("4. Fragment percent");
        System.out.println("5. Fragment permil");
        System.out.print("Input number operation fragment : ");
        inputUserMenuFragment = scanningInput.Scan().nextLine();
        switch (inputUserMenuFragment){
            case "1":
                calculation.calculationFragmentNormal();
                break;
            case "2":
                calculation.calculationFragmentMixture();
                break;
            case "3":
                calculation.calculationFragmentDecimal();
                break;
            case "4":
                calculation.calculationFragmentPercent();
                break;
            case "5":
                calculation.calculationFragmentPermil();
                break;
            default:
                System.err.println("\nNot found operation!");
        }
    }

    public static void operationConvertationUnit(boolean isDisplay) throws IOException{
        try {
            File file = new File("database.txt");
        } catch (Exception e) {
            System.err.println("Database not found");
        }

        FileReader fileReader = new FileReader("database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        Scanner input = new Scanner(System.in);
        System.out.print("Checking convertation unit : ");
        String checkingConvertationUnit, dataConvertationUnit;
        checkingConvertationUnit = input.nextLine();
        dataConvertationUnit = bufferedReader.readLine();
        String[] keywordConvertationUnit = checkingConvertationUnit.split("\\s+");
        boolean isExist;

        while (dataConvertationUnit != null) {
            isExist = true;
            for (String repeatcheckingUnit : keywordConvertationUnit) {
                isExist = isExist && dataConvertationUnit.toLowerCase().contains(repeatcheckingUnit.toLowerCase());
            }
            if (isExist) {
                if (isDisplay) {
                    System.out.println(dataConvertationUnit);
                }
            }

            dataConvertationUnit = bufferedReader.readLine();
        }
    }

    public static void operationSpeed(){
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

    public static void operationKPKandFPB(){
        Scanner valueKPKandFPB = new Scanner(System.in);
        Integer inputValueKPKandFPBOne, inputValueKPKandFPBTwo, a, b, c, KPK, FPB;
        inputValueKPKandFPBOne = valueKPKandFPB.nextInt();
        inputValueKPKandFPBTwo = valueKPKandFPB.nextInt();
    }

    public static void operationScalaMap(){
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

//        if (!inputDistanceFromMap.equalsIgnoreCase("km") &&
//            !inputDistanceFromMap.equalsIgnoreCase("hm") &&
//            !inputDistanceFromMap.equalsIgnoreCase("dam") &&
//            !inputDistanceFromMap.equalsIgnoreCase("m") &&
//            !inputDistanceFromMap.equalsIgnoreCase("dm") &&
//            !inputDistanceFromMap.equalsIgnoreCase("cm") &&
//            !inputDistanceFromMap.equalsIgnoreCase("mm") &&
//            !inputDistanceActually.equalsIgnoreCase("km") &&
//            !inputDistanceActually.equalsIgnoreCase("hm") &&
//            !inputDistanceActually.equalsIgnoreCase("dam") &&
//            !inputDistanceActually.equalsIgnoreCase("m") &&
//            !inputDistanceActually.equalsIgnoreCase("dm") &&
//            !inputDistanceActually.equalsIgnoreCase("cm") &&
//            !inputDistanceActually.equalsIgnoreCase("mm")){
//            System.out.println("Nothing!");
//        }
//
//        if (inputDistanceFromMap.equalsIgnoreCase("km") &&
//            inputDistanceFromMap.equalsIgnoreCase("hm") &&
//            inputDistanceFromMap.equalsIgnoreCase("dam") &&
//            inputDistanceFromMap.equalsIgnoreCase("m") &&
//            inputDistanceFromMap.equalsIgnoreCase("dm") &&
//            inputDistanceFromMap.equalsIgnoreCase("cm") &&
//            inputDistanceFromMap.equalsIgnoreCase("mm") &&
//            inputDistanceActually.equalsIgnoreCase("km") &&
//            inputDistanceActually.equalsIgnoreCase("hm") &&
//            inputDistanceActually.equalsIgnoreCase("dam") &&
//            inputDistanceActually.equalsIgnoreCase("m") &&
//            inputDistanceActually.equalsIgnoreCase("dm") &&
//            inputDistanceActually.equalsIgnoreCase("cm") &&
//            inputDistanceActually.equalsIgnoreCase("mm")){
////            if (inputDistanceFromMap.equalsIgnoreCase("km") &&
////                inputDistanceActually.equalsIgnoreCase("cm")) {
////            }
//                System.out.println(inputScalaInt * valueScalaOriginal);
//        }
//
////        if (inputDistanceFromMap.equalsIgnoreCase("km") &&
////            inputDistanceFromMap.equalsIgnoreCase("dam")){
////            System.out.println(valueScalaOriginal * valueScalaOriginal++);
////        }
////
////        if (inputDistanceFromMap.equalsIgnoreCase())
    }
}
