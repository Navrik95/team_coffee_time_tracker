package teamcoffee.command.dao;

import command_service.entity.Team;

public interface TeamsDAO extends DAO<Team> {
    Team get(int id);
}
