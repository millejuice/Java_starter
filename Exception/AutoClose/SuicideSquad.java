package Exception.AutoClose;

import java.util.Random;

public class SuicideSquad implements AutoCloseable {
    public void doSecretTask () throws OpFailException {
        if (new Random().nextBoolean()) {
            throw new OpFailException();
        };
        System.out.println("🔫 비밀 작전 수행");
    }

    @Override
    public void close() throws Exception {  //AutoCloseable 안에 있는 close로 결국에는 모두 폭사(닫음)
        //사용한 resource AutoClose로 제거함
        System.out.println("💣 전원 폭사\n- - - - -\n");
    }
}
