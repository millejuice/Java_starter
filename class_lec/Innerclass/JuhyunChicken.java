package class_lec.Innerclass;

public class JuhyunChicken {
    private String name;
    public JuhyunChicken(String name){
        this.name = name;
    }

    //매장신설 TF팀 - 본사에서 신설
    public static class LaunchTF {
        private String title;
        private String leader;

        public LaunchTF(String title, String leader) {
            this.title = title;
            this.leader = leader;
        }

        public JuhyunChicken Launch() {
            return new JuhyunChicken(title);
        }
    }
        //매장마다 gift 매장에서 준비
        //내부 클래 -> Main에서 static처럼 인스턴스 만들어서 사용할 수 없어서
        //인스턴스 만들어서 반환해줘야 한다
        class Gift{
            private String message;
            public Gift(String to ){
                this.message = "From 주현 치킨 %s점 to %s님"
                        .formatted(name,to);
            }
        }
        public Gift getGift(String to ){
            return new Gift(to);
        }

}
