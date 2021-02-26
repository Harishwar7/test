package fw.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import fw.utility.Log;

public class General extends Global {
	
	//Re-Usable functions
	public void openApplication () {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("App opened");
		Reporter.log("App opened");
		Log.info("App opened");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login completed");
		Log.info("login completed");
	}
	public void logout(){
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout completed");
		Log.info("Logout completed");
	}
    public void addEmp() {
    	System.out.println("new employee added");
    }
    public void delEmp() {
    	System.out.println("delete emp");
    }
    public void closeApplication (){
		driver.close();
	}

}

