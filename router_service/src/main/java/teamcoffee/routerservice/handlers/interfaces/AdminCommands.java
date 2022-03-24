package teamcoffee.routerservice.handlers.interfaces;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface AdminCommands {

    /** Добавление сотрудника */
    SendMessage createUser(Long chat_id, String message);

    /** Редактирование сотрудника  */
    SendMessage editUser(Long chat_id, String message);

    /** Удаление сотрудника  */
    SendMessage deleteUser(Long chat_id, String message);

    /** Присвоение группы сотруднику */
    SendMessage assignGroupUser(Long chat_id, String message);

    /** Создание группы */
    SendMessage createGroup(Long chat_id, String message);

    /** Редактирование группы */
    SendMessage editGroup(Long chat_id, String message);

    /** Удаление группы */
    SendMessage deleteGroup(Long chat_id, String message);

    /** Создание правил отправки отчётов */
    SendMessage createSettingsReport(Long chat_id, String message);

    /** Редактирование правила отправки отчётов */
    SendMessage editSettingsReport(Long chat_id, String message);

    /** Удаление правила отправки отчётов */
    SendMessage deleteSettingsReport(Long chat_id, String message);
    
}
