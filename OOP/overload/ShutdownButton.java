package OOP.overload;

public class ShutdownButton extends Button{
    public ShutdownButton(){
        super("ShutDown"); //부모의 생성자를 호출
        //Button(){}한것이나 마찬가지
    }

    //부모 메소드 오버라이드
    @Override
    public void func(){
        System.out.println("프로그램 종료");
    }
}
