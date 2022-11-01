package pages.juiceShop;

import controlSelenium.*;
import org.openqa.selenium.By;

public class LoginPage {
    public Button newAccountButton = new Button(By.xpath("//*[text()=\"Not yet a customer?\"]"),"newAccountButton");
    public Label registrationSuccessfully = new Label(By.xpath("//*[contains(text(),\"Registration completed successfully\")]"),"registrationSuccessfullyLabel");
    public TextBox emailLoginTextBox = new TextBox(By.id("email"),"emailLoginTextBox");
    public TextBox passwordLoginTextBox = new TextBox(By.id("password"),"passwordLoginTextBox");
    public Button loginButton = new Button(By.id("loginButton"),"passwordLoginTextBox");

}
