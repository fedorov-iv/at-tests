package ru.pflb.at;

import org.junit.Test;
import ru.pflb.at.pages.InnerPage;
import ru.pflb.at.pages.LoginPage;


public class AppTest {


    @Test
    public void login(){

        LoginPage loginPage = new LoginPage();
        loginPage.navigate();
        loginPage.login(Config.username, Config.password);
    }

    @Test
    public void loginAndLogout(){

        LoginPage loginPage = new LoginPage();
        loginPage.navigate();
        loginPage.login(Config.username, Config.password);

        InnerPage innerPage = new InnerPage();
        innerPage.logout();


    }
}
