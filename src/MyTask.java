public class MyTask extends Thread {

    @Override
    public void run() {
        int a = 4;
        int b = 0;
        int c = a/b;
        try {
            Thread.sleep(1000);
            System.out.println("thread output");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
