package porject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myproj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.shophive.com/apple/mac");
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		
	        int linkcount = links.size();
		 for (WebElement myElement : links){
	         String link = myElement.getText(); 
	          
	        if (link !=""){

				java.util.List<WebElement> price = driver.findElements(By
						.className("price-box"));
				java.util.List<WebElement> product = driver.findElements(By
						.className("product-name"));

				try {
					for (int i = 0; i <= price.size(); i++) {

						System.out.println( "Product = "
								+ product.get(i).getText() + "\nPrice= "
								+ price.get(i).getText());

					}

				} catch (IndexOutOfBoundsException e) {
					System.out.println("data of next page");
				}
	            }
	            //Thread.sleep(5000);
	          } 
		driver.close();
	}

}
