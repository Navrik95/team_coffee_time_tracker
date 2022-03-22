package teamcoffee.command.service;

import command_service.dto.RoleDTO;
import command_service.dto.TeamDTO;
import command_service.dto.UserDTO;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface UserCommandService {

    /** Создание пользователя */
    @WebMethod
    boolean addUser(long chatId, String nickname, String name, String surname, TeamDTO teamDTO, RoleDTO roleDTO);

    /** Получение пользователя по chatId */
    @WebMethod
    UserDTO getUserById(long chatId);

    /** Получение пользователя по нику */
    @WebMethod
    UserDTO getUser(String nickname);

    /** Получение всех пользователей */
    @WebMethod
    List<UserDTO> getAllUsers();

    /** Удаление пользователя */
    @WebMethod
    boolean deleteUserById(long chatId);

    /** Изменение пользователя */
    @WebMethod
    boolean updateUser(UserDTO userDTO);
}
