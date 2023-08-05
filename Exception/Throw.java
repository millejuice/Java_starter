package Exception;

import java.io.FileNotFoundException;
import java.util.Random;

public class Throw {
    //에러를 던지는 것
    //예외가 던져지면 그 아래에는 코드 작성 불가
    public static void main(String[] args) {
        try {
            if (new Random().nextBoolean()) {
                throw new FileNotFoundException();
            }
        } catch (Exception e) {

        }
        // maybeException2(); method에서 throws로 책임을 넘겼으면 try - catch 로 해결해야 한다
        //maybe2 안에서 try - catch를 했다면 그냥 maybeException2() 사용 가능
    }


    public static void maybeException2() throws FileNotFoundException{ //throws는 책임을 넘기는것
            if (new Random().nextBoolean()) {
                throw new FileNotFoundException();
            }

    }
//    아래와 같이 책임 throw한느 것이 아니라 직접 처리하면 main에서 maybeExceoption(); 으로 사용 가능
//    public static void maybeException() {
//        try {}
//        catch (){}
//    }
}
