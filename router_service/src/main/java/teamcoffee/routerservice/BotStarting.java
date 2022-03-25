package teamcoffee.routerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class BotStarting {
    public static void main(String[] args) {

        TelegramBotsApi telegramBotsApi;

        {
            try {
                telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
                telegramBotsApi.registerBot(new TelegramBot());
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

    }
}
