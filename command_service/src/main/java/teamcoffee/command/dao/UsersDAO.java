package teamcoffee.command.dao;

import command_service.entity.User;

public interface UsersDAO extends DAO<User> {
    User get(long chat_id);
}
