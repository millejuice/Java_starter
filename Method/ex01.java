package Method;

public class ex01 {
    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        addSubMulDiv(x,y);

    }
    static void addSubMulDiv(double a, double b){
        System.out.printf("%f + %f = %f%n", a, b, a+b);
        System.out.printf("%f - %f = %f%n",a,b,a-b);
        System.out.printf("%f * %f = %f%n",a,b,a*b);
        System.out.printf("%f / %f = %f%n",a,b,a/b);
    }
}
