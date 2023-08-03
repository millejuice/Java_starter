package OOP.overload;

public class ToggleButton extends Button{
    private boolean on;
    public ToggleButton(String print, boolean on){
        super("Toggle"); //생성자에서는 무조건 부모가 먼저오고 자식 설정
        this.on = on;
    }

    @Override
    public void func(){
        super.func(); //부모의 func를 호출
        //super가 생성자 말고 일반 메소드에서 사용되면 부모 자체를 가르키는것
        this.on = !this.on;
        System.out.println("대문자 입력: " + (this.on ? "ON" : "OFF"));
    }
}
