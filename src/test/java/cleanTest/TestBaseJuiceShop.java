package cleanTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.juiceShop.*;
import singletonSession.Session;

public class TestBaseJuiceShop {
    public HomePage homePage = new HomePage();
    public LoginPage loginPage = new LoginPage();
    public RegisterPage registerPage = new RegisterPage();
    public AddAddressPage addAddressPage = new AddAddressPage();
    public CustomerFeedbackPage customerFeedbackPage = new CustomerFeedbackPage();
        @BeforeEach
        public void setup(){
            // todo create properties file
            Session.getInstance().getBrowser().get("http://localhost:3000/#/");
        }
        @AfterEach
        public void cleanup(){
            Session.getInstance().closeBrowser();
        }

        //para solucionar el server error que causaba date
        static String getAlphaNumericString(int n)
        {
            // chose a Character random from this String
            String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    + "0123456789"
                    + "abcdefghijklmnopqrstuvxyz";

            // create StringBuffer size of AlphaNumericString
            StringBuilder sb = new StringBuilder(n);

            for (int i = 0; i < n; i++) {

                // generate a random number between
                // 0 to AlphaNumericString variable length
                int index
                        = (int)(AlphaNumericString.length()
                        * Math.random());

                // add Character one by one in end of sb
                sb.append(AlphaNumericString
                        .charAt(index));
            }

            return sb.toString();
        }
    }
