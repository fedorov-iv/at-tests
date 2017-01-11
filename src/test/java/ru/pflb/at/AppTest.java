package ru.pflb.at;

import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;
import ru.pflb.at.pages.LoginPage;

/**
 * Created by ifedor on 11.01.17.
 */
public class AppTest {

    @Test
    public void openMainPage(){

        open(Config.baseUrl);
    }

    @Test
    public void login(){

        LoginPage loginPage = new LoginPage();
        loginPage.navigate();
        loginPage.login(Config.username, Config.password);
    }
}
