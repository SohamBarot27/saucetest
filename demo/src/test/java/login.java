import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login 
{
  @Test
  public void login_Demo() throws Exception
  {

    

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
    

    driver.get("https://www.saucedemo.com/");
    Thread.sleep(3000);

     WebElement usernameField = driver.findElement(By.name("user-name"));
        usernameField.sendKeys("standard_user");

        
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");

        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginButton.click();

        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Login failed!");
        Thread.sleep(3000);

        WebElement sidebar = driver.findElement(By.id("react-burger-menu-btn"));
        sidebar.click();

        Thread.sleep(3000);

        WebElement logoutButton = driver.findElement(By.id("react-burger-cross-btn"));
        logoutButton.click();

        Thread.sleep(3000);

        WebElement addtocartButton = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        addtocartButton.click();

        Thread.sleep(3000);
 
        WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
        cartButton.click();
       
        Thread.sleep(3000);

        WebElement checkoutButton = driver.findElement(By.name("checkout"));
        checkoutButton.click();

        driver.manage().window().maximize(); 
     
    
        WebElement firstname = driver.findElement(By.name("firstName"));
        firstname.sendKeys("sem");


        WebElement lastname = driver.findElement(By.name("lastName"));
        lastname.sendKeys("barot");

        
        WebElement pincodElement = driver.findElement(By.name("postalCode"));
        pincodElement.sendKeys("525252");

        Thread.sleep(3000);

       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,250)", "");

       Thread.sleep(2500);

       WebElement continueButton = driver.findElement(By.id("continue"));
       continueButton.click();

       JavascriptExecutor ps = (JavascriptExecutor) driver;
       ps.executeScript("window.scrollBy(0,250)", "");

       WebElement finishButton = driver.findElement(By.name("finish"));
       finishButton.click();

       Thread.sleep(2500);

       WebElement backtohomeButton = driver.findElement(By.name("back-to-products"));
      backtohomeButton.click();

        Thread.sleep(2500);

        JavascriptExecutor bs = (JavascriptExecutor) driver;
        bs.executeScript("window.scrollBy(0,-250)", "");

   }

}
