package class_lec.anonymous;

import OOP.abst.JuhyunCafe;
import OOP.abst.JuhyunChicken;
import OOP.abst.JuhyunGroup;

public class Main {
    JuhyunGroup store1 = new JuhyunChicken("울산");
    JuhyunGroup store2 = new JuhyunCafe("창원",true);

    //익명class는 한번만 사용하고 버릴 class
    JuhyunGroup store3 = new JuhyunGroup(1,"포항") {
        //JuhyunGroup은 추상class여서 인스턴스 초기화를 바로 못하는데 익명class는 1회용이기 때문에 {}안에 override로 초기화 시킨다
        @Override
        public void takeOrder() {
            System.out.printf("전국 유일한 %s 과메기 주문해주세요",super.intro());
        }

      public void dryFish(){
          System.out.println("과메기 말리기");
      } //익명class의 method는 익명class밖에서 사용할 수 없다
    };

}
