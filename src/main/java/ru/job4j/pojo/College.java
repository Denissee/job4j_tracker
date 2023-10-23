package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Denis");
        student.setLastname("Zainullin");
        student.setEntrance(new Date());

        System.out.println("Student name is" + student.getName() + "His last name is" + student.getLastname() + "His date entance is" + student.getEntrance());
    }
}
