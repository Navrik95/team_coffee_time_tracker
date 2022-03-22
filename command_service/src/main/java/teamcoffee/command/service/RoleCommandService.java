package teamcoffee.command.service;

import command_service.dto.RoleDTO;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface RoleCommandService {

    /** Создание роли */
    @WebMethod
    boolean addRole(String roleName);

    /** Получение роли */
    @WebMethod
    RoleDTO getRole(int roleId);

    /** Получение всех ролей */
    @WebMethod
    List<RoleDTO> getAllRoles();

    /** Изменение роли */
    @WebMethod
    boolean updateRole(RoleDTO roleDTO);

    /** Удаление роли */
    @WebMethod
    boolean deleteRoleById(int roleId);
}
