//package TCS.Birst;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
//public class SikuliAutomation{
//	public static void main(String[] args) throws FindFailed, InterruptedException {
//		WebDriver driver;
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        //driver.manage().deleteAllCookies();
//
//        //driver wait
//        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
//        driver.get("https://www.google.com");
//        driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("lllllllllllllll");
//        //((Actions) driver).sendKeys(Keys.ESCAPE);
//
//        //Sikuli Screen class
//
//        Screen s = new Screen();
//        Pattern pauseImage = new Pattern("googleSearch.PNG");
//        s.wait(pauseImage,2000);
//
//
//        //click
//        s.click();
//
//
//
//       // driver.quit();
//	}
//}