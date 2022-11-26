package ru.job4j.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {
    }

    public Computer(boolean multiMonitor, int ssd, String spu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer laptop = new Computer(true, 99, "Intel Core I7-10700K");
        computer.printInfo();
        laptop.printInfo();
    }

    public void printInfo() {
        System.out.println("Много принтеров: " + multiMonitor);
        System.out.println("SSD: " + ssd  + "GB");
        System.out.println("Модель CPU: " + cpu);
    }
}
