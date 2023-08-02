package sec02.chap02;

public class Main {
    //class이름 바꾸려면 Refactor ->Rename 해서 이름 바꾸기
    public static void main(String[] args) {
        byte byteNum;
        int intNum = 123;
        byteNum = (byte) intNum;
        //큰 바이트 수 작은것에 명시적 형변환으로 넣음
        //그러나 받을 수 있는것보다 큰값을 넣으면 랜덤값 들어간다

        //x++ x값 그대로인 상태에서 시스템실행 후 +1
        //++x 1증가한 후 시스템 실행

        float flNum=1.245f;
        //뒤에 f 붙여야한다
        System.out.println(flNum);

    }
}
