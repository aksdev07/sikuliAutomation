package TEST;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyWorkAutomation {
    public static String extractStr(String s) {
        /*
         * This method will extract the filename from given path*/
        int start, end;
        StringBuffer str = new StringBuffer(s);
        String str1;
        start = str.lastIndexOf("\\");
        end = str.lastIndexOf("PNG");
        {
            str1 = str.substring(start + 1, end - 1);
        }
        return str1;
    }

    public static void fileWriter(String reportName) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Anuj\\MyFile.txt", true);
            writer.write("reportName.add("+'"'+reportName+'"'+");");
            writer.write("\r\n");   // write new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {
        String s = "D:\\CODE\\qa_uiautomator\\UIAutomator\\src\\test\\resources\\DesignerUI\\Images\\F17.PNG";
        System.out.println(extractStr(s));
        String newString = extractStr(s);
        for (int i = 0; i <10 ; i++) {
            fileWriter(newString);
        }

    }
}
