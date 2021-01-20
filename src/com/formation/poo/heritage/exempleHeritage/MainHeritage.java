package com.formation.poo.heritage.exempleHeritage;

import java.util.Date;

public class MainHeritage {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Juan", 25000);
        employee1.setAge(28);
        employee1.setSexe('M');
        employee1.setDirection("20 avenue Salomon");
        System.out.println("employee1 = " + employee1);

        Client client1 = new Client(new Date(), true);
        client1.setPrenom("Lucia");
        client1.setAge(31);
        client1.setSexe('F');
        client1.setDirection("20 rue de paris");

        System.out.println("client1 = " + client1);
    }
}
