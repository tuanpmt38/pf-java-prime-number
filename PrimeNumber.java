public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a:");
        number = sc.nextInt();
        if (number < 2)
            System.out.println("Number not prime: ");
        else {
            //dung vong lap for
            boolean isCheck = true;
            int CheckNumber = (int) Math.sqrt(number);
            for (int i = 2; i <= CheckNumber; i++) {
                if (number % i == 0) {
                    isCheck = false;
                    break;
                }
            }
            if (isCheck)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }
    }
}