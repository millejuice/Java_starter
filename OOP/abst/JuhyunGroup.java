package OOP.abst;

public abstract class JuhyunGroup {
    //추상 class란 존재하지는 않지만 어떤 class들의 공통분모로 작동하기 위해 존재
    //필드와 메소드를 가질 수 있지만, 인스턴스를 생성할 수는 없다 -> 하림이 치킨 관련 매장들은 내지만 이름걸고 가게를 내지 않는것처럼

    protected static final String CREED = "우리의 %s는 부족하다";

    protected final int num;
    protected final String name;

    public JuhyunGroup(int num, String name){
        this.num = num;
        this.name = name;
    }

    public String intro(){
        return "%d호 %s점입니다".formatted(num,name);
    }

    public abstract void takeOrder();
    //abstract method - 선언만 하고 구현 x
    //takeOrder라는 기능만 있고 물려받는 자식들이 반드시 구현해서 사용
    //public private의미 없다
}
