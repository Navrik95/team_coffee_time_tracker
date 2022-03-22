package teamcoffee.command.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserDTO {

    /** Чат id пользователя */
    @XmlElement
    private long chatId;

    /** Ник пользователя */
    @XmlElement
    private String nickname;

    /** Имя пользователя */
    @XmlElement
    private String name;

    /** Фамилия пользователя */
    @XmlElement
    private String surname;

    /** Группа пользователя */
    @XmlElement
    private TeamDTO teamDTO;

    /** Роль пользователя */
    @XmlElement
    private RoleDTO roleDTO;

    public UserDTO(Long chatId, String nickname, String name, String surname, TeamDTO teamDTO, RoleDTO roleDTO) {
        this.chatId = chatId;
        this.nickname = nickname;
        this.name = name;
        this.surname = surname;
        this.teamDTO = teamDTO;
        this.roleDTO = roleDTO;
    }

    public UserDTO() {
    }

    public Long getChatId() {
        return chatId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public TeamDTO getTeam() {
        return teamDTO;
    }

    public void setTeam(TeamDTO teamDTO) {
        this.teamDTO = teamDTO;
    }

    public RoleDTO getRole() {
        return roleDTO;
    }

    public void setRole(RoleDTO roleDTO) {
        this.roleDTO = roleDTO;
    }
}
