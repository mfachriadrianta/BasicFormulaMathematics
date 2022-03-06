package www.mfachriadrianta.com.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CalculationConvertationUnit {

    static void convertationUnit(boolean isDisplay) throws IOException {
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
}
