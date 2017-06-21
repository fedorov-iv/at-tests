package ru.pflb.at.steps;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ru.pflb.at.Config;
import ru.pflb.at.pages.EmployeesPage;
import ru.pflb.at.pages.LoginPage;

/**
 * Created by user on 21.06.2017.
 */
public class TestSteps {

    @Given("Запускаем под хромом")
    public void setChrome(){
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\user\\Downloads\\chromedriver.exe");
        Configuration.browser = Config.browser;
    }

    @Given("Выполнен вход в систему")
    public void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.navigate();
        loginPage.login(Config.username, Config.password);

    }

    @And("Удалить сотрудника")
    public void deleteEmployee(){
        EmployeesPage employeesPage = new EmployeesPage();
        //employeesPage.navigate(); // вызывает ошибку, т.к. index.jsp - это и форма авторизации, и страница "Люди"
        employeesPage.deleteEmployee(0);
    }

    @Then("Сотрудник удален")
    public  void  employeeIsDeleted(){
        EmployeesPage employeesPage = new EmployeesPage();
        employeesPage.employeeIsDeleted();
    }


}
