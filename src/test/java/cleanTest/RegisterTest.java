package cleanTest;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.juiceShop.*;
import singletonSession.Session;

public class RegisterTest extends TestBaseJuiceShop {
    @Test
    @Order(2)
    @DisplayName("Verify user can register successfully")
    @Description("This test case is to verify user can register")
    @Owner("Ensodado")
    @Link("www.jira.com/doc01")
    @Issue("www.jira.com/bug01")
    @Epic("Register")
    @Feature("CRUD register")
    @Severity(SeverityLevel.NORMAL)
    public void verifyUserCanRegisterLoginLogout() throws InterruptedException {
        //Seteo datos
        String userMail = getAlphaNumericString(7)+"@gmail.com";
        String password = ""+getAlphaNumericString(7);
        String loginURL = "http://localhost:3000/#/login";
        String registerUrl = "http://localhost:3000/#/register";

        homePage.deletePopUps();
        //Register
        homePage.accountButton.click();
        homePage.loginButton.click();
        Session.getInstance().waitURLToChange(loginURL);
        loginPage.newAccountButton.click();
        Session.getInstance().waitURLToChange(registerUrl);
        registerPage.registerUser(userMail,password);
        Assertions.assertTrue(loginPage.registrationSuccessfully.isControlDisplayed(), "Error no se registro el usuario");

        //Login
        loginPage.emailLoginTextBox.setText(userMail);
        loginPage.passwordLoginTextBox.setText(password);
        loginPage.loginButton.click();
        Assertions.assertTrue(homePage.shoppingCartButton.isControlDisplayed(), "Error el usuario no se logueo");

        //Logout
        homePage.accountButton.click();
        homePage.logoutButton.click();
        Assertions.assertFalse(homePage.shoppingCartButton.isControlDisplayed(), "Error el usuario no se deslogueo");

    }
}

