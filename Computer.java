package caiquangame2;

    public class Computer {
        String name;
        public int show;

        public int getShow() {
            return show;
        }
        public void setShow(int show) {
            this.show = show;
        }
        public void game() {
            setShow((int) (Math.random()*3+1));
            if(getShow() == 1) {
                System.out.println("电脑" + name +"出的是剪刀");
            }else if(getShow() == 2) {
                System.out.println("电脑" + name +"出的是石头");
            }else {
                System.out.println("电脑" + name +"出的是布");
            }
        }
    }


