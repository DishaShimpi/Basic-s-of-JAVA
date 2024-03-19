import java.util.*;
class Condition{
    public static void main(String args[]){
  //Conditional statements
       /* Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("Adult");
        }else{
            System.out.println("not adult");*/
    //Statement-2
        /*Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if(x % 2 == 0) {
                System.out.println("even");
            }else{
                System.out.println("odd");
            }*/
    //Statements-3
          /*   Scanner sc =new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == b){
                System.out.println("equal");
            } else if(a > b){
                    System.out.println("greater");
            } else {
                    System.out.println("lesser");
            }*/
    //Statements-4
          /*  Scanner sc = new Scanner(System.in);
            int button = sc. nextInt();
            if(button == 1){
                System.out.println("Hello");
            } else if(button == 2){
                System.out.println("namaste");
            } else if(button == 3){
                System.out.println("Bonjour");
            } else {
                System.out.println("invalid button");
            } */
    //Statements-5 Switch
            Scanner sc = new Scanner (System.in);
            int button = sc.nextInt();
            switch(button) {
                case 1 : System.out.println("Hello"); 
                          break;
                case 2 : System.out.println("namaste"); 
                          break;
                case 3 : System.out.println("bonjour"); 
                          break;
                default: System.out.println("Invalid button");
            }
        }
    }