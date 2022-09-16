import java.util.*;
class power
{
    public static float pow(float x, float n)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n<0)
        {
            return 1/(x*pow(x,Math.abs(n)-1));
        }
        else
        {
            return x * pow(x,n-1); 
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float n = sc.nextFloat();
        System.out.format("%.6f",pow(x,n));
    }
}