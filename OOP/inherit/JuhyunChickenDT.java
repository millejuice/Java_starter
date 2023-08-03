package OOP.inherit;

public class JuhyunChickenDT extends JuhyunChicken{
    private boolean driveThruOpen = true;

    public JuhyunChickenDT(int num, String name){
        super(num,name);
    }

    public void setDriveThruOpen(boolean driveThruOpen) {
        this.driveThruOpen = driveThruOpen;
    }//driveThruOpen의 setter느낌

    public void takeDTOrder(){
        System.out.printf("%d호 %s점 드라이브 스루 주문 %s",
                        num,name,(driveThruOpen ? "받음" : "닫음")
                        );

    }
}
