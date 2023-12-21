package e.web.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		
		// Set the path to the Chromedriver executable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vipsr\\selenium webdriver\\ChromeDriver\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		
		Thread.sleep(2000);
        // Open the e-commerce website
        driver.get("https://www.amazon.com/");
        
        Thread.sleep(2000);
		driver.manage().window().maximize();

        // Perform actions on the website
        		
		Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("christmas mug");
        
        Thread.sleep(2000);
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
        
   
        Thread.sleep(1000);
        driver.findElement(By.linkText("Coffee Glass Christmas Mugs Santa Claus Double Walled Coffee Mug Cute Mug Double Coffee Glass Tea Cup Milk Cup Best Gift for Women, Men ,Kid")).click();
        
        
        // For example, search for a product and add it to the cart
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-button")).click();
        
       // Proceed to checkout
       Thread.sleep(1000);
       driver.findElement(By.name("proceedToRetailCheckout")).click();
       
       // Close the browser//
       Thread.sleep(2000);
       driver.close();
      
    }
}

