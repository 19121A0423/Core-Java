package org.november.solid;



public interface Device1 {
    void turnOn();

    void turnOff();

    void playMedia();

    void browseInternet();
}
//above code violates interfacee segregation

interface BasicFunctionality {
    void turnOn();

    void turnOff();
}

interface MediaPlayer {
    void playMedia();
}

interface InternetBrowser {
    void browseInternet();
}
