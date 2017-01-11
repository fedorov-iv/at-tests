package ru.pflb.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.pflb.at.Config;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Страница авторизации
 */
public class LoginPage {

    public SelenideElement getUsernameField() {
        return $("#login-username");
    }

    public SelenideElement getPasswordField() {
        return $("#login-password");
    }

    public SelenideElement getSubmitButton() {
        return $("#login-button");
    }

    public void navigate(){
        open(Config.baseUrl + "/matrixboard2");
    }

    public void login(String username, String password){

        this.getUsernameField().setValue(username);
        this.getPasswordField().setValue(password);
        this.getSubmitButton().click();


    }
}
