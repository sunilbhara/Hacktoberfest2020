
import java.util.*;


public class arrangearray
{
    static void arrangewithdiff(int arr[],int len,int m)
    {
        TreeMap<Integer,ArrayList<Integer>> tm = new TreeMap<>();
        for(int i=0;i<len;i++)
        {
            int diff = Math.abs(arr[i]-m);
            if(tm.containsKey(diff))
            {
                ArrayList<Integer> r = tm.get(diff);
                r.add(arr[i]);
                tm.put(diff,r);
            }
            else
            {
                ArrayList<Integer> r = new ArrayList<>();
                r.add(arr[i]);
                tm.put(diff, r);
            }
        }
        int pos = 0;
        for(Map.Entry e:tm.entrySet())
        {
            ArrayList<Integer> r = tm.get(e.getKey());
            for(int i=0;i<r.size();i++)
            {
                arr[pos++] = r.get(i);
            }
        }
        
        for(int k:arr)
        {
            System.out.print(k+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2,7,5,9,13,11,4,3,8};
        int len = arr.length;
        //Take input of your own choice using scanner
        //Scanner s = new Scanner(System.in);
        int m = 7;
        arrangewithdiff(arr,len,m);
        
        
    }
}
