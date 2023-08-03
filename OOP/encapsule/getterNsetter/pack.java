package OOP.encapsule.getterNsetter;

public class pack {
    private static double discount = 0.2;
    private static double increaseLimit = 1.2;
    private String name;
    private int price;

    //private인것 외부에서 접근 가능하게 만들려면 getter를 세팅해줘야 한다
    //cmd + N으로 생성
    //생성자까지


    public pack(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return (int) (price*(1-discount));
    }

    public void setPrice(int price) {
        int max = (int) (this.price * increaseLimit);
        this.price = price < max ? price : max;
    }
}
