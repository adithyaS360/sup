import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://saucedemo.com");
    }
}
