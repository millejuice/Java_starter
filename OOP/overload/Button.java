package OOP.overload;

public class Button {
    private String print;
    private final int no = 2; //여기서 초기화 하지 않는거 생성자에서는 초기화 시켜줘야 한다
    //final로 지정한것 자식 class에서 수정불가

    public Button(String print){
        this.print = print;
    }

    public void func(){
        System.out.println(print + " 입력적용");
    }
}
