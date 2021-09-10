class Main
{
    public static void csort(int[] arr, int k)
    {
        int[] output = new int[arr.length];
 
        int[] freq = new int[k + 1];

        for (int i: arr) {
            freq[i]++;
        }
 
        for (int i = 1; i <= k ; i++)
        {
            freq[i]+=freq[i-1];
        }
 
        for (int i: arr)
        {
            if (freq[i]>0)
            {
            output[freq[i]-1] = i;
            freq[i]--;
            }
            
        }
       for (int i = 0; i < arr.length; i++)
        {
            arr[i] = output[i];
        }
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 4, 2, 6, 17, 20, 4, 3, 1, 10 };

        int k = 20;
 
        csort(arr, k);
        for (int i: arr)
        System.out.print(i +" ");
    }
}