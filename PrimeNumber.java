public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a:");
        number = sc.nextInt();
        if (number < 2)
            System.out.println("number not prime");
        else {
            //dung vong lap while
//            int i = 2;
//            boolean check = true;
//            while (i <= Math.sqrt(number)) {
//                if (number % i == 0) {
//                    check = false;
//                    break;
//                }
//                i++;
//            }
            //dung vong lap for
            boolean check = true;
            int CheckNumber = (int) Math.sqrt(number);
            for (int i = 2; i <= CheckNumber; i++) {
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