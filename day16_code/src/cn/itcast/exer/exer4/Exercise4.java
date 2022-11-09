package cn.itcast.exer.exer4;

public class Exercise4 {
    public static void main(String[] args) {
        Sportsman gui = new Sportsman("乌龟", 1000, 1000);
        Sportsman tu = new Sportsman("兔子", 100, 10000);

        gui.start();
        tu.start();

        try {
            gui.join(); //这里阻塞的是main线程，和tu（兔子）线程无关
            /*
             * gui.join();这句代码是main线程执行的，那个线程指向，那个线程就被gui线程给阻塞了。
             * 此时gui和tu线程并列的关系，还在竞争CPU资源，继续运行。
             *
             * （1）情况一
             * 如果此时tu（兔子）线程先结束了，main线程还要等gui结束才能指向下面的代码。等待gui线程结束，main才往下走。
             * tu.join();因为tu已经结束了，相当于就无法阻塞main线程了，就继续往下走
             * （2）情况二
             * 如果此时gui（乌龟）线程先结束了，main线程继续往下走，
             * tu.join();这句话，因为此时tu没结束，那么main就会被tu加塞了，等到tu线程结束，main才往下走。
             *
             * */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            tu.join();//这里阻塞的是main线程，和gui（乌龟）线程无关
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // （3）结论上面两个线程都结束才会执行下面的代码
        if (tu.getDistance() > gui.getDistance()){
            System.out.println("兔子是冠军");
        }else if (tu.getDistance() < gui.getDistance()){
            System.out.println("乌龟是冠军");
        }else {
//            System.out.println("平局");
            // 在严格一点，如果都达到终点，看时间
            if (gui.getTime() < tu.getTime()) {
                System.out.println("乌龟是冠军");
            } else if (gui.getTime() > tu.getTime()) {
                System.out.println("兔子是冠军");
            } else {
                System.out.println("平局");
            }
        }
    }
}
