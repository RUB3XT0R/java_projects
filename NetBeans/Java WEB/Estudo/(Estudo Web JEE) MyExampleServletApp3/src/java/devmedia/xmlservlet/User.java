/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia.xmlservlet;

import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@XmlRootElement(name="user")
public class User {
    @XmlAttribute
    private int id;

    @XmlElement
    private String name;
    @XmlElement
    private int age;
    @XmlElement
    private Date created;
    @XmlElement
    private boolean alive = true;

    public User() {
    }

    public User(String name, int age, Date created) {
        this.name = name;
        this.age = age;
        this.created = created;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
