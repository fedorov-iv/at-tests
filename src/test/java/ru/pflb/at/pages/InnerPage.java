package ru.pflb.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.pflb.at.Config;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Базовый класс внутренних страниц
 * Предоставляет доступ к основному меню и кнопке выхода
 */
public class InnerPage {

    /**
     * Возвращает элемент кнопки выхода
     *
     * @return SelenideElement кнопка выхода
     */
    public SelenideElement getLogoutButton() {
        return $("#logout span");
    }

    public void navigate() {
        open(Config.baseUrl + "/matrixboard2/index.jsp");
    }

    /**
     * Выход
     */
    public void logout() {
        this.getLogoutButton().click();
    }


}
