public class Main {
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        //thread.t.start();

        MySThread thread1 = new MySThread(); //second way
        thread1.start();
        //Main Thread
        Thread myThread = Thread.currentThread();

        myThread.setName("Main Thread");
        System.out.println(myThread);

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