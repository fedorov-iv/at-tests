package ru.pflb.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.pflb.at.Config;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;

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

    /**
     * Возвращает элемент ссылки "Люди"
     *
     * @return SelenideElement ссылка "Люди"
     */
    public SelenideElement getEmployeeLink() {
        return $(By.linkText("Люди"));
    }

    /**
     * Возвращает элемент ссылки "Поиск"
     *
     * @return SelenideElement ссылка "Поиск"
     */
    public SelenideElement getSearchLink() {
        return $(By.linkText("Поиск"));
    }

    /**
     * Возвращает элемент ссылки "Должности"
     *
     * @return SelenideElement ссылка "Должности"
     */
    public SelenideElement getPositionsLink() {
        return $(By.linkText("Должности"));
    }

    /**
     * Возвращает элемент ссылки "Компетенции"
     *
     * @return SelenideElement ссылка "Компетенции"
     */
    public SelenideElement getQualificationsLink() {
        return $(By.linkText("Компетенции"));
    }

    /**
     * Возвращает элемент ссылки "Медали"
     *
     * @return SelenideElement ссылка "Медали"
     */
    public SelenideElement getMedalsLink() {
        return $(By.linkText("Медали"));
    }

    /**
     * Переход на страницу
     */

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
