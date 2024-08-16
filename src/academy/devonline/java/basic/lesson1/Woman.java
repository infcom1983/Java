package academy.devonline.java.basic.lesson1;

public class Woman {
    private String name;
    private int age;

    public Woman(int age, String name){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
