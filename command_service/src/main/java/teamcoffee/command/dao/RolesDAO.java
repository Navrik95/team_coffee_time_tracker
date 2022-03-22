package teamcoffee.command.dao;

import command_service.entity.Role;

public interface RolesDAO extends DAO<Role> {
    Role get(int id);
}
