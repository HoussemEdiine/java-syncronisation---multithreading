public class AnotherThread extends  Thread{

    @Override
    public void run() {
        System.out.println("hello from the  other thread");
        try {
            Thread.sleep(8000);

        }
        catch (InterruptedException e){
            System.out.println("another thread wake me up");
        }
        System.out.println("8s passed and i m awake" + Thread.currentThread().getName());
    }
}
