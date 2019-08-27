class MaxSubsequence{
	public static void maxSubseq(int[] arr){
		int earlierGl=0;
		int earlierGh=0;
		int currentGl=0;
		int currentGh=-1;
		int earlierDiff=0;
		int currentDiff=0;
		//System.out.println(gl+","+gh+","+diff);
		//System.out.println();
		for(int i =0;i<arr.length-1;i++){
			while(i<arr.length-1&&arr[i+1]>arr[i]){
				currentGh++;
				i++;
				System.out.println(currentGh);
				System.out.println(i);
			}
			earlierGh=currentGh;
			
			System.out.println();
			System.out.println(i);
			//System.out.print(diff + ","+ gl);
			 currentDiff=currentGh-currentGl;
			if(currentDiff>earlierDiff){

				currentGl=i;
				currentGh=i;
			}
			if(currentGl>earlierGl){
				earlierGl=currentGl;
			}
		}
		System.out.println();

		System.out.println(earlierGl+","+earlierGh);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,1,10};
		maxSubseq(arr);
	}
}