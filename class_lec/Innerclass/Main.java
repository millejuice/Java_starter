package class_lec.Innerclass;

import class_lec.Innerclass.JuhyunChicken;

public class Main {
    JuhyunChicken.LaunchTF launchTF1= new JuhyunChicken.LaunchTF("전주","주현");
    JuhyunChicken.LaunchTF launchTF2 = new JuhyunChicken.LaunchTF("포항","철수");

    JuhyunChicken store1 = launchTF1.Launch();
    JuhyunChicken store2 = launchTF2.Launch();

    JuhyunChicken.Gift [] gifts = {
            store1.getGift("홍길동"),
            store1.getGift("전우치"),
            store2.getGift("옥동자")
    };
}
