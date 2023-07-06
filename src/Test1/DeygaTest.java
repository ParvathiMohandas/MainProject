package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page1.DeygaPage;


public class DeygaTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://deyga.in");
	}
	@Test
	public void testing() throws InterruptedException
	{
		DeygaPage ob=new DeygaPage(driver);
		driver.manage().window().maximize();
		ob.signinbutton();
		Thread.sleep(3000);
		ob.login();
		Thread.sleep(3000);
		ob.setValues("parvathim2622@gmail.com","Parum#1998");
		Thread.sleep(3000);
		ob.click();
		Thread.sleep(3000);
		ob.skin();
		Thread.sleep(3000);
		ob.seye();
		Thread.sleep(6000);
		ob.ecream();
		Thread.sleep(6000);
		ob.add();
		Thread.sleep(3000);
		ob.inc();
		Thread.sleep(3000);
		ob.add1();
		Thread.sleep(3000);
		ob.remove();
		Thread.sleep(3000);
		ob.rcart();
		Thread.sleep(3000);
		ob.home();
		Thread.sleep(3000);
		ob.logo();
		Thread.sleep(3000);
		ob.search("cosmetics");
		Thread.sleep(3000);
		ob.sort();
		Thread.sleep(3000);
		ob.price();
		Thread.sleep(3000);
		ob.scroll();
		Thread.sleep(3000);
		ob.offer();
		Thread.sleep(3000);
		ob.image();
		Thread.sleep(3000);
		ob.hair();
		Thread.sleep(3000);
		ob.back();
		Thread.sleep(3000);
		ob.chat();
		Thread.sleep(3000);
		ob.home1();
		Thread.sleep(3000);
		ob.facebook();
		Thread.sleep(3000);
		ob.fb();
		Thread.sleep(3000);
		ob.windowh();
		Thread.sleep(3000);
		ob.logout();
		Thread.sleep(3000);
		ob.logout1();
		Thread.sleep(3000);
		ob.log1();
	
	}
}
