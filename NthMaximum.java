class NthMaximum{

	public static int partition(int[] arr,int low,int high){
		int pivot=arr[high];
		int pIndex = low;

		for(int i=low;i<high;i++){
			if(arr[i]<=pivot){
				int temp=arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		int temp = arr[high];
		arr[high]=arr[pIndex];
		arr[pIndex]=temp;
		System.out.println(pIndex);
		
		return pIndex;
	}
	public static int quickSort(int[] arr,int low,int high,int k){
		int pIndex = partition(arr,low,high);

		if(high-k==pIndex){
			return arr[pIndex];
		}
		else if(arr[high-k]>arr[pIndex]){
			return quickSort(arr,pIndex+1,high,k);
		}
		else{
			return quickSort(arr,low,pIndex-1,k);
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,16,8,12,15,6,10};
		int kMax=6;
		int kthMax=quickSort(arr,0,arr.length-1,kMax-1);

		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+ " ");
		}
		System.out.println();
		System.out.println(kthMax);

	}
}