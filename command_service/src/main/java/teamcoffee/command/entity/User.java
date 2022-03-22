package teamcoffee.command.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "u_chat_id", nullable = false)
    private long chatId;

    @Column(name = "u_nickname", nullable = false)
    private String nickname;

    @Column(name = "u_name", nullable = false)
    private String name;

    @Column(name = "u_surname", nullable = false)
    private String surname;

    @ManyToOne
    @JoinColumn(name="u_teams_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name="u_roles_id")
    private Role role;

    public User(long chatId, String nickname, String name, String surname, Team team, Role role) {
        this.nickname = nickname;
        this.name = name;
        this.surname = surname;
        this.team = team;
        this.role = role;
    }

    public User() {
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
