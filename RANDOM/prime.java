public class prime {
    public static void main(String[] args) {
        int n = 13;
        for (int i = 2; i * i <= n; i++) {
            if (n % i != 0) {
                System.out.println("Prime ");
            } else {
                System.out.println("Not Prime ");
                return;
            }
        }
    }

}
