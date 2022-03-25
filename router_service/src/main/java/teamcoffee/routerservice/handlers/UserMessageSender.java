package teamcoffee.routerservice.handlers;


import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import teamcoffee.routerservice.handlers.interfaces.DefaultCommands;
import teamcoffee.routerservice.handlers.interfaces.ProfileCommands;
import teamcoffee.routerservice.handlers.interfaces.TrackingCommands;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UserMessageSender implements DefaultCommands, ProfileCommands, TrackingCommands {

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
