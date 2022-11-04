package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailPage extends PageObject {

    private By detail() { return By.xpath("//button/span[text() = 'Detail']");}

    private By click() { return By.xpath("//span[text() = 'gaming']");}

    public void openUrl() { openAt("/");}

    public void detailBtn() { $(detail()).click();}

    public void infrmation() {$(click()).isDisplayed();}
}
