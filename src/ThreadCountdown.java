
    class  ThreadCountdown  extends  Thread{

        private  Countdown countdown ;

        public  ThreadCountdown ( Countdown countdown){
            this.countdown = countdown;

        }

        @Override
        public void run() {
            countdown.doCountdown();
        }
    }

