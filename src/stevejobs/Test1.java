package stevejobs;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test1 {

	public static void main(String[] args) throws Exception {
		/*String s="aswani";
		char q='A';
		String p=s+q;
		
		System.out.println(p);*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int x=Integer.parseInt(sc.nextLine());
		String y=sc.nextLine();
		System.out.println(x);
		System.out.println(y+"pin y");
		System.setProperty("webdriver.chrome.driver", "E:\\batch241\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(10000);
		/*SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		Date d=new Date();
		String fname=sf.format(d)+".png";
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(fname);
		FileUtils.copyFile(src, dest);*/
		
	
		
	}

}
