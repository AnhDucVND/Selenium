import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {
            WebDriver driver=null;
            System.setProperty("webdriver.chrome.driver","D:\\AKA\\Dang ki package\\Browser\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver =new ChromeDriver();
            driver.get("https://www.thegioididong.com/");
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());
            driver.quit();

        }

    }

