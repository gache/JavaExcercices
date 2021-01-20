package com.formation.poo.heritage.exercice.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();

        Student student = new Student();
        student.goToClass();
        student.setAge(15);
        student.sayHello();
        student.displayAge();

        Teacher teacher = new Teacher();
        teacher.setAge(40);
        teacher.sayHello();
        teacher.explain();
    }
}
