public class Countdown {
    public synchronized void  doCountdown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "thread 1 ":
                color = ThreadColor.ANSI_PURPLE ;
                break;
            case "thread 2 ":
                color = ThreadColor.ANSI_RED ;
                break;
            default:
                color = ThreadColor.ANSI_RANDOM;
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + "i = " + i);
        }
    }
}
