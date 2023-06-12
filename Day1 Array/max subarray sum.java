
public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long maxsum=arr[0],sum=0;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
			if(sum>maxsum)
				maxsum=sum;
			if(sum<0)
				sum=0;
		}
		if(maxsum<0)
			maxsum=0;
		return maxsum;
	}

}
