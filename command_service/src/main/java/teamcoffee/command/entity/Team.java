package teamcoffee.command.entity;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "t_id", nullable = false)
    private int id;

    @Column(name = "t_name", nullable = false)
    private String name;

    @Column(name = "t_color", nullable = false)
    private String color;

    public Team(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Team() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
