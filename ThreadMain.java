class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I=" + i);
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int j = 1; j <= 10; j++) {
            System.out.println("J=" + j);
        }
    }
}

class ThreadC extends Thread {
    public void run() {
        int x = 10;
        int y = 45;
        int sum = x + y;
        System.out.println(sum);
    }

}

public class ThreadMain {
    public static void main(String args[]){
    /*for(int a=1;a<=12;a++)
        {
            System.out.println("a="+a);
        }*/
        ThreadA t1=new ThreadA();
        ThreadB t2=new ThreadB();
        ThreadC t3=new ThreadC();
        t1.start();
        t2.start();
        t3.start();
        /*for(int a=1;a<=12;a++)
        {
            System.out.println("a="+a);
        }*/
    }

}
