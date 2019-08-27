class BinarySearch{
	public static int binSearch(int search,int[] arr,int low,int high){
		//recursive approach

		// if(high>=low){
		// 	int mid = low +(high-low)/2;

		// 	if(arr[mid]==search){
		// 		return mid;
		// 	}
		// 	if(arr[mid]>search){
		// 		return binSearch(search,arr,low,mid-1);
		// 	}
		// 	return binSearch(search,arr,mid+1,high);
		// }
		// return -1;
		
		//iterative approach

		while(low<=high){
			int mid = low +(high-low)/2;

				if(arr[mid]==search){
					return mid;
				}

				if(arr[mid]>search){
					high = mid-1;
				}
				else {
					low = mid+1;
				}

		}
			return -1;
	}
	public static void main(String[] args) {
		int[] arr = {12,24,56,67,89,124,356,798};

		int search = 89;
		int low = 0;
		int high = arr.length-1;

		int index=binSearch(search,arr,low,high);
		System.out.println("index:" + index);
	}
}