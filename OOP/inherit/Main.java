package OOP.inherit;

public class Main {
    public static void main(String[] args) {
        JuhyunChickenDT dtstore1 = new JuhyunChickenDT(108,"전주");

        dtstore1.takeHallOrder();
        dtstore1.takeDTOrder();

        dtstore1.setDriveThruOpen(false);
        dtstore1.takeDTOrder();
    }
}
