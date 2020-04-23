import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

 class Reader {
    static String actualFilePath = System.getProperty("user.dir") + "\\src\\Actual_Report";
    static String expectedFilePath = System.getProperty("user.dir") + "\\src\\Expected_Report";
    static int m = 0;


    public static void main(String... strings) throws IOException {

        //Create an object of Reader class

        Reader actualFile = new Reader();
        Reader expectedFile = new Reader();

        //Prepare the path of excel file


        //Call read file method of the class to read data

        actualFile.readExcel("file2.xls", "3979.xls");
        expectedFile.readExcel("file2.xls", "3979.xls");
        /// Files.move()
    }

    //Main function is calling readExcel function to read data from excel file

    public void readExcelh(String actualfile, String expectedfile) throws IOException {

        //Create an object of File class to open xlsx file

        File actualFile = new File(actualFilePath + "\\" + actualfile);
        File expectedFile = new File(expectedFilePath + "\\" + expectedfile);
        //Create an object of FileInputStream class to read excel file

        FileInputStream actualStream = new FileInputStream(actualFile);
        FileInputStream expectedStream = new FileInputStream(expectedFile);

        Workbook actualWorkbook = null;
        Workbook expectedWorkbook = null;

        //Find the file extension by splitting file name in substring  and getting only extension name

        String actualFileExtension = actualfile.substring(actualfile.indexOf("."));
        String expectedFileExtension = actualfile.substring(actualfile.indexOf("."));

        //Check condition if the file is xlsx file

        if (actualFileExtension.equals(".xlsx")) {

            //If it is xlsx file then create object of XSSFWorkbook class

            // actualWorkbook = new XSSFWorkbook(actualStream);

        }

        //Check condition if the file is xls file

        else if (actualFileExtension.equals(".xls") && expectedFileExtension.equals(".xls")) {

            //If it is xls file then create object of HSSFWorkbook class

            actualWorkbook = new HSSFWorkbook(actualStream);
            expectedWorkbook = new HSSFWorkbook(expectedStream);

        }

        //Read sheet inside the actualWorkbook by its name

        Sheet sheet = actualWorkbook.getSheet("Results");
        Sheet sheet2 = expectedWorkbook.getSheet("Results");

        //Find number of rows in excel file

        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        int rowCount2 = sheet2.getLastRowNum() - sheet2.getFirstRowNum();

        //Create a loop over all the rows of excel file to read it


        for (int i = 0; i < rowCount + 1; i++) {

            Row row = sheet.getRow(i);
            Row row2 = sheet2.getRow(i);
            //Create a loop to print cell values in a row

            {
                // for (int j = 0; j < row.getLastCellNum(); j++) {
                // Cell cell = row.getCell(j);
                //  Cell cell2 = row2.getCell(j);

                Iterator<Cell> actualCellIterator = row.cellIterator();
                Iterator<Cell> expectedCellIterator = row2.cellIterator();
                while (actualCellIterator.hasNext() && expectedCellIterator.hasNext()) {
                    Cell actualCell = actualCellIterator.next();
                    Cell expectedCell = expectedCellIterator.next();
                    if (actualCell != null && expectedCell != null) {
                        if (actualCell.getCellType() == expectedCell.getCellType()) {
                            if (actualCell.toString().equals(expectedCell.toString())) {
                                m = m + 1;
                            } else {
                                System.out.println("EXPECTED: " + expectedCell + ", ACTUAL: " + actualCell);
                                System.out.println("Length of Expected Cell :" + expectedCell.toString().length() + ", Length of Actual Cell :" + actualCell.toString().length());
                            }
                        }

                    }

                    //Print Excel data in console

                    // System.out.print(row.getCell(j).getStringCellValue() + "|| ");
                    //   String unitPrice = new Float(actualWorkbook.getSheet("Results").getRow(j).getCell(j).getNumericCellValue()).toString();
                    // System.out.println(unitPrice);
                    //   }
                }

                System.out.println();
            }
            System.out.println("Total Equal Cell :" + m);

        }

    }
}