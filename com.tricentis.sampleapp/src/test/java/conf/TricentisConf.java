package conf;

import java.io.ObjectInputFilter.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TricentisConf {
public static WebDriver driver;
	
	public static void abrir(String url) {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.get(url);
	}
	
	public static void close() {
		driver.close();
		driver = null;
	}
	
	public static WebElement seletorCss(String valor) {
		return TricentisConf.driver.findElement(By.cssSelector(valor));		
	}

}
