package ru.pflb.at.helpers;

import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.HarLog;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.IOException;

/**
 * Created by user on 22.06.2017.
 */
public class DriverProxy {

    private BrowserMobProxyServer browserMobProxy;

    /**
     * Конструктор
     * @param port порт
     */
    DriverProxy(int port){
        browserMobProxy = new BrowserMobProxyServer();
        browserMobProxy.setTrustAllServers(true);
        browserMobProxy.start(port);
        browserMobProxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
        browserMobProxy.newHar("proxy data");
    }

    /**
     * Формирует прокси для драйвера
     * @return объект класса SeleniumProxy
     */
    Proxy getSeleniumProxy(){

        if(browserMobProxy == null){
            throw new WebDriverException("proxy object not found");
        }
        return ClientUtil.createSeleniumProxy(browserMobProxy);
    }

    /**
     * Очищает данные в текущем прокси
     */
    void clearCurrentData(){
        if(browserMobProxy == null){
            throw new WebDriverException("proxy object not found");
        }
        browserMobProxy.getHar().setLog(new HarLog());
        browserMobProxy.newHar("proxy data");

    }

    /**
     * Останавливает прокси-сервер
     */
    void stop(){
        if(browserMobProxy == null){
            throw new WebDriverException("proxy object not found");
        }
        browserMobProxy.stop();
    }


    /**
     * Сохраняет текущие данные в файл
     * @param file
     * @throws IOException
     */
    void saveDataToFile(File file) throws IOException{
        if(browserMobProxy == null){
            throw new WebDriverException("proxy object not found");
        }
        browserMobProxy.getHar().writeTo(file);
        clearCurrentData();

    }


}
