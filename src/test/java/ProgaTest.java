import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgaTest {

    private String url;
    private WebDriver driver;
    private String user1Name = "Spider Man";
    private String user1Telephone = "380503911544";
    private String user2Name = "Deadpool";
    private String user2Telephone = "380676973878";
    private String user3Name = "Iron Man";
    private String user3Telephone = "380634623804";
    private String addButtonElement = "//i[@class='mdi-content-add']";
    private String namePoleElement = "//input[@id='icon_prefix']";
    private String telephonePoleElement = "//input[@id='icon_telephone']";
    private String dropdownListElement = "input.select-dropdown";
    private String roleStudentElement = "/html/body/div/div[2]/form/div[2]/div/ul/li[3]/span";
    private String roleSupportElement = "/html/body/div/div[2]/form/div[2]/div/ul/li[2]/span";
    private String roleAdminElement = "/html/body/div/div[2]/form/div[2]/div/ul/li[1]/span";
    private String createButtonElement = "div.col a.save-btn.waves-effect.waves-light.btn";


    @Before

    public void beforeMethod(){
        driver = new ChromeDriver();
        url = "http://37.59.228.229:3000/";
        driver.get(url);
    }



    @Test //создать юзера с ролью "Student"
    public void testProgram() {
        driver.findElement(By.xpath(addButtonElement)).click();
        driver.findElement(By.xpath(namePoleElement)).clear();
        driver.findElement(By.xpath(namePoleElement)).sendKeys(user1Name);
        driver.findElement(By.xpath(telephonePoleElement)).clear();
        driver.findElement(By.xpath(telephonePoleElement)).sendKeys(user1Telephone);
        driver.findElement(By.cssSelector(dropdownListElement)).click();
        driver.findElement(By.xpath(roleStudentElement)).click();
        driver.findElement(By.cssSelector(createButtonElement)).click();

    }

    @Test //создать юзера с ролью "Administrator"
    public void testProgram1() {
        driver.findElement(By.xpath(addButtonElement)).click();
        driver.findElement(By.xpath(namePoleElement)).clear();
        driver.findElement(By.xpath(namePoleElement)).sendKeys(user2Name);
        driver.findElement(By.xpath(telephonePoleElement)).clear();
        driver.findElement(By.xpath(telephonePoleElement)).sendKeys(user2Telephone);
        driver.findElement(By.cssSelector(dropdownListElement)).click();
        driver.findElement(By.xpath(roleAdminElement)).click();
        driver.findElement(By.cssSelector(createButtonElement)).click();
    }
    @Test //создать юзера с ролью "Support"
    public void testProgram3() {
        driver.findElement(By.xpath(addButtonElement)).click();
        driver.findElement(By.xpath(namePoleElement)).clear();
        driver.findElement(By.xpath(namePoleElement)).sendKeys(user3Name);
        driver.findElement(By.xpath(telephonePoleElement)).clear();
        driver.findElement(By.xpath(telephonePoleElement)).sendKeys(user3Telephone);
        driver.findElement(By.cssSelector(dropdownListElement)).click();
        driver.findElement(By.xpath(roleSupportElement)).click();
        driver.findElement(By.cssSelector(createButtonElement)).click();

    }

    @After

    public void afterMethod(){
        driver.quit();
    }
}