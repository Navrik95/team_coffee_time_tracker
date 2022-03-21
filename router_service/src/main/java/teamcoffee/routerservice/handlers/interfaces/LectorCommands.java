package teamcoffee.routerservice.handlers.interfaces;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface LectorCommands {

    /** Отправка сообщения о начале работы с ботом */
    SendMessage startMessage(Long chat_id, String message);

    /** Получение списка всех учеников и в какой они группе */
    SendMessage getAllUsersWithGroupName(Long chat_id, String message);

    /** Получение списка всех групп */
    SendMessage getAllGroups(Long chat_id, String message);

    /** Получение списка учеников группы */
    SendMessage getGroupUsers(Long chat_id, String message);

    /** Получение списка всех команд */
    SendMessage helpCommand(Long chat_id, String message);
}
