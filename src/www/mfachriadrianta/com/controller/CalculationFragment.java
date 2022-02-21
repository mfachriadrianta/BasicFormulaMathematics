package www.mfachriadrianta.com.controller;
import www.mfachriadrianta.com.UserScanner.scannerUser;

import java.io.IOException;
import java.util.Scanner;


public class CalculationFragment {

     static Scanner inputOne, inputTwo, inputThree;
     static String inputOperationCalculation;

     // All operation calculation fragment
    static void calculationFragmentNormal(){
        inputOne = new Scanner(System.in);
        System.out.println("=== List operation calculation normal===");
        System.out.println("1. Multiplication (X)");
        System.out.println("2. Distribution (:)");
        System.out.println("3. Addition (+)");
        System.out.println("4. Subtraction (-)");
        System.out.print("Input number operation calculation : ");
        inputOperationCalculation = inputOne.nextLine();
        switch (inputOperationCalculation){
            case "1":
                Integer numeOneMultiplication, numeTwoMultiplication,
                        denoOneMultiplication, denoTwoMultiplication,
                        resultValueNumerator, resultValueDenominator;
                System.out.print("Input number numerator first : ");
                numeOneMultiplication = inputOne.nextInt();
                System.out.print("Input denominator first : ");
                denoOneMultiplication = inputOne.nextInt();
                System.out.print("Input number numerator second : ");
                numeTwoMultiplication = inputOne.nextInt();
                System.out.print("Input number denominator second : ");
                denoTwoMultiplication = inputOne.nextInt();
                resultValueNumerator = numeOneMultiplication * numeTwoMultiplication;
                resultValueDenominator = denoOneMultiplication * denoTwoMultiplication;
                System.out.println(numeOneMultiplication + "/" + denoOneMultiplication + " X "
                        + numeTwoMultiplication + "/" + denoTwoMultiplication + " = "
                        + resultValueNumerator + "/" +resultValueDenominator);
                break;
            case "2":
                Integer numeOneDistribution, numeTwoDistribution,
                        denoOneDistribution, denoTwoDistribution,
                        resultNumeDistribution, resultDenoDistribution,
                        resultNumeDistributionOne, resultDenoDistributionOne,
                        resultNumeDistributionRemainder;
                System.out.print("Input number numerator first : ");
                numeOneDistribution = inputOne.nextInt();
                System.out.print("Input denominator first : ");
                denoOneDistribution = inputOne.nextInt();
                System.out.print("Input number numerator second : ");
                numeTwoDistribution = inputOne.nextInt();
                System.out.print("Input number denominator second : ");
                denoTwoDistribution = inputOne.nextInt();
                System.out.print(numeOneDistribution + "/" + denoOneDistribution
                + " : " + numeTwoDistribution + "/" + denoTwoDistribution + " = ");
                resultNumeDistribution = numeOneDistribution * denoTwoDistribution;
                resultDenoDistribution = denoOneDistribution * numeTwoDistribution;
                System.out.print(numeOneDistribution + "/" + denoOneDistribution
                            + " X " + denoTwoDistribution + "/" + numeTwoDistribution + " = " +
                            resultNumeDistribution + "/" + resultDenoDistribution + "\n");
                if (resultNumeDistribution >= resultDenoDistribution) {
                    if (resultNumeDistribution % resultDenoDistribution != 0) {
                            resultNumeDistributionOne = resultNumeDistribution / (resultNumeDistribution / resultDenoDistribution);
                            resultDenoDistributionOne = resultDenoDistribution / (resultNumeDistribution / resultDenoDistribution);
                            System.out.print(" = " + resultNumeDistributionOne + "/" + resultDenoDistributionOne + " = ");
                            resultNumeDistributionRemainder = resultNumeDistribution / resultDenoDistribution;
                            System.out.print(resultNumeDistributionRemainder + "-");
                            resultNumeDistributionOne = resultNumeDistributionOne % resultDenoDistributionOne;
                            System.out.println(resultNumeDistributionOne + "/" + resultDenoDistributionOne);
                        }
                    }
                break;
            case "3":
                // numeOne and Two (Numerator dalam bahasa indonesia pembilang)
                // denoOne and Two (Denominator dalam bahasa indonesia penyebut)
                Integer numeOneAddition, numeTwoAddition,
                        denoOneAddition, denoTwoAddition,
                        resultNume, resultDeno, resultValueMid;
                System.out.print("Input number numerator first : ");
                numeOneAddition = inputOne.nextInt();
                System.out.print("Input denominator first : ");
                denoOneAddition = inputOne.nextInt();
                System.out.print("Input number numerator second : ");
                numeTwoAddition = inputOne.nextInt();
                System.out.print("Input number denominator second : ");
                denoTwoAddition = inputOne.nextInt();
                if(denoOneAddition != denoTwoAddition) {
                    System.out.print(numeOneAddition+"/"+denoOneAddition+" + "+numeTwoAddition+"/"+denoTwoAddition+" = ");
                    resultDeno = denoOneAddition*denoTwoAddition;
                    numeOneMultiplication = (resultDeno/denoOneAddition)*numeOneAddition;
                    numeTwoMultiplication = (resultDeno/denoTwoAddition)*numeTwoAddition;
                    resultNume = numeOneMultiplication+numeTwoMultiplication;
                    System.out.print(numeOneMultiplication + "/" + resultDeno + " + " + numeTwoMultiplication + "/" + resultDeno + " = " + resultNume + "/" + resultDeno + " = ");
                    if (resultNume > resultDeno) {
                        resultValueMid = resultNume / resultDeno;
                        resultNume = resultNume % resultDeno;
                        System.out.print(resultValueMid + "--");
                        System.out.println(resultNume + "/" + resultDeno);
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
                Integer numeOneSubtraction, denoOneSubtraction,
                        numeTwoSubtraction, denoTwoSubtraction,
                        resultNumeSubtraction, resultDenoSubtraction,
                        resultNumeSubtractionOneEquality, resultNumeSubtractionTwoEquality,
                        resultDenoSubtractionOneEquality, resultDenoSubtractionTwoEquality;
                System.out.print("Input number numerator first : ");
                numeOneSubtraction = inputOne.nextInt();
                System.out.print("Input denominator first : ");
                denoOneSubtraction = inputOne.nextInt();
                System.out.print("Input number numerator second : ");
                numeTwoSubtraction = inputOne.nextInt();
                System.out.print("Input number denominator second : ");
                denoTwoSubtraction = inputOne.nextInt();
                System.out.print(numeOneSubtraction + "/" + denoOneSubtraction + " - " + numeTwoSubtraction + "/" + denoTwoSubtraction + " = ");
                if (denoOneSubtraction == denoTwoSubtraction){
                    if (numeOneSubtraction > numeTwoSubtraction){
                        resultNumeSubtraction = numeOneSubtraction - numeTwoSubtraction;
                        System.out.print(resultNumeSubtraction + "/" + denoOneSubtraction + "\n");
                    } else if (numeOneSubtraction >= numeTwoSubtraction){
                        resultNumeSubtraction = numeTwoSubtraction;
                        resultDenoSubtraction = denoTwoSubtraction;
                        System.out.print(resultNumeSubtraction + "/" + resultDenoSubtraction + "\n");
                    }
                }else {
                    resultNumeSubtractionOneEquality = ((denoOneSubtraction * denoTwoSubtraction) / denoOneSubtraction) * numeOneSubtraction;
                    resultDenoSubtractionOneEquality = denoOneSubtraction * denoTwoSubtraction;
                    resultNumeSubtractionTwoEquality = ((denoOneSubtraction * denoTwoSubtraction) / denoTwoSubtraction) * numeOneSubtraction;
                    resultDenoSubtractionTwoEquality = resultDenoSubtractionOneEquality;
                    if (resultDenoSubtractionOneEquality == resultDenoSubtractionTwoEquality){
                        System.out.print(resultNumeSubtractionOneEquality + "/");
                        System.out.print(resultDenoSubtractionOneEquality + " - ");
                        System.out.print(resultNumeSubtractionTwoEquality + "/");
                        System.out.print(resultDenoSubtractionTwoEquality + " = ");
                        if (resultNumeSubtractionOneEquality > resultNumeSubtractionTwoEquality){
                            resultNumeSubtractionOneEquality = resultNumeSubtractionOneEquality - resultNumeSubtractionTwoEquality;
                            System.out.print(resultNumeSubtractionOneEquality + "/" + resultDenoSubtractionTwoEquality + "\n");
                        }
                    } else if (denoOneSubtraction < denoTwoSubtraction){
                        resultDenoSubtraction = denoOneSubtraction * denoTwoSubtraction;
                        System.out.println(resultDenoSubtraction);
                    }
                }
                break;
            default:
                System.err.println("Not found operation calculation");
        }
    }

    static void calculationFragmentMixture() {
        inputTwo = new Scanner(System.in);
        System.out.println("=== List operation calculation fragment mixture ===");
        System.out.println("1. Multiplication (X)");
        System.out.println("2. Distribution (:)");
        System.out.println("3. Addition (+)");
        System.out.println("4. Subtraction (-)");

    }

    static void calculationFragmentDecimal(){

    }

    static void calculationFragmentPercent(){

    }

    static void calculationFragmentPermil(){

    }

}
