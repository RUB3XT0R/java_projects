
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity(name="people")
public class People implements Serializable{

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column(nullable=false,name="name")
    private String name;
    @Column(nullable=true,name="age")
    private Integer age;
    
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="id_people")
    private PeopleInfo info;
    
   //um para muitos, uma pessoa tem muitos endereços
   @OneToMany(mappedBy="people",fetch= FetchType.EAGER)
   //mappedBy = nome da propriedade mapeada no address
   private List<Address> address;
   
   @ManyToMany(cascade= CascadeType.ALL,
           targetEntity=Group.class,
           mappedBy="peoples")
   @JoinTable(name="people_groups")
   private List<Group> groups;
   
    public People(){}

    public People(Integer id) {
        this.id = id;
    }
    public People(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

   public List<Group> getGroups() {
      return groups;
   }

   public void setGroups(List<Group> groups) {
      this.groups = groups;
   }

    
   public List<Address> getAddress() {
      return address;
   }

   public void setAddress(List<Address> address) {
      this.address = address;
   }

    
   public PeopleInfo getInfo() {
      return info;
   }

   public void setInfo(PeopleInfo info) {
      this.info = info;
   }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final People other = (People) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }


}
