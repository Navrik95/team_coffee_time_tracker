package teamcoffee.command.service;

import command_service.dto.RoleDTO;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "command_service.service.RoleCommandService")
public class RoleCommandServiceImpl implements RoleCommandService{

    @Override
    @WebMethod
    public boolean addRole(String roleName) {
        return false;
    }

    @Override
    @WebMethod
    public RoleDTO getRole(int roleId) {
        return null;
    }

    @Override
    @WebMethod
    public List<RoleDTO> getAllRoles() {
        return null;
    }

    @Override
    @WebMethod
    public boolean updateRole(RoleDTO roleDTO) {
        return false;
    }

    @Override
    @WebMethod
    public boolean deleteRoleById(int roleId) {
        return false;
    }
}
