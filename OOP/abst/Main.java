package OOP.abst;

public class Main {
    public static void main(String[] args) {
        JuhyunChicken jh1 = new JuhyunChicken("전주");
        JuhyunChicken jh2 = new JuhyunChicken("강남");

        JuhyunCafe jc1 = new JuhyunCafe("포항",false);
        JuhyunCafe jc2 = new JuhyunCafe("공주", true);

        JuhyunGroup[] jg = {
            jh1, jh2, jc1, jc2 //juhyunGroup으로부터 상속되어서 둘다 []로 묶을 수 있다
        };

        for(JuhyunGroup jhGroup : jg){
            jhGroup.takeOrder();
        }
    }
}
