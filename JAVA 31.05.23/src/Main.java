import java.util.Scanner;

public class Main {
    /*
        public static твз название(вх параметры){
            тело
        }
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        timer(3);
        timer(x);
    }

    public static void timer(int x){
        int min = x / 60;
        int sec = x % 60;

        for (int j = x; j >= 0; j--) {
            System.out.println("min = " + min + ", sec = " + sec);
            sec--;
            if (sec < 0) {
                sec = 60;
                min--;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("times up");
    }
}