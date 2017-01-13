package ru.pflb.at;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import ru.pflb.at.pages.EmployeesPage;
import ru.pflb.at.pages.InnerPage;
import ru.pflb.at.pages.LoginPage;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.close;



public class AppTest {


    @Before
    public void setUp() throws Exception {
        //System.setProperty("webdriver.chrome.driver", "/Users/ifedor/Downloads/chromedriver");

        //Configuration.browser = Config.browser;
    }




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

    /**
     * Тест-кейс: удаление сотрудника
     * */
    @Test
    public void deleteEmployee(){

        LoginPage loginPage = new LoginPage();
        loginPage.navigate();
        loginPage.login(Config.username, Config.password);

        EmployeesPage employeesPage = new EmployeesPage();
        //employeesPage.navigate(); // вызывает ошибку, т.к. index.jsp - это и форма авторизации, и страница "Люди"
        employeesPage.deleteEmployee(0);

    }

    @After
    public void tearDown(){
        close();
    }
}
