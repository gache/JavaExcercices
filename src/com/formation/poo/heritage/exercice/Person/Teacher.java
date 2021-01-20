package com.formation.poo.heritage.exercice.Person;

public class Teacher extends Person {

    private String subject;


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void explain() {
        System.out.println("Explanation begins ");
    }


}
