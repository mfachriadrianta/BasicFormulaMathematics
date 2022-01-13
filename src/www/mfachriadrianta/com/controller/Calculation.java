package www.mfachriadrianta.com.controller;

import java.util.Scanner;

public class Calculation {

    // All operation calculation fragment
    static void calculationFragmentNormal(){
        Scanner input = new Scanner(System.in);
        String inputOperationCalculation;
        System.out.println("=== List operation calculation ===");
        System.out.println("1. Multiplication (X)");
        System.out.println("2. Distribution (:)");
        System.out.println("3. Addition (+)");
        System.out.println("4. Subtraction (-)");
        System.out.print("Input number operation calculation : ");
        inputOperationCalculation = input.nextLine();
        switch (inputOperationCalculation){
            case "1":
                Integer numeOneMultiplication, numeTwoMultiplication, denoOneMultiplication, denoTwoMultiplication,  resultValueNumerator, resultValueDenominator;
                System.out.print("Input number numerator first : ");
                numeOneMultiplication = input.nextInt();
                System.out.print("Input denominator first : ");
                denoOneMultiplication = input.nextInt();
                System.out.print("Input number numerator second : ");
                numeTwoMultiplication = input.nextInt();
                System.out.print("Input number denominator second : ");
                denoTwoMultiplication = input.nextInt();
                resultValueNumerator = numeOneMultiplication * numeTwoMultiplication;
                resultValueDenominator = denoOneMultiplication * denoTwoMultiplication;
                System.out.println(numeOneMultiplication + "/" + denoOneMultiplication + " X "
                        + numeTwoMultiplication + "/" + denoTwoMultiplication + " = "
                        + resultValueNumerator + "/" +resultValueDenominator);
                break;
            case "2":
                System.out.println("Pembagian");
                break;
            case "3":
                // numeOne and Two (Numerator dalam bahasa indonesia pembilang)
                // denoOne and Two (Denominator dalam bahasa indonesia penyebut)
                Integer numeOneAddition, numeTwoAddition, denoOneAddition, denoTwoAddition, resultNume, resultDeno;
                System.out.print("Input number numerator first : ");
                numeOneAddition = input.nextInt();
                System.out.print("Input denominator first : ");
                denoOneAddition = input.nextInt();
                System.out.print("Input number numerator second : ");
                numeTwoAddition = input.nextInt();
                System.out.print("Input number denominator second : ");
                denoTwoAddition = input.nextInt();
                if(denoOneAddition != denoTwoAddition) {
                    System.out.print(numeOneAddition+"/"+denoOneAddition+" + "+numeTwoAddition+"/"+denoTwoAddition+" = ");
                    resultDeno = denoOneAddition*denoTwoAddition;
                    numeOneMultiplication = (resultDeno/denoOneAddition)*numeOneAddition;
                    numeTwoMultiplication = (resultDeno/denoTwoAddition)*numeTwoAddition;
                    resultNume = numeOneMultiplication+numeTwoMultiplication;
                    if (resultNume > resultDeno) {
                        resultNume = resultNume/resultDeno;
                        if (resultDeno > resultNume){
                            resultNume = resultNume % resultDeno;
                            System.out.println(resultNume);
                        }else {
                            System.out.println(numeOneMultiplication+"/"+resultDeno+" + "+numeTwoMultiplication+"/"+resultDeno+" = "+resultNume+"/"+resultDeno+"=" +resultNume);
                        }
                    }
                    else{
                        System.out.println(numeOneMultiplication+"/"+resultDeno+" + "+numeTwoMultiplication+"/"+resultDeno+" = "+resultNume+"/"+resultDeno);
                    }

                } else if (denoOneAddition == denoTwoAddition){
                        resultNume = numeOneAddition + numeTwoAddition;
                        if (resultNume % denoOneAddition == 0){
                            resultNume = resultNume / denoOneAddition;
                            System.out.println(numeOneAddition+"/"+denoOneAddition+" + "+numeTwoAddition+"/"+denoTwoAddition+" = "+ denoOneAddition + "/" + denoOneAddition + "=" + resultNume);
                        }
                }
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
