package JDBC_CONN;
import java.sql.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JDBC_Con {
public static void main (String	args[]) throws Exception {
	String host="localhost";
			String port ="3306";
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

			//WebDriver driver = new ChromeDriver();
//driver.get("https://www.google.com/");
Connection con= DriverManager.getConnection("jdbc:mysql://" + host +  ":" + port +"/ecommerce", "root", "Sahithi@123");
  Statement r=con.createStatement();
 ResultSet rs=r.executeQuery("select * from employees where name ='Sa'");
 while(rs.next()) {
 System.out.println(rs.getString("Address"));
 System.out.println(rs.getInt("Id"));
String a=rs.getString("Address");
System.out.println(a);
//driver.findElement(By.xpath("//div[@class='a4bIc']")).

 
 
 
 }
}
	

}
