package pages.juiceShop;

import controlSelenium.*;
import org.openqa.selenium.By;

public class RegisterPage {
    public TextBox emailTextBox = new TextBox(By.id("emailControl"),"emailTextBox");
    public TextBox passwordTextBox = new TextBox(By.id("passwordControl"),"passwordTextBox");
    public TextBox repeatPasswordTextBox = new TextBox(By.id("repeatPasswordControl"),"repeatPasswordTextBox");
    public Control questionCombobox = new Control(By.xpath("//*[@name=\"securityQuestion\"]"),"questionCombobox");
    public TextBox answerTextBox = new TextBox(By.id("securityAnswerControl"),"answerTextBox");
    public OptionFromList firstAnswerOption = new OptionFromList(By.id("mat-option-3"),"firstAnswerOption");
    public Button registerButton = new Button(By.id("registerButton"),"registerButton");

    public void registerUser(String userMail, String password){
        emailTextBox.setText(userMail);
        passwordTextBox.setText(password);
        repeatPasswordTextBox.setText(password);
        questionCombobox.click();
        questionCombobox.waitUntilChangeState("aria-expanded","true");
        firstAnswerOption.click();
        answerTextBox.setText(password);
        registerButton.click();
    }

}
