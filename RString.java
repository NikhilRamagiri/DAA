/* 
import java.util.*;
class stairs {

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    static int countWays(int s) {
        return fib(s + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of stairs : ");
        int n = sc.nextInt();
        System.out.println("Number of ways = " + countWays(n));
        sc.close();
    }
}
*/
import java.util.*;
class RString{
    public static String reverse(String s)
    {
        if(s.isEmpty())
        {
            return s;
        }
        else
        {
            return reverse(s.substring(1))+ s.charAt(0);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));
        sc.close();
    }
}
