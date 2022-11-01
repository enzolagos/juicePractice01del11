package pages.juiceShop;

import controlSelenium.*;
import org.openqa.selenium.By;

public class AddAddressPage {
    public TextBox countryTextBox = new TextBox(By.xpath("//*[@placeholder = \"Please provide a country.\"]"),"countryTextBox");
    public TextBox nameTextBox = new TextBox(By.xpath("//*[@placeholder = \"Please provide a name.\"]"),"nameTextBox");
    public TextBox numberTextBox = new TextBox(By.xpath("//*[@placeholder = \"Please provide a mobile number.\"]"),"numberTextBox");
    public TextBox zipCodeTextBox = new TextBox(By.xpath("//*[@placeholder = \"Please provide a ZIP code.\"]"),"zipCodeTextBox");
    public TextBox addressTextBox = new TextBox(By.xpath("//*[@placeholder = \"Please provide an address.\"]"),"addressTextBox");
    public TextBox cityTextBox = new TextBox(By.xpath("//*[@placeholder = \"Please provide a city.\"]"),"cityTextBox");
    public TextBox stateTextBox = new TextBox(By.xpath("//*[@placeholder = \"Please provide a state.\"]"),"stateTextBox");
    public Button submitButton = new Button(By.id("submitButton"),"submitButton");
    public Control rowAddress = new Control(By.xpath("//mat-row[@role= \"row\"]"),"rowAddress");

    public Control getRowAddressByState(String state){
        return new Control(By.xpath("//mat-row[@role= \"row\"]/mat-cell[contains(text(),'"+state+"')]"),"rowAddress");
    }






}
