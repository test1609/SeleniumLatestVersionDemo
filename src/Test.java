import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Test {
	public static void main(String a[]){
		//here we need version of Firefox >=47 and geckodriver.exe
		System.out.println("inside main");
		System.setProperty("webdriver.gecko.driver", "D://bench/gecko/geckodriver.exe");
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(cap);
		
//		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
	}
}
