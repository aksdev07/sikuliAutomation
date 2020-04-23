//package TEST;
//
//
//import java.util.logging.Logger;
//
//import static com.test.birst.designerUI.JasperUpgrade.JasperUpgradeFunctions.*;
//
//public class TC_VerifyDateTimeFormat extends BaseTest {
//    static DesignerPatterns designerPatterns = new DesignerPatterns();
//    private static final Logger LOGGER = Logger.getLogger(TC_VerifyDateTimeFormat.class.getName());
//
//
//    // @BeforeTest(alwaysRun = true)
//    public void setUpDriverAndLoginToDesigner() {
//        super.setUpDriver();
//        botDriver.maximize();
//        Browser.launchWebsite(botDriver, TestConfiguration.getTestURL());
//        Login.enterCredentials(botDriver, TestConfiguration.getusername(), TestConfiguration.getpassword());
//        Login.submitLoginForm(botDriver);
//        Home.waitForLoading(botDriver);
//        Home.selectSpace(botDriver, TestConfiguration.getSpacename());
//        Home.navigateTo(botDriver, Home.APPLICATION_MODULE.DESIGNER);
//        Home.clickOnFlashPopup(botDriver);
//    }
//
//
//    @Test
//    public static void report() {
//        try {
//            //dp.addAttribute(designerPatterns.Orders, designerPatterns.OrderDate);
//            dp.addAttribute(designerPatterns.Orders_1, designerPatterns.OrderDate_1);
//
//        } catch (Exception e) {
//            LOGGER.info(e.toString());
//        }
//
//    }
//
//    @Test
//    public static void reportTwo() {
//        try {
//            ds.click(designerPatterns.Attribute_folder);
//            dp.addMeasure(designerPatterns.OrderDate_Measure, designerPatterns.ShippedDate_1, designerPatterns.Max_1);
//            ds.click(designerPatterns.Attribute_folder);
//            dp.addAttribute(designerPatterns.Time_1, designerPatterns.Date_1);
//        } catch (Exception e) {
//            LOGGER.info(e.toString());
//        }
//    }
//
//    @Test(priority = 1, dependsOnMethods = "report")
//    public void dateFormatValidation() {
//        SoftAssert softAssert = new SoftAssert();
//
//        softAssert.assertTrue(dateFormat(dateData(), "Attribute"));
//
//        softAssert.assertAll();
//    }
//
//    @Test(dependsOnMethods = "reportTwo")
//    public static void dateFormatMeasure() {
//        SoftAssert softAssert = new SoftAssert();
//
//        softAssert.assertTrue(dateFormat(dateMeasureData(), "Measure"));
//
//        softAssert.assertAll();
//    }
//
//    @Test(priority = 2)
//    public static void timeFormatValidation() {
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue(timeFormat(timeData(), "Attribute"));
//        softAssert.assertTrue(timeFormat(timeData(), "Measure"));
//        softAssert.assertAll();
//    }
//
//    @Test(priority = 3)
//    public static void dateTimeCustom() {
//        SoftAssert softAssert = new SoftAssert();
//
//
//        softAssert.assertAll();
//    }
//
//    @Test(priority = 4)
//    public static void dateTimeSort() {
//        SoftAssert softAssert = new SoftAssert();
//
//
//        softAssert.assertAll();
//    }
//
//    @Test(priority = 5)
//    public static void dateTimeSavedExp() {
//        SoftAssert softAssert = new SoftAssert();
//
//
//        softAssert.assertAll();
//    }
//
//    @Test(priority = 6)
//    public static void dateTimePivotOnCol() {
//        SoftAssert softAssert = new SoftAssert();
//
//
//        softAssert.assertAll();
//    }
//
//    @Test(priority = 7)
//    public static void dateTimeColumnSelector() {
//        SoftAssert softAssert = new SoftAssert();
//
//
//        softAssert.assertAll();
//    }
//
//    @Test(priority = 8)
//    public static void dateTimeDrillDown() {
//        SoftAssert softAssert = new SoftAssert();
//
//
//        softAssert.assertAll();
//    }
//
//
//    //Have Idea first what to be done
//    @Test(priority = 9)
//    public static void dateTimeFilter() {
//        SoftAssert softAssert = new SoftAssert();
//
//
//        softAssert.assertAll();
//    }
//
//
//}
//
