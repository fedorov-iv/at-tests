package ru.pflb.at.pages;

import ru.pflb.at.Config;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

/**
 * Страница "Люди"
 */
public class EmployeesPage extends InnerPage {

    @Override
    public void navigate(){
        open(Config.baseUrl + "/matrixboard2/index.jsp");
    }

    public ElementsCollection getEmployees() {
        return $$("#persons div");
    }

    public SelenideElement getEmployee(int index) {
        return $("#persons div", index);
    }

    public void deleteEmployee(int index){
        this.getEmployees().shouldHave(sizeGreaterThan(0));

        //SelenideElement employee = this.getEmployee(index);
        $(By.xpath("//div[@title='Удалить человека']"), index).click();
        $(By.xpath("//button/span[text()='Да']")).click();


    }

    public void employeeIsDeleted(){
        $(By.xpath("//td[@id='success-text' and text()='Человек удален.']"));
    }


}
