package teamcoffee.routerservice.handlers;

import handlers.interfaces.TeamLeadCommands;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TeamLeadMessageSender implements TeamLeadCommands {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public SendMessage startMessage(Long chat_id, String message) {
        String text = "Привет! Я тебе буду помогать с трекингом" +
                " и буду присылать тебе уведомления если кто то не отправит отчёт. Вот что я умею:\n" +
                "/viewprofile - покажу информацию о твоём профиле\n" +
                "/editusername - отредактировать имя\n" +
                "/editusersurname - отредактировать фамилию\n" +
                "/getalluserswithgroupname - Получение списка всех учеников и в какой они группе\n" +
                "/getallgroups - Получение списка всех групп\n" +
                "/getgroupusers - Получение списка учеников группы\n" +
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
    public SendMessage getAllUsersWithGroupName(Long chat_id, String message) {
        String text = "";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage getAllGroups(Long chat_id, String message) {
        String text = "";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage getGroupUsers(Long chat_id, String message) {
        String text = "";
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
                "/getalluserswithgroupname - Получение списка всех учеников и в какой они группе\n" +
                "/getallgroups - Получение списка всех групп\n" +
                "/getgroupusers - Получение списка учеников группы\n" +
                "/starttracking - старт трекинга по задаче\n" +
                "/taskname - получить имя задачи с которой работаешь\n" +
                "/stoptracking - стоп трекинга по задаче\n";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }
}
