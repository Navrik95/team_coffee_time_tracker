package teamcoffee.command.service;

import command_service.dto.RoleDTO;
import command_service.dto.TeamDTO;
import command_service.dto.UserDTO;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "command_service.service.UserCommandService")
public class UserCommandServiceImpl implements UserCommandService{

    @Override
    @WebMethod
    public boolean addUser(long chatId, String nickname, String name, String surname, TeamDTO teamDTO, RoleDTO roleDTO) {
        return false;
    }

    @Override
    @WebMethod
    public UserDTO getUserById(long chatId) {
        return null;
    }

    @Override
    @WebMethod
    public UserDTO getUser(String nickname) {

        return null;
    }

    @Override
    @WebMethod
    public List<UserDTO> getAllUsers() {
        return null;
    }

    @Override
    @WebMethod
    public boolean deleteUserById(long chatId) {
        return false;
    }

    @Override
    @WebMethod
    public boolean updateUser(UserDTO userDTO) {
        return false;
    }
}
