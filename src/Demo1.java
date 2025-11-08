class Demo1{
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setPriority(10);
            System.out.println(Thread.currentThread().getPriority());
        });
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}