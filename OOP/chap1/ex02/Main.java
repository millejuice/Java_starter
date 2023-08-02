package OOP.chap1.ex02;

public class Main {
    public static void main(String[] args) {
        //YalcoChicken에서 정의한 클래스 main에서 인스턴스로 만들어 시용
        YalcoChicken store1= new YalcoChicken();
        store1.no = 3;
        store1.name = "양덕";

        //인스턴스 필드에 접근
        int store1NO = store1.no;
        //인스턴스 메소드 호출
        String store1Intro = store1.intro();
    }
}
