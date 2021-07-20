import java.util.Scanner;

/*
A number whose prime factors are either 2, 3 or 5 is called an Ugly Number.
Some of the ugly numbers are: 1, 2, 3, 4, 5, 6, 8, 10, 12, 15, etc.

We have a number N and the task is to find the Nth Ugly number in the sequence of Ugly numbers.
 */
public class UglyNumber {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println("The number is " + Ugly(n));
    }

    static Boolean isUgly(int n){
        if(n%5==0 || n%3==0 || n%2==0)
            return true;
        return false;
    }

    static int Ugly(int n){
        int i=1;
        if(n==1){
            return n;
        }
        while(i<n){
            i++;
            if(!isUgly(i)) {
                n++;
            }
            //n++;
        }

        StringBuilder s= new StringBuilder();
        s.insert();
        return i;
    }
}
