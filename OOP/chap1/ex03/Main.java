package OOP.chap1.ex03;

public class Main {
    public static void main(String[] args) {
        YalcoChicken store1 = new YalcoChicken(3,"판교"); //인스턴스를 만들고
        YalcoChicken store2 = new YalcoChicken(17, "강남");

        String[] intros = {store1.Intro(), store2.Intro()}; //접근
    }
}
