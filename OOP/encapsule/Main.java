package OOP.encapsule;

public class Main {
    public static void main(String[] args) {
        smartphone phone = new smartphone();

        String pb = phone.powerButton;
        String sd = phone.sdCardSlot;
        // String cu = phone.cpu; -> private으로 설정된 것은 다른 파일에서 접근할 수 없다
        phone.setCpu("juice");
    }
}
