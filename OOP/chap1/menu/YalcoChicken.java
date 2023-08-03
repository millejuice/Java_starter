package OOP.chap1.menu;

public class YalcoChicken {
    int num;
    String name;
    ChickenMenu[] menus;

    YalcoChicken(int num, String name,ChickenMenu[] menus){
        this.num = num;
        this.name = name;
        this.menus = menus;
    }

    ChickenMenu orderMenu(String name){
        for(ChickenMenu menu : menus){
           if(menu.name.equals(name)){
               return menu;
           }
        }
      return null;
    }
}
