package c03;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");
            if ((i % 20) == 0) {
                System.out.println();
            }
            if (i == 47) {
                break;
            }
        }
        System.out.println();
    }
}
