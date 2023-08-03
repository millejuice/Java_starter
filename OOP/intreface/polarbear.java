package OOP.intreface;

public class polarbear extends mamal implements hunter,swimmer{
    //포유류이자 hunter, swimmer 특징 가지고 있어서 반드시 사냥,수영 기능 있어야한다
    //둘중 하나라도 없으면 사냥꾼이나 수영의 자격이 없는것
    public polarbear(){
        super(false);
    }
    @Override
    public void hunt(){
        System.out.println("물범사냥");
    }
    @Override
    public void swim(){
        System.out.println("앞발로 수영");
    }
}
