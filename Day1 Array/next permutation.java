class Solution 
{
	public void nextPermutation(int[] nums) 
	{
		int n = nums.length;
		int pos = -1,flag=0,from = -1;
		int mx = Integer.MIN_VALUE;

		for(int i=n-1;i>=0;i--)
		{
			int max = Integer.MAX_VALUE;
			mx = Math.max(mx,nums[i]);
			if(nums[i]<mx)
			{
				for(int j=i+1;j<n;j++)
				{
					if(nums[i]<nums[j])
					{
						flag=1;
						max = Math.min(max,nums[j]);
						pos = j;
					}
				}
				if(flag==1)
				{
					int temp = nums[i];
					nums[i] = nums[pos];
					nums[pos] = temp;
					from = i;
					break;
				}
			}
		}
		Arrays.sort(nums,from+1,n);
	}
}
