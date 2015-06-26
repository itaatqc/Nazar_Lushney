

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.softserve.edu.Helper;
import com.softserve.edu.SendMail;



public class SendOnMail {
    private WebDriver driver;
    private Helper helper;
//    private final static Logger helperLogger = Logger.getLogger(SendMail.class);
 

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
//        helperLogger.info("Browser start");
        
        helper = new Helper(driver);
    }

    @Test
    public void send() {
    	driver.get("http://weather.i.ua/");
    	SendMail.SendMailToInbox(helper.getFormatedWeather());

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
