package teamcoffee.routerservice.handlers;


import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import teamcoffee.routerservice.handlers.interfaces.DefaultCommands;
import teamcoffee.routerservice.handlers.interfaces.GroupViewCommands;


public class LectorMessageSender implements DefaultCommands, GroupViewCommands {


    @Override
    public SendMessage startMessage(Long chat_id, String message) {
        String text = "Привет! Я буду присылать тебе ежедневные отчёты студентов" +
                "и уведомления если кто то 3 дня не будет делать трекинги из студентов. Вот что я умею:\n" +
                "/getalluserswithgroupname - Получение списка всех учеников и в какой они группе\n" +
                "/getallgroups - Получение списка всех групп\n" +
                "/getgroupusers - Получение списка учеников группы\n" +
                "/help - напомню свои команды!\n" +
                "Буду рад помогать тебе!";
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
    public SendMessage helpCommand(Long chat_id, String message) {
        String text = "/getalluserswithgroupname - Получение списка всех учеников и в какой они группе\n" +
                "/getallgroups - Получение списка всех групп\n" +
                "/getgroupusers - Получение списка учеников группы";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

}
