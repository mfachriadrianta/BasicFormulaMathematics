package www.mfachriadrianta.com.controller;

import java.util.Scanner;

public class CalculationScalaMap {
    static void calculationScalaMap(){
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
