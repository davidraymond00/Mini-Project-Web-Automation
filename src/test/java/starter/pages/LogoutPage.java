package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {

    private By ikon() { return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");}

    private By login() { return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[1]");}

    private By human() { return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");}

    private By logout() { return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span/i");}

    private By dash() { return By.xpath("//*[@id=\"app\"]/div/header/div/div[1]/h3");}

    public void openUrl() { openAt("/");}

    public void ikonB() { $(ikon()).click();}

    public void humanBtn() { $(human()).click();}

    public void logoutBtn() { $(logout()).click();}

    public void dashboard() { $(dash()).isDisplayed();}

    public void loginPage() { $(login()).isDisplayed();}
}
