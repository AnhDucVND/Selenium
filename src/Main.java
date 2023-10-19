import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws Exception {
            //WebDriver driver=null;
            System.setProperty("webdriver.chrome.driver","D:\\AKA\\Dang ki package\\Browser\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver =new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.thegioididong.com/");
            //Chuyển sang full màn hình
            driver.manage().window().maximize();

            System.out.println(driver.getTitle());

            driver.navigate().to("https://myaccount.vndirect.com.vn/");
            Thread.sleep(2000);

            String title = driver.getTitle();

            System.out.println(title);

            WebElement input_username= driver.findElement(By.xpath("//input[@placeholder=\"Nhập tên đăng nhập\"]"));
            input_username.sendKeys("annhduc98");
            //input_username.clear();

            WebElement input_password= driver.findElement(By.id("typepassword"));
            input_password.sendKeys("Ab05131998");
            //input_username.clear();

            //Click vào button Login
            WebElement btn_Login= driver.findElement(By.xpath("//span[contains(text(),\"Đăng nhập\")]/parent::button"));
            btn_Login.click();
            Thread.sleep(2000);
            boolean checkstatus =driver.findElement(By.xpath("//div[@id=\"logo-image\"]")).isDisplayed();

            if(checkstatus==true){
                System.out.println("Đã login thành công");
            }




            Thread.sleep(2000);
            //Đóng trình duyệt
            //driver.quit();



        }

    }

