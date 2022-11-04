package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    private By cart() { return By.xpath("//i[contains(@class, 'v-icon notranslate fas fa-shopping-cart theme--dark')]");}

    private By cartt() { return By.xpath("//span[contains(@class, 'v-badge__badge primary')]");}

    private By detail() { return By.xpath("//div[text() = ' Order is empty! ']");}

    private By list() { return By.xpath("//div[text() = 'Total Qty']");}

    public void openUrll() { openAt("/");}

    public void openUrlItem() {openAt("/order");}

    public void cartBtn() { $(cart()).click();}

    public void cartItm() { $(cartt()).click();}

    public void detailInfrmtn() { $(detail()).isDisplayed();}

    public void listItem() { $(list()).isDisplayed();}
}

