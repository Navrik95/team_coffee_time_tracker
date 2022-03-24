package teamcoffee.routerservice.handlers.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface DefaultCommands {

    /** Отправка сообщения о начале работы с ботом */
    SendMessage startMessage(Long chat_id, String message);

    /** Получение списка всех команд */
    SendMessage helpCommand(Long chat_id, String message);
}
