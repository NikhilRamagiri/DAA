import java.util.*;
class BS
{
    public static int bs(int arr[], int l, int r, int key)
    {
        if(l>r)
        {
            return -1;
        }
        int mid = (l+r)/2;
        if(key == arr[mid])
        {
            return mid;
        }
        else if(key < arr[mid])
        {
            return bs(arr, l, mid-1, key);
        }
        else
        {
            return bs(arr, mid+1, r, key);
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        for(int i=0; i<n; i++)
        {
            int key = arr[i];
            int x = bs(arr, 0, n-1, key);
            if(key == x)
            {
                System.out.println(x);
                break;
            }
        }
        sc.close();
    }
}