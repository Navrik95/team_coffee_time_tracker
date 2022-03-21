package teamcoffee.routerservice.handlers.interfaces;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface UserCommands {

    /** Отправка сообщения о начале работы с ботом */
    SendMessage startMessage(Long chat_id, String message);

    /** Просмотр профиля ученика */
    SendMessage viewUserProfile(Long chat_id, String message);

    /** Редактирование имени ученика */
    SendMessage editUserName(Long chat_id, String message);

    /** Редактирование фамилии ученика */
    SendMessage editUserSurName(Long chat_id, String message);

    /** Создание нового трекинга */
    SendMessage startTracking(Long chat_id, String message);

    /** Получение названия задачи */
    SendMessage taskName(Long chat_id, String message);

    /** Завершение трекинга по текущей задаче */
    SendMessage stopTracking(Long chat_id, String message);

    /** Получение списка всех команд */
    SendMessage helpCommand(Long chat_id, String message);
}
