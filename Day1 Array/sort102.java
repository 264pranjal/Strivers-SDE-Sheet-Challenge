public class Solution 
{
    public static void sort012(int[] arr)
    {
		int low=0,high=arr.length-1,mid=0;
		while(mid<=high){
			if(arr[mid]==0){
				arr[mid]=arr[low];
				arr[low]=0;
				low++;
				mid++;
				continue;
			}
			else if(arr[mid]==2){
				arr[mid]=arr[high];
				arr[high]=2;
				high--;
				continue;
			}
			else{
				mid++;
				continue;
			}
		}
		
		
