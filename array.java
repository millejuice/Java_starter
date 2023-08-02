public class array {
    public static void main(String[] args){
        //자료형[] 이름 = new 자료[갯수];
        //배열 선언하면서 초기화하기 2개 모두 가능
        char[] dirAry1={'동','서','남','북'};
        char[] dirAry2=new char[] {'동','서','남','북'};

        //선언만 하고 나중에 초기화
        char[] dirAry3;

        dirAry3=new char[]{'동','서','남','북'};

        int[] ary1={1,2,3};
        int[] ary2={4,5};
        ary2=ary1; //ary2가 바라보는것이 {4,5}가 아니라 ary1이 바라보는 {1,2,3}으로 되게 만든다. ary1의 집주소를 ary2에 넣는다
        //배열에는 집주소가 있고, 그 안에 값들이 있는것

        //final로 선언한 배열 -> 새로운 배열을 넣는것은 불가능하지만 원소를 바꾸는것은 가능
        final int[] NUM = {1,2,3,4,5};
        //NUM=new int[]{2,3,4,5} 불가능
        NUM[0]=129;

        String[] str1 = new String[]{"한놈","두놈","석삼","너구리"};
        String join1 = String.join(",",str1);
        String join2= String.join("-",str1);


    }
}
