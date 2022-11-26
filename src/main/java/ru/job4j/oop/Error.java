package ru.job4j.oop;

public class Error {

    private  boolean active;
    private int status;
    private String message;

   public Error(boolean active, int status, String message) {
       this.active = active;
       this.status = status;
       this.message = message;
   }

   public Error() {
   }

    public static void main(String[] args) {
        Error first = new Error();
        Error second = new Error(true, 5, "Exist");
        second.printInfo();
        first.printInfo();
    }

    public void printInfo() {
        System.out.println("Сообщение : " + active);
        System.out.println("Количесво : " + status);
        System.out.println("Текст сообщения : " + message);
    }
}
