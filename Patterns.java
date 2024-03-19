import java.util.*;

class patterns {
    public static void main(String args[]) {

        // print solid rectangle pattern
        /*
         * for(int i = 1; i <= 4; i++){
         * for(int j = 1; j <= 5; j++){
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */

        // print Hollow rectangle pattern
        /*
         * int n = 4, m = 5;
         * for( int i = 1; i <= 4; i++){
         * for(int j = 1; j <= 5; j++){
         * if(i == 1 || j == 1 || i == 4 || j == 5){
         * System.out.print("*");
         * } else{
         * System.out.print(" ");
         * }
         * }
         * System.out.println();
         * }
         */

        // print half pyramid pattern
        /*
         * int n=4;
         * for(int i = 1; i <= 4; i++){
         * for(int j = 1; j <= i; j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // Inverted half pyramid
        /*
         * for( int i = 4; i >= 1; i--){
         * for(int j = 1; j <= i; j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // inverted half pyramid rotated by 180 deg pattern
        /*
         * int n = 4;
         * for(int i = 1; i <= n; i++) {
         * for(int j = 1; j <= n-i; j++) {
         * System.out.print(" ");
         * }
         * for(int k = 1; k <= i; k++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // half pyramid with numbers
        /*
         * for(int i = 1; i <= 5; i++){
         * for(int j = 1; j <= i; j++){
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         */

        // inverted half pyramid with numbers pattern
        /*
         * int n = 5;
         * for(int i = 1; i <= n; i++){
         * for(int j = 1; j <= n-i+1; j++){
         * System.out.print(j+" ");
         * }
         * System.out.println();
         * }
         */

        // floyd's triangle pattern
        /*
         * int n = 5;
         * int number = 1;
         * for(int i = 1; i <= n; i++){
         * for(int j = 1; j <= i;j++){
         * System.out.print(number+" ");
         * number++;
         * }
         * System.out.println();
         * }
         */

        // 0-1 Triangle
        /*
         * int n = 5;
         * for(int i = 1; i <= n; i++){
         * for(int j = 1; j <= i; j++){
         * //int sum = i + j;
         * //if(sum % 2 == 0){
         * if((i + j) % 2 == 0){
         * System.out.print("1 ");
         * } else{
         * System.out.print("0 ");
         * }
         * }
         * System.out.println();
         * }
         */

        // solid rhombus
        /*
         * int n = 5;
         * for(int i = 1; i <= n; i++ ){
         * //spaces
         * for(int j = 1; j <= n-i; j++){
         * System.out.print(" ");
         * }
         * // stars
         * for(int j = 1; j <= n; j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // number pyramid
        /*
         * int n = 5;
         * for(int i = 0; i <= n; i++){
         * for(int j = 1; j <= n-i; j++){
         * System.out.print(" ");
         * }
         * for( int j = 1; j <= i; j++){
         * System.out.print(i+" ");
         * }
         * System.out.println();
         * }
         */

        // palindromic number pyramid
        /*
         * int n = 5;
         * for(int i = 1; i <= n; i++){
         * for(int j = 1; j <= n-i; j++){
         * System.out.print(" ");
         * }
         * for(int j = i; j >= 1; j-- ){
         * System.out.print(j);
         * }
         * for(int j = 2; j <=i; j++ ){
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         */

        // butterfly pattern
        /*
         * int n = 4;
         * 
         * 
         * //upper half
         * for(int i = 1; i <= n; i++){
         * // 1st part
         * for(int j = 1; j <= i; j++){
         * System.out.print("*");
         * }
         * //spaces
         * int spaces = 2 * (n - i);
         * for(int j = 1; j <= spaces; j++){
         * System.out.print(" ");
         * }
         * // 2nd part
         * for(int j = 1; j <= i; j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * 
         * //lower half
         * for(int i = n; i >= 1; i--){
         * // 1st part
         * for(int j = 1; j <= i; j++){
         * System.out.print("*");
         * }
         * //spaces
         * int spaces = 2 * (n - i);
         * for(int j = 1; j <= spaces; j++){
         * System.out.print(" ");
         * }
         * // 2nd part
         * for(int j = 1; j <= i; j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // diamond pattern

        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}