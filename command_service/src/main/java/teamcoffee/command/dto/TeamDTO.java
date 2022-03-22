package teamcoffee.command.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TeamDTO {

    /** ID группы */
    @XmlElement
    private int id;

    /** Имя группы */
    @XmlElement
    private String name;

    /** Цвет группы */
    @XmlElement
    private String color;

    public TeamDTO(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public TeamDTO() {
    }

    public int getId() {
        return id;
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
