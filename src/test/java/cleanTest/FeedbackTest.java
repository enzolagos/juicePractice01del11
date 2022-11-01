package cleanTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class FeedbackTest extends TestBaseJuiceShop{
    @Test
    public void verifyUserCanWriteAFeedback() throws InterruptedException {
        //Seteo datos
        String user = "enzoenzo@gmail.com";
        String password = "enzoenzo";
        //Login
        homePage.deletePopUps();
        homePage.accountButton.click();
        homePage.loginButton.click();
        loginPage.emailLoginTextBox.setText(user);
        loginPage.passwordLoginTextBox.setText(password);
        loginPage.loginButton.click();
        Assertions.assertTrue(homePage.shoppingCartButton.isControlDisplayed(), "Error el usuario no se logueo");
        //Test
        homePage.sideBarButton.click();
        homePage.feedbackButton.click();
        Session.getInstance().waitURLToChange("http://localhost:3000/#/contact");
        customerFeedbackPage.feedbackTextBox.setText("Blablablablablabla");
        //falta terminar


    }
}
