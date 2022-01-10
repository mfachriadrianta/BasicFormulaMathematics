package www.mfachriadrianta.com.controller;

import java.util.Scanner;

public class Calculation {

    // All operation calculation fragment
    static void calculationFragmentNormal(){
        Scanner input = new Scanner(System.in);
        String inputOperationCalculation;
        Integer inputNumeratorOne, inputNumeratorTwo, inputDenominatorOne, inputDenominatorTwo;
        Integer resultValueNumerator, resultValueDenominator;
        System.out.println("=== List operation calculation ===");
        System.out.println("1. Multiplication (X)");
        System.out.println("2. Distribution (:)");
        System.out.println("3. Addition (+)");
        System.out.println("4. Subtraction (-)");
        System.out.print("Input number operation calculation : ");
        inputOperationCalculation = input.nextLine();
        switch (inputOperationCalculation){
            case "1":
                System.out.print("Input number numerator first : ");
                inputNumeratorOne = input.nextInt();
                System.out.print("Input denominator first : ");
                inputDenominatorOne = input.nextInt();
                System.out.print("Input number numerator second : ");
                inputNumeratorTwo = input.nextInt();
                System.out.print("Input number denominator second : ");
                inputDenominatorTwo = input.nextInt();
                resultValueNumerator = inputNumeratorOne * inputNumeratorTwo;
                resultValueDenominator = inputDenominatorOne * inputDenominatorTwo;
                System.out.println(inputNumeratorOne + "/" + inputDenominatorOne + " X "
                        + inputNumeratorTwo + "/" + inputDenominatorTwo + " = "
                        + resultValueNumerator + "/" +resultValueDenominator);
                break;
            case "2":
                System.out.println("Pembagian");
                break;
            case "3":

                break;
            case "4":
                System.out.println("Pengurangan");
                break;
            default:
                System.err.println("Not found operation calculation");
        }
    }

    static void calculationFragmentMixture(){

    }

    static void calculationFragmentDecimal(){

    }

    static void calculationFragmentPercent(){

    }

    static void calculationFragmentPermil(){

    }
}
