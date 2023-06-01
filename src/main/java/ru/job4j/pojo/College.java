package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Timur Khodjaev");
        student.setGroup("220-22");
        student.setEntered(new Date());
        System.out.println("Name: " + student.getFullName() + System.lineSeparator()
                + "Group: " + student.getGroup() + System.lineSeparator()
                + "Date: " + student.getEntered());
    }
}
