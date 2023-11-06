import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Orange.Demo.Base;
import Orange.Demo.pagemanager;

public class NewTest extends Base {

	  @Test
	public void getUrl() throws Throwable
	{
		
		  
		    driver=Base.browerLaunch("chrome");
		    
		    pagemanager pom=new pagemanager(driver);
		  
		  getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	            WebElement name = driver.findElement(By.name("username"));
	            name.sendKeys("Admin");

	            WebElement password = driver.findElement(By.name("password"));
	            password.sendKeys("admin123");

	            WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
	            login.click();
	            Thread.sleep(3000);
;
	            WebElement pim = driver.findElement(By.xpath("//span[text()='PIM']"));
	            pim.click();
	            Thread.sleep(3000);

	            WebElement addEmployee = driver.findElement(By.xpath("//a[text()='Add Employee']"));
	            addEmployee.click();
      
	            
	      
	            String get=getValuesfromExcel("Sheet1",2,2);
	            sendText(pom.getinstancehp().getFirstname(),get);
	            System.out.println(get);
	            
	           }
	        
	           
	  
	            
	            
	            

	    
	    }

