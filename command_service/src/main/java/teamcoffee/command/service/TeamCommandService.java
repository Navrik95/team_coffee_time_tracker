package teamcoffee.command.service;

import command_service.dto.TeamDTO;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface TeamCommandService {

    /** Создание группы */
    @WebMethod
    boolean addTeam(String teamName, String color);

    /** Получение группы */
    @WebMethod
    TeamDTO getTeam(int teamId);

    /** Получение всех групп */
    @WebMethod
    List<TeamDTO> getAllTeams();

    /** Изменение группы */
    @WebMethod
    boolean updateTeam(TeamDTO teamDTO);

    /** Удаление группы */
    @WebMethod
    boolean deleteTeamById(int teamId);
}
