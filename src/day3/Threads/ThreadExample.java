package day3.Threads;
/* THREAD(asynchronous) : untuk menjalankan beberapa tugas secara bersamaan di latar belakang
* tampa mengganggu proses utama nya
* */
class MyThread extends Thread{
    // overwhrite method run dari Thread
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            // Thread.currentThread().getName() : buat ngambil nama thread yang lagi jalan
            System.out.println(Thread.currentThread().getName() + "  value. " + i);
            try{
                // menghentikan thread selama 1 detik sebelum ke looping selanjut nya
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
                System.out.println("Error :  Interrupted thread");
            }
        }
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        MyThread thread4 = new MyThread();


        thread1.start();// thread pertama
        thread1.interrupt();// interupsi thread pertama ketika lagi jalan buat nunjukin error
        thread2.start();//thread yang akan tetap jalan walaupun thread mati
        thread3.start();
        thread4.start();

    }
}
