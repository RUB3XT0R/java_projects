

package Modelo;

import Controle.factoryTableModel.SwingColumn;


public class Login {

    private int id;
    @SwingColumn(description="Login")
    private String login;
    private String senha;
    @SwingColumn(description="Funcionário")
    private Funcionario funcionario;

    public Login() {
    }

    public Login(int id) {
        this.id = id;
    }

    public Login(int id, String login, String senha, Funcionario funcionario) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return login;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    
}
