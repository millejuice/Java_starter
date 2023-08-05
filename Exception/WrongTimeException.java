package Exception;

public class WrongTimeException extends RuntimeException{
    public WrongTimeException(int month){
        super(
                ("당신이 사는 세계에는 %d월이 있나 보군요." +
                        "멀티버스 여행이 가능해진다면 " +
                        "저도 꼭 %d월을 살아 보고 싶습니다.")
                        .formatted(month, month)

        );
    }
}
