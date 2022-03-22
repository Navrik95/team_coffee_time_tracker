package teamcoffee.routerservice.handlers;


import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import teamcoffee.routerservice.handlers.interfaces.UserCommands;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMessageSender implements UserCommands {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public SendMessage startMessage(Long chat_id, String message) {
        String text = "Привет! Я тебе буду помогать с трекингом! Вот что я умею:\n" +
                "/viewprofile - покажу информацию о твоём профиле\n" +
                "/editusername - отредактировать имя\n" +
                "/editusersurname - отредактировать фамилию\n" +
                "/starttracking - старт трекинга по задаче\n" +
                "/taskname - получить имя задачи с которой работаешь\n" +
                "/stoptracking - стоп трекинга по задаче\n" +
                "/help - напомню свои команды!\n" +
                "Буду рад помогать тебе!";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage viewUserProfile(Long chat_id, String message) {
        String text = "Вот так сейчас выглядит твой профиль:";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage editUserName(Long chat_id, String message) {
        String text = "Напиши имя";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage editUserSurName(Long chat_id, String message) {
        String text = "Напиши фамилию";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage startTracking(Long chat_id, String message) {
        Date date = new Date();
        String text = "Напиши имя задачи над которой ты будешь работать";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage taskName(Long chat_id, String message) {
        String text = "Ты сейчас работаешь над задачей: ";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage stopTracking(Long chat_id, String message) {
        Date date = new Date();
        String text = "Напиши короткий коментарий о проделанной работе";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage helpCommand(Long chat_id, String message) {
        String text = "/viewprofile - покажу информацию о твоём профиле\n" +
                "/editusername - отредактировать имя\n" +
                "/editusersurname - отредактировать фамилию\n" +
                "/starttracking - старт трекинга по задаче\n" +
                "/taskname - получить имя задачи с которой работаешь\n" +
                "/stoptracking - стоп трекинга по задаче\n";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }
}
