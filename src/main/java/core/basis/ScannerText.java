package core.basis;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author: bamboo on 20/12/12
 * @description: _用scanner输出文件内容
 */

public class ScannerText {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("D:\\bamboo\\studyCodeData\\temp\\myFile.txt"), "UTF-8");
        while (scanner.hasNext()) {
            scanner.toString();
        }
    }
}
