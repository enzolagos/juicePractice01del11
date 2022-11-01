package cleanTest;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class AdressTest extends TestBaseJuiceShop{
    @Test
    @Order(1)
    @DisplayName("Verify user can add an adress successfully")
    @Description("This test case is to verify user can add an address")
    @Owner("Ensodado")
    @Link("www.jira.com/doc01")
    @Issue("www.jira.com/bug01")
    @Epic("Address")
    @Feature("Addresses Saved")
    @Severity(SeverityLevel.NORMAL)
    public void verifyUserCanAddAnAdress(){
        //Seteo datos
        String user = "enzoenzo@gmail.com";
        String password = "enzoenzo";
        String country = "Argentina";
        String name = "Enzo";
        String number = "123456789";
        String zipCode = "1426";
        String address = "A la vuelta de la esquina";
        String city = "San patricio del chanar";
        String state = "Neuquen";

        //Login
        homePage.deletePopUps();
        homePage.accountButton.click();
        homePage.loginButton.click();
        loginPage.emailLoginTextBox.setText(user);
        loginPage.passwordLoginTextBox.setText(password);
        loginPage.loginButton.click();
        Assertions.assertTrue(homePage.shoppingCartButton.isControlDisplayed(), "Error el usuario no se logueo");

        //Test
        homePage.accountButton.click();
        homePage.ordersAndPaymentsButton.click();
        homePage.addressesButton.click();
        Session.getInstance().waitURLToChange("http://localhost:3000/#/address/saved");
        homePage.addAnAddressButton.click();
        Session.getInstance().waitURLToChange("http://localhost:3000/#/address/create");
        addAddressPage.countryTextBox.setText(country);
        addAddressPage.nameTextBox.setText(name);
        addAddressPage.numberTextBox.setText(number);
        addAddressPage.zipCodeTextBox.setText(zipCode);
        addAddressPage.addressTextBox.setText(address);
        addAddressPage.cityTextBox.setText(city);
        addAddressPage.stateTextBox.setText(state);
        addAddressPage.submitButton.click();
        Assertions.assertTrue(addAddressPage.getRowAddressByState(state).isControlDisplayed(), "No se creo la direccion");


    }
}
