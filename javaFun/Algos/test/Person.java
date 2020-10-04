package W1D1.test;

import W1D1.test.Duck;

public class Person implements IP {
    Duck a;
    String name;
    
    static String classname;
    
    public Person(String name) {
        this.name = name;
    }


    public  String getDuckName(String b){
        return a.name;
    }

    public static String getClassname(){
        return classname;
    }


    public static void main(String[] args) {
        Person leo = new Person("Leo Sun");
        Person meng= new Person("Mengmeng Wang");
        System.out.println(leo.name);
        System.out.println(meng.name);
        
        Person.classname = "CLassname";
        System.out.println(leo.classname);
        System.out.println(meng.classname);
        leo.classname="newClassName";
        System.out.println(meng.classname);
        System.out.println(Person.classname);
    }
}
