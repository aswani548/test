package stevejobs;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","E:\\batch241\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	
	String[] x= {"aswani","ravi","rayidi"};
	String y="";
	y=y.join(",", x);
	System.out.println(y);
	

	}

}
