package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Clean code", 12);
        Book second = new Book("Sky", 183);
        Book third = new Book ("Miror", 367);
        Book forth = new Book ("Ocean", 293);
        Book[] num = new Book[4];
        num[0] = first;
        num[1] = second;
        num[2] = third;
        num[3] = forth;
        for (int i = 0; i < num.length; i++) {
            Book list = num[i];
            System.out.println(list.getName() + " - " + list.getCount());
            }
        System.out.println("Replace the 0 into 3");
        Book temp = num[0];
        num[0] = num[2];
        num[2] = temp;
        for (int i = 0; i < num.length; i++) {
            Book page = num[i];
            System.out.println(page.getName() + " - " + page.getCount());
        }
        System.out.println("Show only Cean Code");
        for (int i = 0; i < num.length; i++) {
            if (num[i].getName().equals("Clean code")) {
                System.out.println(num[i].getName());
            }
        }
    }
}


