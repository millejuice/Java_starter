package OOP.chap1.ex01;

public class Main {
    public static void main(String[] args) {
    Button button1=new Button('1',1,"DARK");
    //Button class 자료형으로 사용
    //button1을 Button에 넣어서
    Button buttonPlus = new Button('+',3,"DARK");
    Button buttonClear = new Button('C',2,"DARK");

    button1.place(); //place라는 메소드로 사용
    buttonPlus.place();
    buttonClear.place();
    }
}
