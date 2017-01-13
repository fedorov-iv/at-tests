package ru.pflb.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.pflb.at.Config;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Страница авторизации
 */
public class LoginPage {

    /**
    * Возвращает элемент поля ввода логина
    *@return  SelenideElement поле ввода логина
    */
    public SelenideElement getUsernameField() {
        return $("#login-username");
    }

    /**
     * Возвращает элемент поля ввода пароля
     *@return  SelenideElement поле ввода пароля
     */
    public SelenideElement getPasswordField() {
        return $("#login-password");
    }

    /**
     * Возвращает элемент кнопки отправки формы
     *@return  SelenideElement кнопка входа
     */
    public SelenideElement getSubmitButton() {
        return $("#login-button");
    }

    /**
     * Переход на страницу авторизации
     */
    public void navigate(){
        open(Config.baseUrl + "/matrixboard2");
    }


    /**
     * Заполенение полей логин и пароль и отправка формы авторизации
     *@param username имя пользователя
     *@param password пароль
     */
    public void login(String username, String password){

        this.getUsernameField().setValue(username);
        this.getPasswordField().setValue(password);
        this.getSubmitButton().click();


    }
}
