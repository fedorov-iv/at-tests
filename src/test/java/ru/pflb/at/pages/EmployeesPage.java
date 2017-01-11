package ru.pflb.at.pages;

import ru.pflb.at.Config;
import static com.codeborne.selenide.Selenide.open;

/**
 * Страница "Люди"
 */
public class EmployeesPage extends InnerPage {


    public void navigate(){
        open(Config.baseUrl + "/matrixboard2/index.jsp");

    }


}
