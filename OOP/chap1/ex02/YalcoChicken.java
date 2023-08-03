package OOP.chap1.ex02;

public class YalcoChicken {  //본사
    //매장들이 어떤 정보를 가지고 있을지
    int no;
    String name;

    String intro(){ //어떤 역할을 할지
        String name = "양덕"; //미리 지정했을경우 변수앞에 this를 추가해서 변수가 생성자를 가르킨다는 것을 암시
        return "안녕하세요 %d호 %s점입니다"
                .formatted(no,this.name); //no, name앞에 this를 붙인것과 동일
    }
}
