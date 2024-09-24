public class Test
{
    static void rotateByOne(int nums[])
    {
        int n=nums.length;
        int i;
        int temp = nums[n-1];
        for (i=n-1;i>0;i--)
        {
            nums[i]=nums[i-1];
        }
        nums[0]=temp;
    }

    public static boolean check(int[] nums) 
    {
        int i,p=0,k=0;
        for (i=0;i<(nums.length-1);i++)
        {
            if (nums[i]<=nums[i+1])
            {
                continue;
            }
            else
            {
                p++;
                k=i;
                for (int j=0;j<=k;j++)
                {
                    rotateByOne(nums);
                }
            }
        }

        if (p > 1) 
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void main(String args[])
    {
        int arr[] = {2,1,3,4};
        System.out.println(check(arr));
    }
}