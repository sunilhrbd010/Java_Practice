class QuickSort{

	public static int partition(int[] arr,int low,int high){
		int pivot = arr[high];
		int pIndex=low;
		for(int i=low;i<high;i++){			
			if(arr[i]<=pivot){
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}		

		}
		System.out.println(pIndex);
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+ " ");
		}
		
		int temp = arr[pIndex];
		arr[pIndex] = arr[high];
		arr[high] = temp;

		return pIndex;
	 }

	 public static void quickSort(int[] arr,int low,int high){
	 	if(low>high)
	 			return;

	 	int pIndex = partition(arr,low,high);
	 
	 	quickSort(arr,low,pIndex-1);
	 	 quickSort(arr,pIndex+1,high);
	 }

	public static void main(String[] args) {
		int[] arr = {12,16,8,5,15,6,3,9,10};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}

		quickSort(arr,0,arr.length-1);	
		
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
	}
}