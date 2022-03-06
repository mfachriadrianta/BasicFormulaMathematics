package www.mfachriadrianta.com.controller;

import www.mfachriadrianta.com.scanning.ScanningInput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Operation {

    static ScanningInput scanningInput = new ScanningInput();
    static CalculationFragment calculation = new CalculationFragment();
    static CalculationConvertationUnit calculationConvertationUnit = new CalculationConvertationUnit();
    static CalculationSpeed calculationSpeed = new CalculationSpeed();
    static CalculationFPBandKPK calculationFPBandKPK = new CalculationFPBandKPK();
    static CalculationScalaMap calculationScalaMap = new CalculationScalaMap();

    public static void operationFragment(){
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

    public static void operationConvertationUnit() throws IOException{
        calculationConvertationUnit.convertationUnit(true);
    }

    public static void operationSpeed(){
        calculationSpeed.calculationSpeed();
    }

    public static void operationKPKandFPB(){
        calculationFPBandKPK.KPKandFPB();
    }

    public static void operationScalaMap(){
        calculationScalaMap.calculationScalaMap();
    }
}
