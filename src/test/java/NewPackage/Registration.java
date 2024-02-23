package NewPackage;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Registration {
	public WebDriver driver;
  @Test
  public void Regester_Process() throws Exception {
	  
	  //Forms_1
	  driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']")).click();
	  Thread.sleep(3000);
	  
	  //First_Name
	  driver.findElement(By.id("firstName")).sendKeys("Kumar");
	  Thread.sleep(3000);
	  //Last_Nmae
	  driver.findElement(By.id("lastName")).sendKeys("Varma");
	  Thread.sleep(3000);
	  //Email
	  driver.findElement(By.id("userEmail")).sendKeys("varma123@gmail.com");
	  Thread.sleep(3000);
	  //Gender
	  driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
	  Thread.sleep(3000);
	  //Mobile_Number
	  driver.findElement(By.id("userNumber")).sendKeys("1234567891");
	  Thread.sleep(3000);
	  
	  //DOB
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  Thread.sleep(3000);
	      //Month
	      new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("April");
	      Thread.sleep(3000);
	      //Year
	      new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("2001");
	      Thread.sleep(3000);
	      //Date
	      driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[6]")).click();
	      Thread.sleep(3000);
	     
	  //Subjects
	    driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
	    Thread.sleep(3000);
	    driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
	    //driver.findElement(By.id("subjectsInput")).sendKeys(Keys.TAB);
	    Thread.sleep(3000);
	    driver.findElement(By.id("subjectsInput")).sendKeys("English");
	    Thread.sleep(3000);
	    driver.findElement(By.id("subjectsInput")).sendKeys(Keys.TAB);
	    Thread.sleep(3000);
	  
	  //Hobbies
	  driver.findElement(By.xpath("//label[normalize-space()='Sports']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//label[normalize-space()='Music']")).click();
	  Thread.sleep(3000);
	  
	  //Picture
	  driver.findElement(By.id("uploadPicture")).sendKeys("E:\\A\\ANIL\\MY COLLECTIONS\\Avinash Sir 20200512_222135.jpg");
	  Thread.sleep(3000);
	  
	  //Address
	  driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
	  Thread.sleep(3000);
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  Thread.sleep(3000);
	  
	  //State
	  driver.switchTo().activeElement().sendKeys("NCR");
	  driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  Thread.sleep(3000);
	  
	  //City
	  driver.switchTo().activeElement().sendKeys("Delhi");
	  driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  Thread.sleep(3000);
	  
	  //Submit
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
	      
  }
  @BeforeTest
  public void OpenURL() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
  }

}
