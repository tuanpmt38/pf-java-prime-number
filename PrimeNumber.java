public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a:");
        number = sc.nextInt();
        if (number < 2)
            System.out.println("number not prime");
        else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }
    }
}
