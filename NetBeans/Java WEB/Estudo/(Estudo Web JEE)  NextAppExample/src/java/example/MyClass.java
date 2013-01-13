/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package example;

/**
 *
 * @author Administrador
 */
public class MyClass {

    private MyPojo member = new MyPojo();

    public MyClass() {
        System.out.println("My class has been created !!!");
    }

    public void doProcessParam(String param) {
        System.out.println("The param is "+param);
    }

    public MyPojo getMember() {
        return member;
    }

    public void setMember(MyPojo member) {
        this.member = member;
    }




}
