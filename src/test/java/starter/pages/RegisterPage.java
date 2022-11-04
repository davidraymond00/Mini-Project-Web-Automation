package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    private By fieldNama() { return By.xpath("//div[label[text() = 'Nama Lengkap']]/input");}

    private By fieldEmail() { return By.xpath("//div[label[text() = 'Email']]/input");}

    private By fieldPassword() { return By.xpath("//div[label[text() = 'Password']]/input");}

    private By registerButton() { return By.xpath("//button/span[text() = 'Register']");}

    private By emailError() { return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div");}

    private By succes() { return By.xpath("//div[label[text() = 'Email']]/input");}

    public void openUrl() { openAt("/auth/register");}

    public void inputNama(String text) { $(fieldNama()) .type(text);}

    public void inputEmail(String email) { $(fieldEmail()) .type(email);}

    public void inputPassword(String password) { $(fieldPassword()) .type(password);}

    public void clickRegButton() { $(registerButton()) .click();}

    public void emailIsRequired() { $(emailError()) .isDisplayed();}

    public void succesRegis() { $(succes()) .isDisplayed();}


}