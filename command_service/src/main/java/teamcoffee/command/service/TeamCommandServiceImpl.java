package teamcoffee.command.service;

import command_service.dto.TeamDTO;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "command_service.service.TeamCommandService")
public class TeamCommandServiceImpl implements TeamCommandService{

    @Override
    @WebMethod
    public boolean addTeam(String teamName, String color) {
        return false;
    }

    @Override
    @WebMethod
    public TeamDTO getTeam(int teamId) {
        return null;
    }

    @Override
    @WebMethod
    public List<TeamDTO> getAllTeams() {
        return null;
    }

    @Override
    @WebMethod
    public boolean updateTeam(TeamDTO teamDTO) {
        return false;
    }

    @Override
    @WebMethod
    public boolean deleteTeamById(int teamId) {
        return false;
    }
}
