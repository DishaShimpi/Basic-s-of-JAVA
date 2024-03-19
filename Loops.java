import java.util.Scanner;

class Loops {
    public static void main(String args[]) {
        // for loop
        /*
         * for(int counter = 0;counter < 3;counter++){
         * System.out.println("Hello world");
         * }
         */

        // for loop-2
        /*
         * for(int counter = 0; counter <= 10; counter++){
         * System.out.print(counter+" ");
         * }
         */

        // while loop
        /*
         * int i=0;
         * while(i <= 10){
         * System.out.println(i);
         * i++;
         * }
         */

        // while loop-2
        /*
         * int i=12;
         * while(i<=10){
         * System.out.println("Disha");
         * }
         */

        // do while loop
        /*
         * int i=0;
         * do{
         * System.out.println(i);
         * i+=1;
         * } while(i <= 10);
         */

        // do while loop-2
        /*
         * int i=12;
         * do{
         * System.out.println("disha");
         * } while(i<=10);
         */

        // print sum of first n natural numbers

        /*
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int sum=0;
         * for(int i = 1; i <= n; i++){
         * sum += i;
         * }
         * System.out.println(sum);
         */

        // print table of number input by the user
        /*
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * for(int i = 1; i <= 10; i++){
         * System.out.println(n*i);
         * }
         */

        // all even numbers till n

        /*
         * int n = 12;
         * for (int i = 1; i <= n; i++) {
         * if (i % 2 == 0) {
         * System.out.println(i);
         * }
         * }
         */

        // make a menu driven program. the user can enter 2nos, either 1 or 0.if the
        // user enters 1 then keep taking input from the user for a student's marks(out
        // of 100).

        Scanner var1 = new Scanner(System.in);
        int input;
        do {
            int n = var1.nextInt();
            if (n >= 90 && n <= 100) {
                System.out.println("This is good");
            } else if (89 <= n && n >= 60) {
                System.out.println("this is also good");
            } else if (59 <= n && n >= 0) {
                System.out.println("This is good as well");
            } else {
                System.out.println("not");
            }
            System.out.println("want to continue? yes(1) or No(0)");
            input = var1.nextInt();
        } while (input == 1);
    }
}