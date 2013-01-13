package classes;


import java.util.LinkedList;
import java.util.List;


public class MyUserControl {

    private List<User> users;

    public MyUserControl(){
        users = new LinkedList<User>();

        users.add(new User(1,"Lucas Biason","rua a"));
        users.add(new User(2,"Amelia","rua ab"));
        users.add(new User(3,"Jonathan","rua c"));
        users.add(new User(4,"Paul","rua d"));
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUserById(int idUser){
        return users.get(idUser-1);
    }
}
