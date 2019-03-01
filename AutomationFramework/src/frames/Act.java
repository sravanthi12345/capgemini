package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
		ChromeDriver d1=new ChromeDriver();
		d1.get("http://127.0.0.1/login.do");
		d1.findElement(By.name("username")).sendKeys("admin");
		d1.findElement(By.name("pwd")).sendKeys("manager");
		d1.findElement(By.xpath("//input[@type='submit']")).click();
		String s1=d1.getTitle();
		System.out.println(s1);
		d1.findElement(By.linkText("Users")).click();
		d1.findElement(By.xpath("//input[@value='Add New User']")).click();
		d1.findElement(By.name("username")).sendKeys("sravs5");
		d1.findElement(By.name("passwordText")).sendKeys("sravanthi");
		d1.findElement(By.name("passwordTextRetype")).sendKeys("sravanthi");
		d1.findElement(By.name("firstName")).sendKeys("mangalapalli");
		d1.findElement(By.name("lastName")).sendKeys("sravanthi1");
		d1.findElement(By.xpath("//input[contains(@value,'Create User')]")).click();
		d1.findElement(By.className("logoutImg")).click();
		d1.findElement(By.name("username")).sendKeys("sravs1");
		d1.findElement(By.name("pwd")).sendKeys("sravanthi");
		d1.findElement(By.xpath("//input[@type='submit']")).click();
		String s2=d1.getTitle();
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}

}
