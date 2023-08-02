package OOP.chap1.ex02;

public class YalcoChicken {  //본사
    //매장들이 어떤 정보를 가지고 있을지
    int no;
    String name;

    String intro(){ //어떤 역할을 할지
            return "안녕하세요 %d호 %s점입니다"
            .formatted(no,name); //no, name앞에 this를 붙인것과 동일
    }
}
