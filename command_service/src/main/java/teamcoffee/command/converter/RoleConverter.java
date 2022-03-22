package teamcoffee.command.converter;

import command_service.dto.RoleDTO;
import command_service.entity.Role;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

public class RoleConverter {
    private final ModelMapper modelMapper;

    public RoleConverter() {
        this.modelMapper = new ModelMapper();
    }

    public RoleDTO roleToRoleDTO(Role role) {
        return modelMapper.map(role, RoleDTO.class);
    }

    public Role roleDTOToRole(RoleDTO roleDTO) {
        return modelMapper.map(roleDTO, Role.class);
    }

    public List<RoleDTO> listToDTOList(List<Role> roleList) {
        return modelMapper.map(roleList, new TypeToken<List<RoleDTO>>() {}.getType());
    }

    public List<Role> listDTOToList(List<RoleDTO> roleDTOList) {
        return modelMapper.map(roleDTOList, new TypeToken<List<Role>>() {}.getType());
    }
}
