package Orange.Demo;

import org.openqa.selenium.WebDriver;



public class pagemanager {
	private WebDriver driver;
    private Pom h1;
    public pagemanager(WebDriver driver)
    {
        this.driver = driver;
        
}
    public Pom getinstancehp()
    {
    	h1 = new Pom(driver);
        return h1;
        
    }
}