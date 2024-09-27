
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class New_Class {

    static WebDriver driver;
    //private static String Male;


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //navigate at web url
        driver.get("https://www.facebook.com/signup");
        //driver.manage().deleteAllCookies();

        //Find Firstname input field
        WebElement firstnameinput = driver.findElement(By.name("firstname"));
        //write Firstname in the field
        firstnameinput.sendKeys("dihan_first");

        //find surname input field
        WebElement surnameinput = driver.findElement(By.name("lastname"));
        //write surname in the field
        surnameinput.sendKeys("pathan_last");

        //Find Mobile or email adress input field
        WebElement emailinput = driver.findElement(By.name("reg_email__"));
        //write email address in the field
        emailinput.sendKeys("dihanexample@xmail.com");



        //Find re enter  email adress input field
        WebElement reemailinput = driver.findElement(By.name("reg_email_confirmation__"));
        //write re enteremail address in the field
        reemailinput.sendKeys("dihanexample@xmail.com");



        //find birthday input field
        WebElement birth_day = driver.findElement(By.id("day"));
        //select birthday
        birth_day.sendKeys("31");

        //find birthmonth input field
        WebElement birth_month = driver.findElement(By.id("month"));
        //select birthmonth
        birth_month.sendKeys("Dec");

        //find birtyear input field
        WebElement birth_year = driver.findElement(By.id("year"));
        //select  from the drop down
        birth_year.sendKeys("1994");
        //Select gender from the radio buttons
         WebElement genderRadioButton = driver.findElement(By.xpath("//input[@name='sex' and @value='" +1 + "']"));
         //select gender
         genderRadioButton.click();

        //find password input field
        WebElement passwordinput = driver.findElement(By.id("password_step_input"));
        //Write password  into password input fields
        passwordinput.sendKeys("123456888@@");

        //Find login Button
        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();

        Thread.sleep(30000);
        driver.quit();
    }
}
