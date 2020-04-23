import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExportFinalXLS {
    static String actualFilePath = System.getProperty("user.dir") + "\\src\\Actual_Report";
    static String expectedFilePath = System.getProperty("user.dir") + "\\src\\Expected_Report";


    static int m = 0;

    public static void main(String... strings) throws IOException {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(exportXLS());
        if (m > 0) {
            System.out.println("XLS file is compromised");
        } else {
            System.out.println("Both files are Equal");
        }
        softAssert.assertAll();
        /// Files.move()
    }

    public static Boolean exportXLS() {
        Boolean result = false;
        Boolean r1 = false, r2 = false;
        try {
            ExportFinalXLS actualFile = new ExportFinalXLS();
            ExportFinalXLS expectedFile = new ExportFinalXLS();

            r1 = actualFile.readExcel("file2.xls", "3979.xls");
            r2 = expectedFile.readExcel("file2.xls", "3979.xls");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        if (r1 == true && r2 == true) {
            result = true;
        }
        return result;
    }

    public Boolean readExcel(String actualfile, String expectedfile) {
        Boolean result = false;
        try {
            String actualFilePath = System.getProperty("user.dir") + "\\Actual_Report";
            String expectedFilePath = System.getProperty("user.dir") + "\\Expected_Report";
            File actualFile = new File(actualFilePath + "\\" + actualfile);
            File expectedFile = new File(expectedFilePath + "\\" + expectedfile);
            FileInputStream actualStream = new FileInputStream(actualFile);
            FileInputStream expectedStream = new FileInputStream(expectedFile);
            Workbook actualWorkbook = null;
            Workbook expectedWorkbook = null;
            String actualFileExtension = actualfile.substring(actualfile.indexOf("."));
            String expectedFileExtension = actualfile.substring(actualfile.indexOf("."));

            if (actualFileExtension.equals(".xlsx")) {
                //If it is xlsx file then create object of XSSFWorkbook class
                actualWorkbook = new XSSFWorkbook(actualStream);
                expectedWorkbook = new XSSFWorkbook(expectedStream);

            } else if (actualFileExtension.equals(".xls") && expectedFileExtension.equals(".xls")) {
                //If it is xls file then create object of HSSFWorkbook class
                actualWorkbook = new HSSFWorkbook(actualStream);
                expectedWorkbook = new HSSFWorkbook(expectedStream);
            }

            //Read actualSheet inside the actualWorkbook by its name
            Sheet actualSheet = actualWorkbook.getSheet("Results");
            Sheet expectedSheet = expectedWorkbook.getSheet("Results");

            //Find number of rows in excel file
            int actualRowCount = actualSheet.getLastRowNum() - actualSheet.getFirstRowNum();
            int expectedRowCount = expectedSheet.getLastRowNum() - expectedSheet.getFirstRowNum();

            //Create a loop over all the rows of excel file to read it
            Iterator<Row> actualRowItr = actualSheet.rowIterator();
            Iterator<Row> expectedRowItr = expectedSheet.rowIterator();
            while (actualRowItr.hasNext() && expectedRowItr.hasNext()) {
                Row actualRow = actualRowItr.next();
                Row expectedRow = expectedRowItr.next();
                //Row expectedRow = expectedSheet.getRow(i);
                Iterator<Cell> actualCellIterator = actualRow.cellIterator();
                Iterator<Cell> expectedCellIterator = expectedRow.cellIterator();
                while (actualCellIterator.hasNext() && expectedCellIterator.hasNext()) {
                    Cell actualCell = actualCellIterator.next();
                    Cell expectedCell = expectedCellIterator.next();
                    if (actualCell != null && expectedCell != null) {
                        if (actualCell.getCellType() == expectedCell.getCellType()) {
                            if (actualCell.toString().equals(expectedCell.toString())) {

                            } else {
                                m = m + 1;
                                System.out.println("EXPECTED: " + expectedCell + ", ACTUAL: " + actualCell);
                                System.out.println("Length of Expected Cell :" + expectedCell.toString().length() + ", Length of Actual Cell :" + actualCell.toString().length());
                            }
                        }

                    }
                }
            }
            result = true;
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return result;
    }


}

