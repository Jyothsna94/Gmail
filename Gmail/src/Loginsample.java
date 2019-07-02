import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginsample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
				driver.get("https://www.gmail.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("identifierId")).sendKeys("jyothsna@ramersoft.com");
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		Thread.sleep(2000);	 
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/span/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("ramer@143");		 
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/header/div[2]/div[3]/div/div[2]/div[2]/div/a/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
		 //driver.close();
		
	}

}
