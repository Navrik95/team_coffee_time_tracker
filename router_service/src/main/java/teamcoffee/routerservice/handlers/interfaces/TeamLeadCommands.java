package teamcoffee.routerservice.handlers.interfaces;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface TeamLeadCommands {

    /** Отправка сообщения о начале работы с ботом */
    SendMessage startMessage(Long chat_id, String message);

    /** Просмотр профиля TeamLead */
    SendMessage viewUserProfile(Long chat_id, String message);

    /** Редактирование имени TeamLead */
    SendMessage editUserName(Long chat_id, String message);

    /** Редактирование фамилии TeamLead */
    SendMessage editUserSurName(Long chat_id, String message);

    /** Получение списка всех учеников и в какой они группе */
    SendMessage getAllUsersWithGroupName(Long chat_id, String message);

    /** Получение списка всех групп */
    SendMessage getAllGroups(Long chat_id, String message);

    /** Получение списка учеников группы */
    SendMessage getGroupUsers(Long chat_id, String message);

    /** Создание нового трекинга */
    SendMessage startTracking(Long chat_id, String message);

    /** Получение названия задачи */
    SendMessage taskName(Long chat_id, String message);

    /** Завершение трекинга по текущей задаче */
    SendMessage stopTracking(Long chat_id, String message);

    /** Получение списка всех команд */
    SendMessage helpCommand(Long chat_id, String message);
}
