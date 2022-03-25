package teamcoffee.routerservice.handlers.interfaces;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface TrackingCommands {

    /** Создание нового трекинга */
    SendMessage startTracking(Long chat_id, String message);

    /** Получение названия задачи */
    SendMessage taskName(Long chat_id, String message);

    /** Завершение трекинга по текущей задаче */
    SendMessage stopTracking(Long chat_id, String message);
}
