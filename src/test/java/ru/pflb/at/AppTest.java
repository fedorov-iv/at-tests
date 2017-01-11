package ru.pflb.at;

import org.junit.Test;
import ru.pflb.at.pages.InnerPage;
import ru.pflb.at.pages.LoginPage;


public class AppTest {



    /**
     * Тест-кейс: авторизация
     * */
    @Test
    public void login(){

        LoginPage loginPage = new LoginPage();
        loginPage.navigate();
        loginPage.login(Config.username, Config.password);
    }


    /**
     * Тест-кейс: авторизация и выход
     * */
    @Test
    public void loginAndLogout(){

        LoginPage loginPage = new LoginPage();
        loginPage.navigate();
        loginPage.login(Config.username, Config.password);

        InnerPage innerPage = new InnerPage();
        innerPage.logout();


    }
}
