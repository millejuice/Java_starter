package OOP.inherit;

public class JuhyunChicken {
    protected int num; //자손 class에서 사용할 수 있는 접근제어제
    protected String name;

    public JuhyunChicken(int num, String name){
        this.num = num;
        this.name = name;
    }

    public void takeHallOrder(){
        System.out.printf("%d호 %s점 주문받음\n",num,name);
    }
}
