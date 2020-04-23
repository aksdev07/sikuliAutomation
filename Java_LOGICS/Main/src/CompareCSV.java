//import java.io.*;
//import java.util.ArrayList;
//
///* file1 - file2 = file3*/
//public class CompareCSV {
//    public static void main(String args[]) throws FileNotFoundException, IOException {
//        String path = System.getProperty("user.dir")+"\\src\\Actual_Report\\";
//       // String file1 = "backgroundColorCorrected.csv";
//        String file1 = "3979.xls";
//        //String file2 = "ORIGINAL.csv";
//        String file2 = "file2.xls";
//        String file3 = "Difference.xls";
//        ArrayList al1 = new ArrayList();
//        ArrayList al2 = new ArrayList();
//
//        BufferedReader CSVFile1 = new BufferedReader(new FileReader(path + file1));
//        String dataRow1 = CSVFile1.readLine();
//        while (dataRow1 != null) {
//            String[] dataArray1 = dataRow1.split(",");
//            for (String item1 : dataArray1) {
//                al1.add(item1);
//            }
//
//            dataRow1 = CSVFile1.readLine(); // Read next line of data.
//        }
//
//        CSVFile1.close();
//
//        BufferedReader CSVFile2 = new BufferedReader(new FileReader(path + file2));
//        String dataRow2 = CSVFile2.readLine();
//        while (dataRow2 != null) {
//            String[] dataArray2 = dataRow2.split(",");
//            for (String item2 : dataArray2) {
//                al2.add(item2);
//
//            }
//            dataRow2 = CSVFile2.readLine(); // Read next line of data.
//        }
//        CSVFile2.close();
//
//
//        for (Object bs : al2) {
//            al1.remove(bs);
//        }
//
//        int size = al1.size();
//        System.out.println("Hii" + size);
//
//        try {
//            FileWriter writer = new FileWriter(path + file3);
//            while (size != 0) {
//                size--;
//                writer.append("" + al1.get(size));
//                writer.append('\n');
//            }
//            writer.flush();
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
