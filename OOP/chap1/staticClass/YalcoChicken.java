package OOP.chap1.staticClass;

public class YalcoChicken {
    static String brand = "주현치킨";
    static String Contact(){
        //static에서는 인스턴스 생성하지 않아도 사용할 수 있다
        return "%s입니. 무엇을 도와드릴까요?".formatted(brand);
    }

    static int lasNum = 0;
    int num;
    String name;

    YalcoChicken(int num, String name){
       // this.num = num;
        num = lasNum++; //class생성할 때마다 lastNumber++
        this.name = name;
    }

    String Intro(){
        //인스턴스 메소드에서는 static에서 정의한 것 사용가능. 반대는 안된다
        return "안녕하세요 %s의 %d호 %s지점입니다".formatted(brand,num,name);
    }
}
