package pages.juiceShop;

import controlSelenium.Button;
import controlSelenium.Control;
import org.openqa.selenium.By;

public class HomePage {
    public Button dissmissPopUp = new Button(By.xpath("//*[@aria-label=\"Close Welcome Banner\"]"),"dissmissPopUp");
    public Button dissmissCookies = new Button(By.xpath("//*[@aria-label=\"dismiss cookie message\"]"),"dissmissCookies");
    public Button forcePageReload = new Button(By.xpath("//*[text()=\"Force page reload\"]"),"forcePageReload");
    public Button accountButton = new Button(By.id("navbarAccount"),"accountButton");
    public Button loginButton = new Button(By.id("navbarLoginButton"),"loginButton");
    public Button shoppingCartButton = new Button(By.xpath("//*[@aria-label = 'Show the shopping cart']"),"shoppingCartButton");
    public Button logoutButton = new Button(By.id("navbarLogoutButton"),"logoutButton");
    public Button ordersAndPaymentsButton = new Button(By.xpath("//button[@aria-label=\"Show Orders and Payment Menu\"]"),"ordersAndPaymentsButton");
    public Button addressesButton = new Button(By.xpath("//button[@aria-label=\"Go to saved address page\"]"),"addressesButton");
    public Button addAnAddressButton = new Button(By.xpath("//button[@aria-label=\"Add a new address\"]"),"addAnAddressButton");
    public Button sideBarButton = new Button(By.xpath("//*[@aria-label=\"Open Sidenav\"]"),"sideBarbutton");
    public Button feedbackButton = new Button(By.xpath("//*[@aria-label=\"Go to contact us page\"]"),"feedbackButton");



    public void deletePopUps(){
        dissmissPopUp.click();
        dissmissCookies.click();
        forcePageReload.click();
    }

}
