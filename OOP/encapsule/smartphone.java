package OOP.encapsule;

public class smartphone {
    String powerButton = "OnOff"; //public이 없으면 다른 폴더에서 사용불가
    public String sdCardSlot = "SD Card";
    private String cpu = "Juhyun"; //private 다른 파일에서 사용 불가

    //private을 다른 파일에서 바꾸려면 public으로 감싼 메소드 존재해야 한다
    public void setCpu(String cpu){
        this.cpu = cpu;
    }
}
