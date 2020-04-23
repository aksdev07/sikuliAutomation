//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.logging.Logger;
//
//public class LogicsClass {
//
//    Logger LOGGER = Logger.getLogger(LogicsClass.class.getName());
//
//    public static String extractStr(String s) {
//        /*
//         * This method will extract the filename from given path*/
//        int start, end;
//        StringBuffer str = new StringBuffer(s);
//        String str1;
//        start = str.lastIndexOf("\\");
//        end = str.lastIndexOf("PNG");
//        {
//            str1 = str.substring(start + 1, end - 1);
//        }
//        return str1;
//    }
//
//    public static void fileWriter(String reportName) {
//        try {
//            FileWriter writer = new FileWriter("C:\\Users\\Anuj\\MyFile.txt", true);
//            writer.write("reportName.add(" + '"' + reportName + '"' + ");");
//            writer.write("\r\n");   // write new line
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        String s = "D:\\CODE\\qa_uiautomator\\UIAutomator\\src\\test\\resources\\DesignerUI\\Images\\F17.PNG";
//        System.out.println(extractStr(s));
//        String newString = extractStr(s);
//        for (int i = 0; i < 10; i++) {
//            fileWriter(newString);
//        }
//
//    }
//
//    public Boolean excelExport() {
//        Boolean result = false;
//        try {
//            File file =    new File(filePath+"\\"+fileName);
//
//            //Create an object of FileInputStream class to read excel file
//
//            FileInputStream inputStream = new FileInputStream(file);
//
//            Workbook guru99Workbook = null;
//
//            //Find the file extension by splitting file name in substring  and getting only extension name
//
//            String fileExtensionName = fileName.substring(fileName.indexOf("."));
//
//            //Check condition if the file is xlsx file
//
//            if(fileExtensionName.equals(".xlsx")){
//
//                //If it is xlsx file then create object of XSSFWorkbook class
//
//                guru99Workbook = new XSSFWorkbook(inputStream);
//
//            }
//
//            //Check condition if the file is xls file
//
//            else if(fileExtensionName.equals(".xls")){
//
//                //If it is xls file then create object of HSSFWorkbook class
//
//                guru99Workbook = new HSSFWorkbook(inputStream);
//
//            }
//
//            //Read sheet inside the workbook by its name
//
//            Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
//
//            //Find number of rows in excel file
//
//            int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
//
//            //Create a loop over all the rows of excel file to read it
//
//            for (int i = 0; i < rowCount+1; i++) {
//
//                Row row = guru99Sheet.getRow(i);
//
//                //Create a loop to print cell values in a row
//
//                for (int j = 0; j < row.getLastCellNum(); j++) {
//
//                    //Print Excel data in console
//
//                    System.out.print(row.getCell(j).getStringCellValue()+"|| ");
//
//                }
//
//                System.out.println();
//            }
//        } catch (Exception e) {
//            LOGGER.info(e.toString());
//        }
//        return result;
//    }
//}
