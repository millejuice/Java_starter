package OOP.encapsule.getterNsetter;

public class Main {
    public static void main(String[] args) {
        pack ballPen = new pack("모나미",1000);

        ballPen.setName("쿠로토가");

        int ballPenPrice = ballPen.getPrice();

        ballPen.setPrice(5000);
        //증가율이 1.2가 최대여서 1200원 초과되면 적용 안된다
    }
}
