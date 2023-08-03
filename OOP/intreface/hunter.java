package OOP.intreface;

public interface hunter {
    String position = "포식자"; //interface는 기본적으로 final로 인식되어서 초기화 하지 않으며 에러나온다
    void hunt();
}
