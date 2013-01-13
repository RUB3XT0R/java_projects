

package examples;

public class MyClass {

    public MyPojo member =  new MyPojo();



    public MyClass(){
        System.out.println("JavaBeans");
    }
    public String doProcessParam(String arg){
        System.out.println("parametro: "+ arg);
        return arg;
    }
    @Override
    public String toString(){
     return member.getName() + ", idade: "+ member.getAge();
    }

    public MyPojo getMember() {
        return member;
    }

    public void setMember(MyPojo member) {
        this.member = member;
    }


}
