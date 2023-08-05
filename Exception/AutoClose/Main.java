package Exception.AutoClose;

public class Main {
    public static void main(String[] args) {
        for (var i = 0; i < 10; i++) {
            dirtyOperation();
        }
    }

    public static void dirtyOperation () {
        try (SuicideSquad sc = new SuicideSquad()) {  //try안에서 suicideSquad 사용
            sc.doSecretTask();
        } catch (OpFailException e) {
            //  💡 예외상황은 아만다 윌러가 책임짐
            e.printStackTrace();
            System.out.println("🗑️ 증거 인멸\n- - - - -\n");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
