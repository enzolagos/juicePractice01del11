package pages.juiceShop;

import controlSelenium.Control;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class CustomerFeedbackPage {
    public TextBox feedbackTextBox = new TextBox(By.xpath("//*[@placeholder=\"What did you like or dislike?\"]"),"feedbackTextBox");
    public Control ratingBar = new Control(By.xpath("//*[@class=\"mat-slider-track-wrapper\"]"),"ratingBar");

}
