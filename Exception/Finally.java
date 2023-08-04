package Exception;

public class Finally {
    //예외없이 반드시 실행할 것
    //db열어 작업한 뒤 닫아줄 때 사용

    public static void withFinally1 (boolean makeException) {
        try {
            if (makeException) System.out.println("".charAt(0)); //makeException이 true일 때
            System.out.println("🎉 예외 없이 정상실행됨");
        } catch (Exception e) {
            System.out.println("🛑 예외 발생");
        } finally {
            System.out.println("🏁 무조건 실행");
        }

        //  ❓ 그냥 try 문 밖에 적으면 안 될까?
        System.out.println("🏁 이렇게 말이지.");
    }

    public static char withFinally2 (int index) { //위에와 다르게 void가 아닌 char이다
        String str = "Hello";
        try {
            char result = str.charAt(index);
            System.out.println("🎉 예외 없이 정상실행됨");
            return result;
        } catch (Exception e) {
            System.out.println("🛑 예외 발생");
            return '!';
        } finally {
            //  ⭐️ 위에서 return이 발생하더라도 이건 하고 넘어감
            System.out.println("🏁 무조건 실행");
        }

        //  💡 try, catch 블록에 모두 return이 있으므로
        //  System.out.println("🏁 이렇게 말이지."); 주석 해제하면 에러가 나온다
    }
}
