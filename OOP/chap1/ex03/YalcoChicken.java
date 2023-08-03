package OOP.chap1.ex03;

public class YalcoChicken {
    int no;
    String name;

    //생성자 - 인스턴스를 만드는 메소드
    //this -> 생성될 인스턴스를 가르킨다
    YalcoChicken(int no,String name){
        this.no = no; //필드 이름이 이 안에서 사용되는 또다른 변수명이랑 겹칠 때 구분해주기 위해 this 사용
        this.name = name;
    }

    String Intro(){
        YalcoChicken thisShop =this; //자신을 가리킬 때와 같을 때도 사용
        return "안녕하세요 %d호 %s점입니다"
                .formatted(no,name);
    }
}

