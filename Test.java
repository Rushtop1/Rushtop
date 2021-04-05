package caiquangame2;

public class Test {
    public static void main(String[] args) {
        Computer com1 = new Computer();
        Computer com2 = new Computer();
        Computer com3 = new Computer();
        com1.name = "com1";
        com2.name = "com2";
        com3.name = "com3";
        com1.game();
        com2.game();
        com3.game();
        while(com1.getShow()==com2.getShow()&&com1.getShow()==com3.getShow()){
            System.out.println("平局，游戏进行下一轮");
            System.out.println("-----------------");
            com1.game();
            com2.game();
            com3.game();
        }
        while(com1.getShow()!=com2.getShow()&&com1.getShow()!=com3.getShow()&&com2.getShow()!=com3.getShow()){
            System.out.println("平局，游戏进行下一轮");
            System.out.println("-----------------");
            com1.game();
            com2.game();
            com3.game();
        }
        if (com1.getShow() == com2.getShow()) {
            if (com1.getShow() - com3.getShow() == 1) {
                com3.setShow(100);
                System.out.println("com3输掉游戏，游戏进行下一轮");
                System.out.println("-----------------");
                com1.game();
                com2.game();
                while(com1.getShow() == com2.getShow()){
                    System.out.println("平局，游戏进行下一轮");
                    System.out.println("-----------------");
                    com1.game();
                    com2.game();
                }
                if (com1.getShow() - com2.getShow() == 1)
                    System.out.println("com1获胜，游戏结束");
                else if (com1.getShow() - com2.getShow() == -2)
                    System.out.println("com1获胜，游戏结束");
                else if (com1.getShow() - com2.getShow() == -1)
                    System.out.println("com2获胜，游戏结束");
                else if (com1.getShow() - com2.getShow() == 2)
                    System.out.println("com2获胜，游戏结束");
            }
                else if (com1.getShow() - com3.getShow() == -2){
                    com3.setShow(100);
                    System.out.println("com3输掉游戏，游戏进行下一轮");
                    System.out.println("-----------------");
                    com1.game();
                    com2.game();
                while(com1.getShow() == com2.getShow()){
                    System.out.println("平局，游戏进行下一轮");
                    System.out.println("-----------------");
                    com1.game();
                    com2.game();
                }
                if (com1.getShow() - com2.getShow() == 1)
                    System.out.println("com1获胜，游戏结束");
                else if (com1.getShow() - com2.getShow() == -2)
                    System.out.println("com1获胜，游戏结束");
                else if (com1.getShow() - com2.getShow() == -1)
                    System.out.println("com2获胜，游戏结束");
                else if (com1.getShow() - com2.getShow() == 2)
                    System.out.println("com2获胜，游戏结束");
                }
                else if (com1.getShow() - com3.getShow() == -1)
                    System.out.println("com3获胜，游戏结束");
                else if (com1.getShow() - com3.getShow() == 2)
                    System.out.println("com3获胜，游戏结束");
            }
            if (com2.getShow() == com3.getShow()) {
                if (com2.getShow() - com1.getShow() == 1){
                    com1.setShow(100);
                    System.out.println("com1输掉游戏，游戏进行下一轮");
                    System.out.println("-----------------");
                    com2.game();
                    com3.game();
                    while(com2.getShow() == com3.getShow()){
                        System.out.println("平局，游戏进行下一轮");
                        System.out.println("-----------------");
                        com2.game();
                        com3.game();
                    }
                    if (com2.getShow() - com3.getShow() == 1)
                        System.out.println("com2获胜，游戏结束");
                    else if (com2.getShow() - com3.getShow() == -2)
                        System.out.println("com2获胜，游戏结束");
                    else if (com2.getShow() - com3.getShow() == -1)
                        System.out.println("com3获胜，游戏结束");
                    else if (com2.getShow() - com3.getShow() == 2)
                        System.out.println("com3获胜，游戏结束");
                }
                else if (com2.getShow() - com1.getShow() == -2){
                        com1.setShow(100);
                        System.out.println("com1输掉游戏，游戏进行下一轮");
                        System.out.println("-----------------");
                        com2.game();
                        com3.game();
                    while(com2.getShow() == com3.getShow()){
                        System.out.println("平局，游戏进行下一轮");
                        System.out.println("-----------------");
                        com2.game();
                        com3.game();
                    }
                    if (com2.getShow() - com3.getShow() == 1)
                        System.out.println("com2获胜，游戏结束");
                    else if (com2.getShow() - com3.getShow() == -2)
                        System.out.println("com2获胜，游戏结束");
                    else if (com2.getShow() - com3.getShow() == -1)
                        System.out.println("com3获胜，游戏结束");
                    else if (com2.getShow() - com3.getShow() == 2)
                        System.out.println("com3获胜，游戏结束");
                }
                else if (com2.getShow() - com1.getShow() == -1)
                    System.out.println("com1获胜，游戏结束");
                else if (com2.getShow() - com1.getShow() == 2)
                    System.out.println("com1获胜，游戏结束");
            }
            if (com1.getShow() == com3.getShow()) {
                if (com1.getShow() - com2.getShow() == 1){
                        com2.setShow(100);
                        System.out.println("com2输掉游戏，游戏进行下一轮");
                        System.out.println("-----------------");
                        com1.game();
                        com3.game();
                    while(com1.getShow() == com3.getShow()){
                        System.out.println("平局，游戏进行下一轮");
                        System.out.println("-----------------");
                        com1.game();
                        com3.game();
                    }
                    if (com1.getShow() - com3.getShow() == 1)
                        System.out.println("com1获胜，游戏结束");
                    else if (com1.getShow() - com3.getShow() == -2)
                        System.out.println("com1获胜，游戏结束");
                    else if (com1.getShow() - com3.getShow() == -1)
                        System.out.println("com3获胜，游戏结束");
                    else if (com1.getShow() - com3.getShow() == 2)
                        System.out.println("com3获胜，游戏结束");
                }
                else if (com1.getShow() - com2.getShow() == -2){
                        com2.setShow(100);
                        System.out.println("com2输掉游戏，游戏进行下一轮");
                        System.out.println("-----------------");
                        com1.game();
                        com3.game();
                    while(com1.getShow() == com3.getShow()){
                        System.out.println("平局，游戏进行下一轮");
                        System.out.println("-----------------");
                        com1.game();
                        com3.game();
                    }
                    if (com1.getShow() - com3.getShow() == 1)
                        System.out.println("com1获胜，游戏结束");
                    else if (com1.getShow() - com3.getShow() == -2)
                        System.out.println("com1获胜，游戏结束");
                    else if (com1.getShow() - com3.getShow() == -1)
                        System.out.println("com3获胜，游戏结束");
                    else if (com1.getShow() - com3.getShow() == 2)
                        System.out.println("com3获胜，游戏结束");
                }
                else if (com1.getShow() - com2.getShow() == -1)
                    System.out.println("com2获胜，游戏结束");
                else if (com1.getShow() - com2.getShow() == 2)
                    System.out.println("com2获胜，游戏结束");
            }
        }
    }

