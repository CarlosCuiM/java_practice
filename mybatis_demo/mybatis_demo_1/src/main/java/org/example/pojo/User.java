package org.example.pojo;

//javabean
public class User {
    private int id;
    private String name;
    private String pwd;

//    public User(int id,String name, String pwd){
//        this.id = id;
//        this.name = name;
//        this.pwd = pwd;
//    }
//    public User(){
//
//    }
//    public User(int id){
//        this.id = id;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

//    public static void main(String[] args) {
//        User qhj = new User(1,"qhj","123");
//        System.out.println(qhj.toString());
//
//    }
}
