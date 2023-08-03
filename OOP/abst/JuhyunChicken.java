package OOP.abst;

public class JuhyunChicken extends JuhyunGroup{
    public static String getCreed(){
        return CREED.formatted("튀김옷은");
    }

    protected static int lastNum = 0;

    public JuhyunChicken(String name){
        super(++lastNum,name);
    }

    @Override
    public void takeOrder(){
        System.out.printf("주현치킨 %s 치킨을 주문하세요",super.intro());
    }
}
