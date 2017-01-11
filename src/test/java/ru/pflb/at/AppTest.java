package ru.pflb.at;

import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by ifedor on 11.01.17.
 */
public class AppTest {

    @Test
    public void openMainPage(){

        open("http://at.pflb.ru");
    }
}
