package teamcoffee.routerservice.handlers.interfaces;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface ProfileCommands {

    /** Просмотр профиля ученика */
    SendMessage viewUserProfile(Long chat_id, String message);

    /** Редактирование имени ученика */
    SendMessage editUserName(Long chat_id, String message);

    /** Редактирование фамилии ученика */
    SendMessage editUserSurName(Long chat_id, String message);
}
