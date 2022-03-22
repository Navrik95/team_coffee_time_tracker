package teamcoffee.routerservice.handlers;


import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import teamcoffee.routerservice.handlers.interfaces.AdminCommands;

public class AdminMessageSender implements AdminCommands {
    @Override
    public SendMessage startMessage(Long chat_id, String message) {
        String text = "Привет! я буду помогать тебе админить:) Вот что я умею:\n" +
                "/viewprofile - покажу информацию о твоём профиле\n" +
                "/editusername - отредактировать имя\n" +
                "/editusersurname - отредактировать фамилию\n" +
                "/createuser - создание нового пользователя\n" +
                "/edituser - изменение пользователя\n" +
                "/deleteuser - удалить пользователя\n" +
                "/assigngroupuser - добавить пользователя в группу\n" +
                "/creategroup - создание новой группы\n" +
                "/editgroup - отредактировать информацию о группе\n" +
                "/deletegroup - удалить группу\n" +
                "/createsettingsreport - создание нового правила для отправки отчётов\n" +
                "/editsettingsreport - редактирование правила отправки отчётов\n" +
                "/deletesettingsreport - удаление правила отправки отчётов\n" +
                "/getalluserswithgroupname - Получение списка всех учеников и в какой они группе\n" +
                "/getallgroups - получение списка всех групп\n" +
                "/getgroupusers - Получение списка учеников группы\n" +
                "/help - напомню свои команды!\n" +
                "Буду рад тебе помочь!";
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
    public SendMessage createUser(Long chat_id, String message) {
        String text = "Напиши через запятую: Имя, Фамилию, и уровень его доступа Админ/Преподователь/TeamLead/Студент";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage editUser(Long chat_id, String message) {
        String text = "Напиши через запятую новые данные: Имя, Фамилию, и уровень его доступа Админ/Преподователь/TeamLead/Студент";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage deleteUser(Long chat_id, String message) {
        String text = "Напиши nickname кого нужно удалить";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage assignGroupUser(Long chat_id, String message) {
        String text = "Напиши через запятую nickname и в какую групу его добавить";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage createGroup(Long chat_id, String message) {
        String text = "Напиши через запятую название группы и её цвет";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage editGroup(Long chat_id, String message) {
        String text = "Напиши через запятую новые данные группы: название группы и её цвет";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage deleteGroup(Long chat_id, String message) {
        String text = "Напиши название группы которую нужно уалить";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage createSettingsReport(Long chat_id, String message) {
        String text = "Напиши через запятую настройки для нового отчёта: время, частота, nickname Преподователя";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage editSettingsReport(Long chat_id, String message) {
        String text = "Напиши через запятую новые настройки для отчёта: время, частота, nickname Преподователя";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }

    @Override
    public SendMessage deleteSettingsReport(Long chat_id, String message) {
        String text = "Напиши какой отчёт нужно удалить";
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
        String text = "/viewprofile - покажу информацию о твоём профиле\n" +
                "/editusername - отредактировать имя\n" +
                "/editusersurname - отредактировать фамилию\n" +
                "/createuser - создание нового пользователя\n" +
                "/edituser - изменение пользователя\n" +
                "/deleteuser - удалить пользователя\n" +
                "/assigngroupuser - добавить пользователя в группу\n" +
                "/creategroup - создание новой группы\n" +
                "/editgroup - отредактировать информацию о группе\n" +
                "/deletegroup - удалить группу\n" +
                "/createsettingsreport - создание нового правила для отправки отчётов\n" +
                "/editsettingsreport - редактирование правила отправки отчётов\n" +
                "/deletesettingsreport - удаление правила отправки отчётов\n" +
                "/getalluserswithgroupname - Получение списка всех учеников и в какой они группе\n" +
                "/getallgroups - получение списка всех групп\n" +
                "/getgroupusers - Получение списка учеников группы\n";
        return SendMessage.builder().chatId(chat_id.toString()).text(text).build();
    }
}
