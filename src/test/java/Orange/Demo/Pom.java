package Orange.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	public WebDriver driver;
	public Pom(WebDriver runner_driver)
	{
		this.driver=runner_driver;
		 PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(name="firstName")
	private  WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}
	
	
	@FindBy(name="middleName")
	private WebElement middlename;
	public WebElement getMiddlename() {
		return middlename;
	}
	public void setMiddlename(WebElement middlename) {
		this.middlename = middlename;
	}
	@FindBy(name="lastName")
	private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}
	
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
	private WebElement empid;
	public WebElement getEmpid() {
		return empid;
	}
	public void setEmpid(WebElement empid) {
		this.empid = empid;
	}
	


	

}
