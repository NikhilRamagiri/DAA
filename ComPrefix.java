import java.util.*;
class ComPrefix
{
    public static String commonprefix(String s[],int l , int h)
    {
        if(l==h)
        {
            return s[l];
        }
        if(h>l)
        {
            int mid = (l+h)/2;
            String lf = commonprefix(s, l, mid);
            String rf = commonprefix(s, mid+1, h);
            return  cpr(lf, rf);
        }
        return null;
    }

    public static String cpr(String s1, String s2) 
    {
        String res = "";
        int n1 = s1.length();
        int n2 = s2.length();
        for(int i=0,j=0; i<n1 && j < n2; i++,j++)
        {
            if(s1.charAt(i) != s2.charAt(j))
            {
                break;
            }
            res += s1.charAt(i);
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String s[] = st.split(" ");
        System.out.println(commonprefix(s,0,s.length-1));
    }
}