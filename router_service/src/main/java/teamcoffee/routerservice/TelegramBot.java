package teamcoffee.routerservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import teamcoffee.routerservice.handlers.MessageHandler;

public class TelegramBot extends TelegramLongPollingBot {
    MessageHandler messageHandler = new MessageHandler();
    private final String botName = "andersen_project_test_time_bot";
    private final String botToken = "5168333482:AAFmwhhCKGdvNVbSv7alIkvdQoKr6aeb0ss";

    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {
        Long chat_id = update.getMessage().getChatId();
        String message = update.getMessage().getText();
        try {
            execute(MessageHandler.messageHandle("user",chat_id,message));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

}
