package Bai6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class demo {

    public static void main(String[] args) throws Exception {
        //WebDriver driver=null;
        System.setProperty("webdriver.chrome.driver","D:\\AKA\\Dang ki package\\Browser\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        //Set thoi gian cho mac dinh cho tat ca cac step
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.thegioididong.com/");
        //Chuyển sang full màn hình
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        driver.navigate().to("https://myaccount.vndirect.com.vn/login");
        Thread.sleep(2000);

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
        Thread.sleep(2000);
        if(checkstatus==true){
            System.out.println("Đã login thành công");
        }
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div/span[contains(text(),\"Tháp tài sản\")]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//p[contains(text(),\"DBOND\")]")).click();
        Thread.sleep(2000);

        WebElement frame=driver.findElement(By.xpath("//iframe"));

        driver.switchTo().frame(frame);
        Thread.sleep(2000);

        List<WebElement> thList= driver.findElements(By.xpath("(//table)[1]/descendant::th"));
        Thread.sleep(2000);

        for (int i=0;i<thList.size();i++){
            System.out.println(thList.get(i).getText());
        }








        Thread.sleep(2000);
        //Đóng trình duyệt
        //driver.quit();



    }

}
