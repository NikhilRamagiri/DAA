import java.util.*;
class Mode
{
    public static int samosa(int a[], int H)
    {
        int l=1;
        int h = Arrays.stream(a).max().getAsInt();
        while(l<h)
        {
            int mid = (l+h)/2;
            int total = 0;
            for(int i:a)
            {
                total += (i+mid-1)/mid;
            }
            if(total > H)
            {
                l = mid+1;
            }
            else
            {
                h = mid;
            }
        }
        return l;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.split(" ");
        int arr[] = new int[a.length];
        for(int i=0; i<a.length;i++)
        {
            arr[i] = Integer.parseInt(a[i]);
        }
        int H = sc.nextInt();
        System.out.println(samosa(arr, H));
    }
}