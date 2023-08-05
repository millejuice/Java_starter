package Exception;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Map<String, Integer> dutyRegMap = new HashMap<>();
        dutyRegMap.put("정핫훈", 7);
        dutyRegMap.put("김돌준", 13);  //registerDutyMonth error의 throw new에 잡히고 19번 줄 catch로 옮겨진다

        dutyRegMap.forEach((name, month) -> {

            //registerDutyMonth(name, month); 스스로 에러를 처리하지 않기 때문에 사용못함

            //  💡 실행부에서, 혹은 또 이를 호출한 외부에서 처리해주어야 함
            try {
                registerDutyMonth(name, month);
            } catch (WrongMonthException we) {
                we.printStackTrace();
                System.out.printf("%s씨 에어팟 빼봐요.%n", name);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        dutyRegMap.forEach((name, month) -> {
            try {
                registerDutyMonthSafer(name, month);
            } catch (WrongMonthException we) {
                we.printStackTrace();
                System.out.println("내가... 왜 또 불렀는지 알겠어요?");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static void registerDutyMonth( String name, int month ) throws WrongMonthException{
        //에러가 나오면 메서드에서 처리하는게 아니라 밖으로 던진다
        if( month < 1 || month > 12)
        {
            throw new WrongMonthException("히 직원교육 좀 시켜서 보내요 ");
        }
        System.out.printf("%s씨 %d월 담당으로 배정받았어요")
                .format(name,month);
    }

    //자기선에서 처리하고 또 외부로 에러 던지는 case
    public static void registerDutyMonthSafer (String name, int month) throws WrongMonthException {
        try {
            if (month < 1 || month > 12) {
                throw new WrongMonthException(
                        "ㅎㅎ 저희가 일단 아무 달에 배정은 할게요."  //에러 발생하면 던져서
                );
            }
            System.out.printf("%s씨 %d월 담당으로 배정되셨어요.%n", name, month);
        } catch (WrongMonthException we) { //자기가 받고
            System.out.printf(
                    "%s씨 %d월 담당으로 배정되셨어요.%n",
                    name, new Random().nextInt(1, 12 + 1)
            );
            throw we; //외부로도 던진다. 호출한 곳에서 어떤 문제가 있었는지 파악할 수 있다
        }
    }
}
