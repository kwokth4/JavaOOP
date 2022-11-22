package model;

public class Student {
    private String name, gender, id;
    private int age;
    public Student(String name,int age, String gender, String id){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getId(){
        return id;
    }
}
