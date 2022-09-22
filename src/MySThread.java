public class MySThread extends Thread{
    //second way of creating threads
    MySThread(){
        super("New Thread");
        System.out.println("Creating child thread " + this);
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
