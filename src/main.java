import java.sql.SQLOutput;

class LearningJava {
    public static void  main(String[] args) {

        Countdown countdown = new Countdown();

        ThreadCountdown t1 = new ThreadCountdown(countdown);
          t1.setName("thread 1 ");
          ThreadCountdown t2 = new ThreadCountdown(countdown);
          t2.setName("thread 2 ");
          t1.start();
          t2.start();



    }





}


