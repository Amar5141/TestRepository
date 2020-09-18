package main.java.com.amazon.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonAutomation {
        public static void main(String[] args) throws InterruptedException {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhijeet\\Desktop\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.amazon.in");
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                Thread.sleep(2000);
                System.out.println("sleep ends...");

                /* SIGN IN PROCESS BEGINS */
                driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();// SELECT SIGN IN OPTION
                Thread.sleep(500);
                driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("automationtesting150920@gmail.com"); // SELECT
                                                                                                                   // EMAIL
                                                                                                                   // BOX
                                                                                                                   // AND
                                                                                                                   // SEND
                                                                                                                   // EMAIL
                Thread.sleep(500);
                driver.findElement(By.xpath(
                                "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input"))
                                .click(); // CLICK ON CONTINUE
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("automation@testing");// SELECT PASSWORD
                                                                                                      // BOX AND SEND
                                                                                                      // PASSWORD
                Thread.sleep(500);
                driver.findElement(By.xpath("//*[@id='signInSubmit']")).click(); // CLICK ON SIGN IN
                System.out.println("SIGN IN SUCCESSFULLY...");
                Thread.sleep(1000);
                /* SIGN IN PROCESS ENDS - SUCCESSFULL SIGN IN */

                /* SEARCH ITEM USING SEARCH ICON */ /* ADD ITEM TO CART THEN REMOVE ITEM FROM CART */
                driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch"); // FIND SEARCH BOX AND WRITE 'watch'
                Thread.sleep(200);
                driver.findElement(By.xpath("//input[@class='nav-input' and @value='Go' ]")).click();// CLICK ON SEARCH
                                                                                                     // ICON
                System.out.println("Search using icon is Successfull...");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//a[@data-click-index='0']")).click(); // CLICK ON ITEM
                Thread.sleep(1000);
                driver.findElement(By.id("add-to-cart-button")).click(); // ADD TO CART
                Thread.sleep(1000);
                driver.findElement(By.id("hlb-view-cart-announce")).click(); // OPEN CART
                Thread.sleep(500);
                driver.findElement(By.xpath("//input[@data-action='delete']")).click(); // DELETE FROM CART
                Thread.sleep(2000);

                /* SEARCH ITEM USING MENU */ /* ADD ITEM TO WISHLIST' */
                driver.findElement(By.cssSelector("a#nav-hamburger-menu")).click(); // OPEN SIDE MENU
                Thread.sleep(2000);
                driver.findElement(By.xpath("//a[@ data-menu-id='8']")).click(); // SELECT "Mobiles, Computers"
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[8]/li[3]/a")).click(); // SELECT "All Mobile
                                                                                                // Phones"
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id='leftNav']/ul[5]/div/li[4]/span/span/div/label/input")).click(); // CLICK
                                                                                                                      // ON
                                                                                                                      // SAMSUNG
                                                                                                                      // CHECKBOX
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driver.findElement(By.cssSelector(
                                "#search > div.s-desktop-width-max.s-opposite-dir > div > div.sg-col-20-of-24.s-matching-dir.sg-col-28-of-32.sg-col-16-of-20.sg-col.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div.sg-col-4-of-24.sg-col-4-of-12.sg-col-4-of-36.s-result-item.s-asin.sg-col-4-of-28.sg-col-4-of-16.AdHolder.sg-col.sg-col-4-of-20.sg-col-4-of-32 > div > span > div > div > div > div > div:nth-child(3) > h2 > a"))
                                .click(); // SELECT ITEM
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).click(); // ADD TO WISHLIST
                Thread.sleep(500);
                driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click(); // SELECT "About Us"
        }
}
