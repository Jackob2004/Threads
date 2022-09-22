public class MyThread implements Runnable {
    //reference
    Thread t;
    //whenever we create a new object of this class this constructor will create a new thread
    MyThread() {
        t = new Thread(this, "My first thread");
    }

    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
