package com.backTel.telegram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;




@SpringBootApplication
public class App {
    public static void main(String[] args) {

        try{
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);

            SpringApplication.run(App.class, args);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }


    }
}
