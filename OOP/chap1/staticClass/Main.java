package OOP.chap1.staticClass;

public class Main {
    public static void main(String[] args) {
        //static은 new나 생성자 등 인스턴스 생성 없이 사용 가
        String jh = YalcoChicken.brand;
        String jhContact = YalcoChicken.Contact();
        //인스턴스의 메소드는 static이 사용 불가
        //String jhName = YalcoChicken.name; -> 불가

        YalcoChicken store1 = new YalcoChicken(3,"양덕");
        store1.Intro();

        //인스턴스는 클래스의 필드와 메소드 사용 가능 그러나 권장하지는 않음
        //자동완성 안된다
        String stBrand = store1.brand;
        String stContact = store1.Contact();
    }
}
