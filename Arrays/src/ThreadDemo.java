public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi " + Thread.currentThread().getPriority());
                try { Thread.sleep(1000); } catch(Exception e){}
            }
        }, "Hi Thread");
        Thread t2 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try { Thread.sleep(1000); } catch(Exception e){}
            }
        }, "Hello Thread");

//        System.out.println(t1.getName());
//        System.out.println(t2.getName());

        System.out.println(t1.getPriority()); // 1 - 10, 1 is least and 10 is highest priority
        System.out.println(t2.getPriority());
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try { Thread.sleep(10); } catch(Exception e){}
        t2.start();

        System.out.println(t1.isAlive());
        t1.join();
        t2.join();


        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
