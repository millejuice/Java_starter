package OOP.intreface;

public class Main {
    public static void main(String[] args) {
        polarbear pb1 = new polarbear();
        //다형성의 원칙으로 적용가능
        mamal mam = pb1;
        swimmer swim = pb1;
    }
}
