package teamcoffee.routerservice.handlers.interfaces;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface AdminCommands {

    /** Отправка сообщения о начале работы с ботом */
    SendMessage startMessage(Long chat_id, String message);

    /** Просмотр профиля Admin */
    SendMessage viewUserProfile(Long chat_id, String message);

    /** Редактирование имени Admin */
    SendMessage editUserName(Long chat_id, String message);

    /** Редактирование фамилии Admin */
    SendMessage editUserSurName(Long chat_id, String message);

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

    /** Получение списка всех учеников и в какой они группе */
    SendMessage getAllUsersWithGroupName(Long chat_id, String message);

    /** Получение списка всех групп */
    SendMessage getAllGroups(Long chat_id, String message);

    /** Получение списка учеников группы */
    SendMessage getGroupUsers(Long chat_id, String message);

    /** Получение списка всех команд */
    SendMessage helpCommand(Long chat_id, String message);
}
