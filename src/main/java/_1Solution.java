import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class _1Solution {

// V4 in this version  Im calculating the amount of times that i need to use in the for
//    by saying that the number is n-mod divided by the mutipler, by doing this I know exactly
//    how many times I need to run in the for.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            n =n-1;
            int _3 = (n-(n%3))/3;

            int _5 = (n-(n%5))/5;
            int sum=0;

            int biggest = _3 >_5 ? _3 : _5;
            for(int i=0; i<= biggest; i++){
                if(i <= _3){
                    int num = (3*i);
                    sum= sum + num;
                }
                if( i <= _5){
                    int num = (5*i);
                    if(num %3 !=0){
                        sum= sum + num;
                    }
                }
            }
            System.out.println(sum);
        }
    }


    //v3 going from the end to start of the array, finding the first multiple see how distance it's
    // from the start and iterate adding all the multiples on the group
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        for(int a0 = 0; a0 < t; a0++){
//            int n = in.nextInt();
//            Set<Integer> numbers= new HashSet();
//            int _3 = 0;
//            for(int i=n-1; i> 0; i--){
//                if(i % 3  == 0){
//                    _3 = i/3;
//                    break;
//                }
//            }
//            int sum3=0;
//            for(int i=0; i<= _3; i++){
//                int num = (3*i);
//                numbers.add(num);
//                sum3= sum3 + num;
//            }
//
//            int _5 = 0;
//            for(int i=n-1; i> 0; i--){
//                if(i % 5  == 0){
//                    _5 = i/5;
//                    break;
//                }
//            }
//            int sum5=0;
//            for(int i=0; i<= _5; i++){
//                int num = (5*i);
//                if(!numbers.contains(num)){
//                    sum5= sum5 + num;
//                }
//            }
//            // System.out.println(sum3);
//            // System.out.println(sum5);
//            System.out.println(sum3+sum5);
//        }
//    }

    // only use in the for the number to be multiple
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int t = in.nextInt();
    //     for(int a0 = 0; a0 < t; a0++){
    //         int n = in.nextInt();
    //         Set<Integer> numbers= new HashSet();
    //         int sum =0;
    //         for(int i=0; i< n; i = i + 3){
    //             sum= sum + i;
    //             numbers.add(i);
    //             //System.out.println(sum);
    //         }
    //         for(int i=0; i< n; i = i + 5){
    //         if(!numbers.contains(i)){
    //             sum= sum + i;
    //             //System.out.println(sum);
    //         }
    //         }
    //         System.out.println(sum);
    //     }
    // }

//     V1 - brutal force
//     public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//         int t = in.nextInt();
//         for(int a0 = 0; a0 < t; a0++){
//             int n = in.nextInt();
//             int sum =0;
//             for(int i=0; i< n; i++){
//             if(i % 3 == 0){
//                 sum= sum + i;
//                 //System.out.println(sum);
//             }else if(i % 5 == 0){
//                 sum= sum + i;
//                 //System.out.println(sum);
//             }

//             }
//             System.out.println(sum);
//         }
//     }
}