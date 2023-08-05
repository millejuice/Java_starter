package Exception;

import java.util.HashMap;
import java.util.Map;

public class ChainedException {
    //예외가 발생했을 때 이를 원인으로 하는 다른 예외를 던짐
    public static void main(String[] args) {
        Map<String, Integer> dutyRegMap = new HashMap<>();
        dutyRegMap.put("정핫훈", 3);
        dutyRegMap.put("김돌준", 8);

        dutyRegMap.forEach((name, month) -> {

            //  💡 실행부에서, 혹은 또 이를 호출한 외부에서 처리해주어야 함
            try {
                chooseDutyMonth(name, month);
            } catch (WrongMonthException we) {
                we.printStackTrace(); // ⭐️ 로그에서 Caused By 항목 확인해 볼 것
                System.out.printf("%s씨, 해보자는 거지?%n", name);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static void chooseDutyMonth (String name, int index) throws WrongMonthException {
        int[] availables = {1, 3, 4, 7, 9, 12};

        try {
            int month = availables[index - 1];
            System.out.printf("%s씨 %d월 담당으로 배정되셨어요.%n", name, month);
        } catch (ArrayIndexOutOfBoundsException ae) {
            WrongMonthException we = new WrongMonthException(
                    "%d번은 없어요.".formatted(index)
            );

            //예외가 되는것은 Arry에러여서 ae인데 이를 바탕으로 새로운 예외 we 생성 하고 throw
            we.initCause(ae);

            //  ⭐️ 다른 종류의 예외가 발생해도 이 예외의 원인으로 등록해서
            //  통일된 타입(WrongMonthException)의 예외로 반환 가능

            throw we;
        }
    }
}
