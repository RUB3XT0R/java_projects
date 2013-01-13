
package model;
import javax.persistence.*;

//para dizer que essa classe é uma entidade e é uma tabela
//uma tabela com o nome de TESTE.USERS
@Entity
@Table(name="users")
public class User implements java.io.Serializable{

    private static final long serialVersionUID = 1L;
    //Integer e não int pois a chave primaria pode não existir, ser null, 
    //pois ainda não foi gravado o dado.
    
    @Id   //indentifica qual é a sua chave primária da tabela
    private Integer id;
    //identifica que é uma coluna do banco, o atributo deve ter o mesmo nome
    //que a coluna, caso contrario você deverá especificar
    // ex: @Column(name="NAME")
    @Column(name="nome")
    private String name;

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
    //nessecita dos métodos equals e hashcode para manipular a base de dados
    //deve ser gerado pela chave primário, isso é, gere um pelo id
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

}
