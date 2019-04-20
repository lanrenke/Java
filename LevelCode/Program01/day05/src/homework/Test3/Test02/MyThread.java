package homework.Test3.Test02;

import java.util.Random;

public class MyThread extends Thread {

    @Override
    public void run() {
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(901) + 100;
            System.out.println(num);
            count += num;
        }
        System.out.println(count);
    }
}
