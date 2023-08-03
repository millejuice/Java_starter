package OOP.abst;

public class JuhyunCafe extends JuhyunGroup{
    public static String getCreed(){
        return CREED.formatted("원두는");
    }

    protected static int lastNum=0;
    private boolean isTakeOut;

    public JuhyunCafe(String name, boolean isTakeOut){
        super(++lastNum,name);
        this.isTakeOut = isTakeOut;
    }

    public void takeOrder(){
        System.out.printf("주현카페 %s 음료를 주문하세요",super.intro());
        if(!isTakeOut) System.out.println("매장에서 드시겠어요?");
    }
}
