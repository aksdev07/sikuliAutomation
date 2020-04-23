//package TEST;
//
//import java.util.Map;
//
//public class Methods {
//    //==============   Methods for TC_VerifyDateTimeFormat  =============================
//    public static ArrayList<Pattern> pdfResult() {
//        ArrayList<Pattern> result = new ArrayList<>();
//        result.add(ds.F1_result_pdf);
//        result.add(ds.F2_result_pdf);
//        result.add(ds.F3_result_pdf);
//        result.add(ds.F4_result_pdf);
//        result.add(ds.F5_result_pdf);
//        result.add(ds.F6_result_pdf);
//        result.add(ds.F7_result_pdf);
//        result.add(ds.F8_result_pdf);
//        result.add(ds.F9_result_pdf);
//        result.add(ds.F10_result_pdf);
//        result.add(ds.F11_result_pdf);
//        result.add(ds.F12_result_pdf);
//        result.add(ds.F13_result_pdf);
//        result.add(ds.F14_result_pdf);
//        result.add(ds.F15_result_pdf);
//        result.add(ds.F16_result_pdf);
//        result.add(ds.F17_result_pdf);
//        result.add(ds.F18_result_pdf);
//        result.add(ds.F19_result_pdf);
//        result.add(ds.F20_result_pdf);
//        result.add(ds.F21_result_pdf);
//        result.add(ds.F22_result_pdf);
//        result.add(ds.F23_result_pdf);
//        result.add(ds.F24_result_pdf);
//        return result;
//    }
//    public static ArrayList<Pattern> pdfMeasureResult() {
//        ArrayList<Pattern> result = new ArrayList<>();
//        result.add(ds.F1_Measure_Result_pdf);
//        result.add(ds.F2_Measure_Result_pdf);
//        result.add(ds.F3_Measure_Result_pdf);
//        result.add(ds.F4_Measure_Result_pdf);
//        result.add(ds.F5_Measure_Result_pdf);
//        result.add(ds.F6_Measure_Result_pdf);
//        result.add(ds.F7_Measure_Result_pdf);
//        result.add(ds.F8_Measure_Result_pdf);
//        result.add(ds.F9_Measure_Result_pdf);
//        result.add(ds.F10_Measure_Result_pdf);
//        //screenshot_start
//        result.add(ds.F11_Measure_Result_pdf);
//        result.add(ds.F12_Measure_Result_pdf);
//        result.add(ds.F13_Measure_Result_pdf);
//        result.add(ds.F14_Measure_Result_pdf);
//        result.add(ds.F15_Measure_Result_pdf);
//        result.add(ds.F16_Measure_Result_pdf);
//        result.add(ds.F17_Measure_Result_pdf);
//        result.add(ds.F18_Measure_Result_pdf);
//        result.add(ds.F19_Measure_Result_pdf);
//        result.add(ds.F20_Measure_Result_pdf);
//        result.add(ds.F21_Measure_Result_pdf);
//        result.add(ds.F22_Measure_Result_pdf);
//        result.add(ds.F23_Measure_Result_pdf);
//        result.add(ds.F24_Measure_Result_pdf);
//        return result;
//    }
//    //For Attribute
//    public static LinkedHashMap<Pattern, Pattern> dateData() {
//        //hm : This object will contain dateFormat as key and Result as Value
//        LinkedHashMap<Pattern, Pattern> hm = new LinkedHashMap<Pattern, Pattern>();
//        hm.put(ds.F1, ds.F1_result);
//        hm.put(ds.F2, ds.F2_result);
//        hm.put(ds.F3, ds.F3_result);
//        hm.put(ds.F4, ds.F4_result);
//        hm.put(ds.F5, ds.F5_result);
//        hm.put(ds.F6, ds.F6_result);
//        hm.put(ds.F7, ds.F7_result);
//        hm.put(ds.F8, ds.F8_result);
//        hm.put(ds.F9, ds.F9_result);
//        hm.put(ds.F10, ds.F10_result);
//        hm.put(ds.F11, ds.F11_result);
//        hm.put(ds.F12, ds.F12_result);
//        hm.put(ds.F13, ds.F13_result);
//        hm.put(ds.F14, ds.F14_result);
//        hm.put(ds.F15, ds.F15_result);
//        hm.put(ds.F16, ds.F16_result);
//        hm.put(ds.F17, ds.F17_result);
//        hm.put(ds.F18, ds.F18_result);
//        hm.put(ds.F19, ds.F19_result);
//        hm.put(ds.F20, ds.F20_result);
//        hm.put(ds.F21, ds.F21_result);
//        hm.put(ds.F22, ds.F22_result);
//        hm.put(ds.F23, ds.F23_result);
//        hm.put(ds.F24, ds.F24_result);
//        return hm;
//    }
//    //For Measure
//    public static LinkedHashMap<Pattern, Pattern> dateMeasureData() {
//        //hm : This object will contain dateFormat as key and Result as Value
//        LinkedHashMap<Pattern, Pattern> hm = new LinkedHashMap<Pattern, Pattern>();
//        hm.put(ds.F1, ds.F1_measure_result);
//        hm.put(ds.F2, ds.F2_measure_result);
//        hm.put(ds.F3, ds.F3_measure_result);
//        hm.put(ds.F4, ds.F4_measure_result);
//        hm.put(ds.F5, ds.F5_measure_result);
//        hm.put(ds.F6, ds.F6_measure_result);
//        hm.put(ds.F7, ds.F7_measure_result);
//        hm.put(ds.F8, ds.F8_measure_result);
//        hm.put(ds.F9, ds.F9_measure_result);
//        hm.put(ds.F10, ds.F10_measure_result);
//        //SCREENSHOT - START 2nd param
//        hm.put(ds.F11, ds.F11_measure_result);
//        hm.put(ds.F12, ds.F12_measure_result);
//        hm.put(ds.F13, ds.F13_measure_result);
//        hm.put(ds.F14, ds.F14_measure_result);
//        hm.put(ds.F15, ds.F15_measure_result);
//        hm.put(ds.F16, ds.F16_measure_result);
//        hm.put(ds.F17, ds.F17_measure_result);
//        hm.put(ds.F18, ds.F18_measure_result);
//        hm.put(ds.F19, ds.F19_measure_result);
//        hm.put(ds.F20, ds.F20_measure_result);
//        hm.put(ds.F21, ds.F21_measure_result);
//        hm.put(ds.F22, ds.F22_measure_result);
//        hm.put(ds.F23, ds.F23_measure_result);
//        hm.put(ds.F24, ds.F24_measure_result);
//        //SCREENSHOT_END
//        return hm;
//    }
//    public static LinkedHashMap<Pattern, Pattern> timeData() {
//        LinkedHashMap<Pattern, Pattern> hm = new LinkedHashMap<Pattern, Pattern>();
//        hm.put(ds.T1,ds.T1_result);
//        hm.put(ds.T2,ds.T2_result);
//        hm.put(ds.T3,ds.T3_result);
//        hm.put(ds.T4,ds.T4_result);
//        hm.put(ds.T5,ds.T5_result);
//        hm.put(ds.T6,ds.T6_result);
//        return hm;
//    }
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
//    public static void fileWriter(String reportName) {
//        try {
//            FileWriter writer = new FileWriter("C:\\Users\\1543232\\Anuj_MyFile.txt", true);
//            writer.write("reportName.add(" + '"' + reportName + '"' + ");");
//            writer.write("\r\n");   // write new line
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public static Boolean dateFormat(LinkedHashMap<Pattern, Pattern> dropDown, String COLUMN_TYPE) {
//        Settings.MoveMouseDelay = 0.8f;
//        Boolean result = false;
//        String reportName = new String();
//        System.out.println("Inside switch");
//        switch (COLUMN_TYPE) {
//            case "Attribute": {
//                try {
//                    Iterator<Map.Entry<Pattern, Pattern>> itr = dropDown.entrySet().iterator();
//                    Iterator<Pattern> itr1 = pdfResult().iterator();
//                    while (itr.hasNext() && itr1.hasNext()) {
//                        Map.Entry<Pattern, Pattern> entry = itr.next();
//                        DesignerScreen.click(ds.OrderDateHdr_1);
//                        DesignerScreen.click(ds.columnProperties_1);
//                        //here it needs to click the down arrow icon of the drop down menu
//                        DesignerScreen.click(ds.scrollDown_01);
//                        for (int i = 0; i < 25; i++) {
//                            if (DesignerScreen.exists(entry.getKey()) != null) {
//                                DesignerScreen.doubleClick(entry.getKey());
//                                LOGGER.info("Format found : SUCCESSFUL");
//                                break;
//                            } else {
//                                DesignerScreen.click(ds.Scrolldown);
//                            }
//                        }
//                        DesignerScreen.click(ds.saveF);
//                        reportName = entry.getKey().getFilename();
//                        LOGGER.info(extractStr(reportName));
//                        fileWriter("Attribute" + extractStr(reportName));
//                        saveAs("Attribute" + extractStr(reportName), "Date_Time");
//                        Thread.sleep(TWO_SEC);
////                        verifyResult(entry.getValue());
////                        //Export
////                        Pattern pdf = itr1.next();
////                        LOGGER.info("PDFfile Name = " + extractStr(pdf.getFilename()));
////                        exportReportPDF(pdf);
////                        //Schedule
////                        scheduleReportAndRun("Date Format : " + extractStr(reportName));
//                        result = true;
//                    }
//                } catch (Exception e) {
//                    LOGGER.info("here" + e.toString() + extractStr(reportName));
//                    result = false;
//                }
//            }
//            break;
//            case "Measure": {
//                try {
//                    Iterator<Map.Entry<Pattern, Pattern>> itr = dropDown.entrySet().iterator();
//                    //  Iterator<Pattern> itr1 = pdfResult().iterator();
//                    while (itr.hasNext()) {
//                        Map.Entry<Pattern, Pattern> entry = itr.next();
//                        DesignerScreen.click(ds.ShippedDateHDR_1);
//                        DesignerScreen.click(ds.columnProperties_1);
//                        //here it needs to click the down arrow icon of the drop down menu
//                        DesignerScreen.click(ds.scrollDown_01);
//                        for (int i = 0; i < 25; i++) {
//                            if (DesignerScreen.exists(entry.getKey()) != null) {
//                                DesignerScreen.doubleClick(entry.getKey());
//                                LOGGER.info("Format found : SUCCESSFUL");
//                                break;
//                            } else {
//                                DesignerScreen.click(ds.Scrolldown);
//                            }
//                        }
//                        DesignerScreen.click(ds.saveF);
//                        reportName = entry.getKey().getFilename();
//                        LOGGER.info(extractStr(reportName));
//                        fileWriter("Measure_" + extractStr(reportName));
//                        saveAs("Measure_" + extractStr(reportName), "Date_Time");
////                        Thread.sleep(TWO_SEC);
////                        verifyResult(entry.getValue());
////                        //Export
////                        Pattern pdf = itr1.next();
////                        LOGGER.info("PDFfile Name = " + extractStr(pdf.getFilename()));
////                        exportReportPDF(pdf);
////                        //Schedule
////                        scheduleReportAndRun("Date Format : " + extractStr(reportName));
//                        result = true;
//                    }
//                } catch (Exception e) {
//                    LOGGER.info("here" + e.toString() + extractStr(reportName));
//                    result = false;
//                }
//            }
//        }
//        return result;
//    }
//    public static Boolean timeFormat(HashMap<Pattern, Pattern> dropDown, String COLUMN_TYPE) {
//        Boolean result = false;
//        switch (COLUMN_TYPE) {
//            case "Attribute": {
//                try {
//                    Iterator<Map.Entry<Pattern, Pattern>> itr = dropDown.entrySet().iterator();
//                    while (itr.hasNext()) {
//                        Map.Entry<Pattern, Pattern> entry = itr.next();
//                        DesignerScreen.click(ds.OrderDateHdr);
//                        DesignerScreen.click(ds.columnProperties);
//                        //here it needs to click the down arrow icon of the drop down menu
//                        DesignerScreen.click(ds.dropHeader);
//                        for (int i = 0; i < 25; i++) {
//                            if (DesignerScreen.exists(entry.getKey()) != null) {
//                                DesignerScreen.doubleClick(entry.getKey());
//                                LOGGER.info("Format found : SUCCESSFUL");
//                                break;
//                            } else {
//                                DesignerScreen.click(ds.Scrolldown);
//                            }
//                        }
//                        DesignerScreen.click(ds.saveF);
//                        verifyResult(entry.getValue());
//                        result = true;
//                    }
//                } catch (Exception e) {
//                    LOGGER.info(e.toString());
//                }
//            }
//            break;
//            case "Measure": {
//                try {
//                    Iterator<Map.Entry<Pattern, Pattern>> itr = dropDown.entrySet().iterator();
//                    while (itr.hasNext()) {
//                        Map.Entry<Pattern, Pattern> entry = itr.next();
//                        DesignerScreen.click(ds.ShippedDateHDR);
//                        DesignerScreen.click(ds.columnProperties);
//                        //here it needs to click the down arrow icon of the drop down menu
//                        DesignerScreen.click(ds.dropHeader);
//                        for (int i = 0; i < 25; i++) {
//                            if (DesignerScreen.exists(entry.getKey()) != null) {
//                                DesignerScreen.doubleClick(entry.getKey());
//                                LOGGER.info("Format found : SUCCESSFUL");
//                                break;
//                            } else {
//                                DesignerScreen.click(ds.Scrolldown);
//                            }
//                        }
//                        DesignerScreen.click(ds.saveF);
//                        verifyResult(entry.getValue());
//                        result = true;
//                    }
//                } catch (Exception e) {
//                    LOGGER.info(e.toString());
//                }
//            }
//        }
//        return result;
//    }
//    public static Boolean exportReportPDF(Pattern p) throws Exception {
//        Boolean result = false;
//        try {
//            DesignerScreen.click(ds.PDFIcon);
//            Thread.sleep(FIVE_SEC);
//            DesignerScreen.click(ds.OpenExportedPDF);
//            Thread.sleep(FIVE_SEC);
//            if (verifyResult(p)) {
//                LOGGER.info("Exported PDF verification : Successful");
//                result = true;
//            } else {
//                LOGGER.info("Exported PDF verification : Failure");
//            }
//            Thread.sleep(FIVE_SEC);
//            //It will close the browser TAB
//            DesignerScreen.type("w", CTRL);
//        } catch (FindFailed findFailed) {
//            LOGGER.info("FindFailed Exception" + findFailed.toString());
//        }
//        return result;
//    }
//    public static void saveAs(String ReportName, String FOLDER_NAME) throws Exception {
//        Settings.MoveMouseDelay = 0.8f;
//        LOGGER.info("Inside saveAs(" + ReportName + " " + FOLDER_NAME + ")");
//        DesignerScreen.click(ds.Report);
//        Thread.sleep(ONE_SEC);
//        DesignerScreen.click(ds.SaveAs);
//        Thread.sleep(TWO_SEC);
//        DesignerScreen.wait(ds.Shared, THIRTY_SECONDS);
//        DesignerScreen.click(ds.Shared);
//        Thread.sleep(THREE_SEC);
//        switch (FOLDER_NAME) {
//            case "Date_Time": {
//                if (DesignerScreen.exists(ds.Date_Time) != null) {
//                    DesignerScreen.doubleClick(ds.Date_Time);
//                } else {
//                    LOGGER.info("Creating a new folder : Date_Time");
//                    createFolder("Date_Time");
//                    DesignerScreen.doubleClick(ds.Date_Time);
//                }
//                LOGGER.info("Saving in Date_Time folder");
//            }
//            break;
//            default:
//                LOGGER.info("saveAs()===>UNKNOWN FOLDER : " + FOLDER_NAME);
//        }
//        DesignerScreen.wait(ds.name_Report, THIRTY_SECONDS);
//        Thread.sleep(TWO_SEC);
//        DesignerScreen.click(ds.name_Report);
//        DesignerScreen.type(ReportName);
//        DesignerScreen.click(ds.saveF);
//        Thread.sleep(ONE_SEC);
//        if (DesignerScreen.exists(ds.Overwrite) != null) {
//            DesignerScreen.click(ds.Overwrite_Yes);
//            LOGGER.info("Report " + ReportName + " Saved.");
//        } else
//            LOGGER.info("Report " + ReportName + " Saved.");
//    }
//    public static Boolean verifyResult(Pattern p) {
//        Boolean result = false;
//        if (DesignerScreen.exists(p) != null) {
//            result = true;
//        }
//        if (result) {
//            LOGGER.info("verifyResult() : SUCCESSFUL");
//        } else {
//            LOGGER.info("verifyResult() : FAILURE");
//        }
//        return result;
//    }
//    public static void scheduleReportAndRun(String fileName) throws FindFailed, InterruptedException {
//        Settings.MoveMouseDelay = 1.5f;
//        Boolean result = false;
//        for (int i = 0; i < 3; i++) {
//            try {
//                DesignerScreen.click(ds.Add);
//                DesignerScreen.click(ds.ScheduleReport_Designer);
//                DesignerScreen.click(ds.ScheduleName_1);
//                DesignerScreen.type(fileName);
//                //format selection
//                DesignerScreen.click(ds.PDF_CheckBox);
//                DesignerScreen.click(ds.CSV_checkbox);
//                DesignerScreen.click(ds.PPT_Checkbox);
//                DesignerScreen.click(ds.XLS_Checkbox);
//                DesignerScreen.click(ds.EmailList);
//                //DesignerScreen.type("sadda@birst.cc");
//                DesignerScreen.type("sadda@birst.cc");
//                Thread.sleep(ONE_SEC);
//                DesignerScreen.click(ds.EMAIL_TAB);
//                DesignerScreen.click(ds.SUJBJECT);
//                Thread.sleep(TWO_SEC);
//                DesignerScreen.type("a", KeyModifier.CTRL);
//                Thread.sleep(ONE_SEC);
//                DesignerScreen.type(fileName);
//                DesignerScreen.click(ds.saveR);
//                Thread.sleep(TWO_SEC);
//                DesignerScreen.click(ds.Options);
//                DesignerScreen.click(ds.ManageScheduleReports);
//                DesignerScreen.doubleClick(ds.CreatedDate);
//                Thread.sleep(TWO_SEC);
//                DesignerScreen.click(ds.REPORT_CLICK);
//                DesignerScreen.click(ds.RUN_NOW);
//                DesignerScreen.click(ds.Ok_Button);
//                Thread.sleep(TWO_SEC);
//                DesignerScreen.click(ds.Delete);
//                DesignerScreen.click(ds.OK_S);
//                Thread.sleep(TWO_SEC);
//                DesignerScreen.click(ds.saveR);
//                result = true;
//                break;
//            } catch (FindFailed findFailed) {
//                LOGGER.info(findFailed.toString());
//                LOGGER.info("Caught exception trying again : " + i);
//                if (DesignerScreen.exists(ds.OK_Button1) != null) {
//                    DesignerScreen.click(ds.OK_Button1);
//                } else {
//                    if (DesignerScreen.exists(ds.Cancel) != null) {
//                        DesignerScreen.click(ds.Cancel);
//                    }
//                }
//                result = false;
//            }
//            if (result) {
//                LOGGER.info("SUCCESS: Report has been scheduled and ran instantly");
//            } else {
//                LOGGER.info("FAILURE: Problem in scheduling report");
//            }
//        }
//    }
//
//
//}
