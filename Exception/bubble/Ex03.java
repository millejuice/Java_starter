package Exception.bubble;

import java.util.stream.IntStream;

public class Ex03 {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 4)
                .forEach(Ex03::ceo);
    }
    public static void sawon (int i) throws XLargeException, LargeException, MediumException {
        //SmallException을 제외하고 나머지는 throw
        //코드 작성할 때 빨간불에 add Exception to signature하면 자동으로 intellij가 작성해준다
        try {
            switch (i) {
                case 1: throw new SmallException();
                case 2: throw new MediumException();
                case 3: throw new LargeException();
                case 4: throw new XLargeException();
                default:
                    System.out.println("저 가 봐도 되죠?");
            }
        } catch (SmallException se) {
            System.out.println(se.getMessage() + ": 저 이건 알아요!");
        } catch (Exception e) {
            throw e;
        }
    }

    public static void daeri (int i) throws XLargeException, LargeException {
        try {
            sawon(i);  //대리는 사원을 호출
        } catch (MediumException me) { //mediumException은 대리가 처리
            System.out.println(me.getMessage() + ": 내가 처리할 테니 가 봐요.");
        } catch (Exception e) { //더 큰 것들은 위로 전송
            throw e;
        }
    }

    public static void bujang (int i) throws XLargeException {
        try {
            daeri(i);  //부장은 대리를 호출
        } catch (LargeException le) {
            System.out.println(le.getMessage() + ": 잘 하자. 응?");
        } catch (Exception e) {
            throw e;
        }
    }

    public static void ceo (int i) {
        try {
            bujang(i);  //ceo는 부장을 호출
        } catch (XLargeException xe) {
            System.out.println(xe.getMessage() + ": 전원 집합");
        }
        System.out.println("\n- - - - -\n");
    }
}
