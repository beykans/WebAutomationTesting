import java.util.ArrayList;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://selenium.dev/");
		//WebDriver driver = new ChromeDriver();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void WebTeting1() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.turkishairlines.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement searchBoxFrom = driver.findElement(By.id("fromPort"));
		searchBoxFrom.sendKeys("istanbul");
		Thread.sleep(3000);
		WebElement searchBoxTo = driver.findElement(By.id("toPort"));
		searchBoxTo.sendKeys("londra");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"tab-panel-0\"]/div/div/div[2]/div/div[3]/button"));
		button.click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	@Test
	public void WebTeting2() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://careers.turkishairlines.com/tr-TR/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_HplImageLink1\"]"));
		button1.click();
		Thread.sleep(3000);
		WebElement button2 = driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div[1]/ul/li[4]/a"));
		button2.click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	@Test
	public void WebTeting3() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://careers.turkishairlines.com/tr-TR/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"MenuLink\"]"));
		button.click();
		Thread.sleep(3000);
		
		driver.navigate().to(button.getAttribute("href"));
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        if (tabs.size() > 1) {
            driver.switchTo().window(tabs.get(1));
        } 
		
		WebElement searchBoxFrom = driver.findElement(By.id("C_E_POSTA"));
		searchBoxFrom.sendKeys("beykan_sevdar@hotmail.com");
		Thread.sleep(1000);
		WebElement searchBoxTo = driver.findElement(By.id("C_SIFRE"));
		searchBoxTo.sendKeys("Fearless12!");
		Thread.sleep(1000);
		WebElement button2 = driver.findElement(By.id("C_ButtonOK"));
		button2.click();
		Thread.sleep(4000);
		WebElement button3 = driver.findElement(By.id("LogOut"));
		button3.click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
