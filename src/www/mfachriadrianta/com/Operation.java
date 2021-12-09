package www.mfachriadrianta.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Operation {
    static boolean checkingData(String[] keywordConvertationUnit, boolean isDisplay) throws IOException {
        FileReader fileReader = new FileReader("database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String dataConvertationUnit = bufferedReader.readLine();
        boolean isExist = true;
        int nomorDataConvertationUnit = 5;

        while (dataConvertationUnit != null) {
            isExist = true;
            for (String repeatcheckingUnit : keywordConvertationUnit) {
                isExist = isExist && dataConvertationUnit.toLowerCase().contains(repeatcheckingUnit.toLowerCase());
            }
                if (isDisplay) {
                    System.out.println("Is exist");
                } else if (isDisplay){
                    System.out.println("Not found");
                }
//            if (isExist) {
//            }
            dataConvertationUnit = bufferedReader.readLine();
        }

        return isExist;
    }


}
