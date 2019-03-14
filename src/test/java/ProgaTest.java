import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgaTest {

    @Test //создать юзера с ролью "Student"
    public void testProgram() {
        WebDriver drovulichka = new ChromeDriver();
        drovulichka.get("http://37.59.228.229:3000/");
        drovulichka.findElement(By.xpath("//i[@class='mdi-content-add']")).click();
        drovulichka.findElement(By.xpath("//input[@id='icon_prefix']")).clear();
        drovulichka.findElement(By.xpath("//input[@id='icon_prefix']")).sendKeys("Spider Man");
        drovulichka.findElement(By.xpath("//input[@id='icon_telephone']")).clear();
        drovulichka.findElement(By.xpath("//input[@id='icon_telephone']")).sendKeys("380503911544");
        drovulichka.findElement(By.cssSelector("input.select-dropdown")).click();
        drovulichka.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/ul/li[3]/span")).click(); //создать юзера с ролью "Student"
        drovulichka.findElement(By.cssSelector("div.col a.save-btn.waves-effect.waves-light.btn")).click();

    }

    @Test //создать юзера с ролью "Administrator"
    public void testProgram1() {
        WebDriver drovishka = new ChromeDriver();
        drovishka.get("http://37.59.228.229:3000/");
        drovishka.findElement(By.xpath("//i[@class='mdi-content-add']")).click();
        drovishka.findElement(By.xpath("//input[@id='icon_prefix']")).clear();
        drovishka.findElement(By.xpath("//input[@id='icon_prefix']")).sendKeys("Deadpool");
        drovishka.findElement(By.xpath("//input[@id='icon_telephone']")).clear();
        drovishka.findElement(By.xpath("//input[@id='icon_telephone']")).sendKeys("380676973878");
        drovishka.findElement(By.cssSelector("input.select-dropdown")).click();
        drovishka.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/ul/li[1]/span")).click();
        drovishka.findElement(By.cssSelector("div.col a.save-btn.waves-effect.waves-light.btn")).click();
    }
    @Test //создать юзера с ролью "Support" и выберем локацию "Одесса"
    public void testProgram3() {
        WebDriver drova = new ChromeDriver();
        drova.get("http://37.59.228.229:3000/");
        drova.findElement(By.xpath("//i[@class='mdi-content-add']")).click();
        drova.findElement(By.xpath("//input[@id='icon_prefix']")).clear();
        drova.findElement(By.xpath("//input[@id='icon_prefix']")).sendKeys("Iron Man");
        drova.findElement(By.xpath("//input[@id='icon_telephone']")).clear();
        drova.findElement(By.xpath("//input[@id='icon_telephone']")).sendKeys("380634623804");
        drova.findElement(By.cssSelector("input.select-dropdown")).click();
        drova.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/ul/li[2]/span")).click();
        drova.findElement(By.cssSelector("div.col a.save-btn.waves-effect.waves-light.btn")).click();

    }
}
