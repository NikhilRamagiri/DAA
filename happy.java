import java.util.*;

class Solution {
    int sod(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }
        return sum;
    }

    boolean spNum(int n) {
        if (n == 1) {
            return true;
        }
        else if (n == 4) {
            return false;
        } else {
            return spNum(sod(n));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution s = new Solution();
        System.out.print(s.spNum(n));
    }
}