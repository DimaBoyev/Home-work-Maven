import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgaTest {

    private String url;
    private WebDriver driver;

    @Before

        public void beforeMethod(){
        driver = new ChromeDriver();
        url = "http://37.59.228.229:3000/";
        driver.get(url);
    }



    @Test //создать юзера с ролью "Student"
    public void testProgram() {
        driver.findElement(By.xpath("//i[@class='mdi-content-add']")).click();
        driver.findElement(By.xpath("//input[@id='icon_prefix']")).clear();
        driver.findElement(By.xpath("//input[@id='icon_prefix']")).sendKeys("Spider Man");
        driver.findElement(By.xpath("//input[@id='icon_telephone']")).clear();
        driver.findElement(By.xpath("//input[@id='icon_telephone']")).sendKeys("380503911544");
        driver.findElement(By.cssSelector("input.select-dropdown")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/ul/li[3]/span")).click();
        driver.findElement(By.cssSelector("div.col a.save-btn.waves-effect.waves-light.btn")).click();

    }

    @Test //создать юзера с ролью "Administrator"
    public void testProgram1() {
        driver.findElement(By.xpath("//i[@class='mdi-content-add']")).click();
        driver.findElement(By.xpath("//input[@id='icon_prefix']")).clear();
        driver.findElement(By.xpath("//input[@id='icon_prefix']")).sendKeys("Deadpool");
        driver.findElement(By.xpath("//input[@id='icon_telephone']")).clear();
        driver.findElement(By.xpath("//input[@id='icon_telephone']")).sendKeys("380676973878");
        driver.findElement(By.cssSelector("input.select-dropdown")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/ul/li[1]/span")).click();
        driver.findElement(By.cssSelector("div.col a.save-btn.waves-effect.waves-light.btn")).click();
    }
    @Test //создать юзера с ролью "Support"
    public void testProgram3() {
        driver.findElement(By.xpath("//i[@class='mdi-content-add']")).click();
        driver.findElement(By.xpath("//input[@id='icon_prefix']")).clear();
        driver.findElement(By.xpath("//input[@id='icon_prefix']")).sendKeys("Iron Man");
        driver.findElement(By.xpath("//input[@id='icon_telephone']")).clear();
        driver.findElement(By.xpath("//input[@id='icon_telephone']")).sendKeys("380634623804");
        driver.findElement(By.cssSelector("input.select-dropdown")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/ul/li[2]/span")).click();
        driver.findElement(By.cssSelector("div.col a.save-btn.waves-effect.waves-light.btn")).click();

    }

    @After

    public void afterMethod(){
        driver.quit();
    }
}
