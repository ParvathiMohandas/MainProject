package Page1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeygaPage {
WebDriver driver;
	
	By deygas=By.xpath("//*[@id=\"Header__Wrapper\"]/div[4]/nav/ul/li[1]/div[1]");
	By deygal=By.xpath("//*[@id=\"Header__Wrapper\"]/div[4]/nav/ul/li[1]/div[2]/ul/li[1]/a");
	By deygae=By.xpath("//*[@id=\"customer_login\"]/div[1]/input");
	By deygap=By.xpath("//*[@id=\"customer_login\"]/div[2]/input");
	By deygal1=By.xpath("//*[@id=\"customer_login\"]/button");
	By deygaskin=By.xpath("//*[@id=\"Header__Wrapper\"]/div[2]/nav/ul/li[1]/a");
	By deygatoner=By.xpath("/html/body/div[10]/div[1]/div[2]/header/div[1]/div[2]/nav/ul/li[1]/div/ul/li[9]/a");
	By deygac=By.xpath("/html/body/div[10]/main/div[1]/section/div[4]/div[2]/div/div/div/div[6]/div/div/div[1]/a/div/img[2]");
	By deygaq=By.xpath("/html/body/div[10]/main/div[1]/section/div[1]/div[2]/div[1]/div/form/div[4]/div/button[2]");
	By deygadd=By.xpath("/html/body/div[10]/main/div[1]/section/div[1]/div[2]/div[1]/div/form/div[5]/button/span");
	By deygasub=By.xpath("/html/body/div[9]/form/div[1]/div[3]/div/div[1]/div/div[2]/div[2]/div/div/a[1]");
	By deygare=By.xpath("/html/body/div[9]/form/div[1]/div[3]/div/div[1]/div/div[2]/div[2]/a");
	By deygaclose=By.xpath("/html/body/div[9]/form/div[1]/div[2]/button");
	By deygahome=By.xpath("//*[@id=\"main\"]/nav/ol/li[1]/a");
	By deygalogo=By.xpath("//*[@id=\"Header__Wrapper\"]/div[3]/div/a/img");
	By deygasearch=By.xpath("//*[@id=\"search-desktop\"]/input");
	By deygasort=By.xpath("/html/body/div[10]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/div/div/span/span/span");
	By deygasp=By.xpath("/html/body/div[10]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/div/div/span/ul/li[3]/a");
	By deygachat=By.cssSelector("#imageicon");
	By deyof=By.xpath("//*[@id=\"Header__Wrapper\"]/div[2]/nav/ul/li[4]/a");
	By deyi=By.xpath("/html/body/div[12]/a/img");
	By deyhair=By.xpath("/html/body/div[10]/main/div[1]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/img");
	By deyback=By.xpath("/html/body/div[10]/main/div[1]/div[1]/div/div[3]/div[2]/a");
	By deyhome=By.xpath("/html/body/div[10]/div[1]/div[2]/header/div[1]/div[3]/div/a/img");
	By deylogout=By.xpath("/html/body/div[10]/div[1]/div[2]/header/div[1]/div[4]/nav/ul/li[1]/div[2]/ul/li[3]/a");
	By deyfacebook=By.xpath("/html/body/div[10]/div[3]/footer/div[2]/div[1]/ul/ul/li[1]/a/span/img");
	By deywc=By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[1]/div/div[2]/div/div/div/div[1]/div/i");
			
	
	public DeygaPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void signinbutton()
	{
		Actions actions=new Actions(driver);
		WebElement s=driver.findElement(deygas);
		actions.moveToElement(s).perform();
	}
	public void login()
	{
		driver.findElement(deygal).click();;
	}
	public void setValues(String email,String pass)
	{
		driver.findElement(deygae).sendKeys(email);
		driver.findElement(deygap).sendKeys(pass);
		
	}
	public void click()
	{
		driver.findElement(deygal1).click();

	}
	
	public void skin()
	{
		Actions actions=new Actions(driver);
		WebElement i=driver.findElement(deygaskin);
		actions.moveToElement(i).perform();
	}
	public void seye()
	{
		driver.findElement(deygatoner).click();;
	}
	public void ecream() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
		WebElement c=wait.until(ExpectedConditions.visibilityOfElementLocated(deygac));
		c.click();
	}
	public void add()
	{
		driver.findElement(deygaq).click();
	}
	
	public void inc()
	{
		driver.findElement(deygadd).click();
	}
	public void add1()
	{
		driver.findElement(deygasub).click();
	}
	public void remove()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
		WebElement r=wait.until(ExpectedConditions.visibilityOfElementLocated(deygare));
		r.click();
	
	}
	public void rcart()
	{
	    driver.findElement(deygaclose).click();
		driver.navigate().back();
	}
	public void home()
	{
		driver.navigate().back();
	}
	public void logo()
	{
		WebElement d=driver.findElement(deygalogo);
		boolean e=d.isDisplayed();
		System.out.println(e);
	}
	public void search(String searchs)
	{
		WebElement v=driver.findElement(deygasearch);
		v.sendKeys(searchs);
		v.sendKeys(Keys.RETURN);
	}
	public void sort()
	{
		Actions actions=new Actions(driver);
		WebElement i=driver.findElement(deygasort);
		actions.moveToElement(i).perform();
	}
	
	public void price()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(900));
		WebElement p=wait.until(ExpectedConditions.visibilityOfElementLocated(deygasp));
		p.click();
	}
	public void scroll()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450);");
	}
	
	public void offer()
	{
		driver.navigate().back();
		WebElement t=driver.findElement(deyof);
		String n=t.getText();
		System.out.println("Text is:"+n);
		
	}
	public void image()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
		WebElement i=wait.until(ExpectedConditions.visibilityOfElementLocated(deyi));
		i.click();
	}
	public void hair()
	{
		driver.findElement(deyhair).click();
	}
	public void back() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400);");
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
		WebElement b=wait.until(ExpectedConditions.visibilityOfElementLocated(deyback));
		b.click();
	}
	public void chat()
	{
		driver.findElement(deygachat).click();
	}
	public void home1()
	{
		driver.findElement(deyhome).click();
	}
	
	public void facebook()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000);");
	}
	public void fb() throws InterruptedException
	{
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1100));
		WebElement f=wait.until(ExpectedConditions.visibilityOfElementLocated(deyfacebook));
		f.click();
	}
	public void windowh()
	{
		String parentWindow=driver.getWindowHandle();
		Set<String> allWindowHandles=driver.getWindowHandles();
		for(String handle:allWindowHandles)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(deywc).click();
			}
			driver.switchTo().window(parentWindow);
		}
		
	}
	public void logout()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000);");
	}
	public void logout1()
	{
		Actions actions=new Actions(driver);
		WebElement s=driver.findElement(deygas);
		actions.moveToElement(s).perform();
	}
	public void log1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.findElement(deylogout).click();
	}
		
}
