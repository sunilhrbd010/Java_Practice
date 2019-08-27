class Fibonacci{
	static void fibbSeries(int number){
		//using recursion

		
		// if(number==1 || number==2)
		// 		return 1;
		// return fibbSeries(number-1) + fibbSeries(number-2);


		//using iterative
		int num=1;
		int sum=1;
		int prev=1;
		int count=1;
		while(count<=number){
				if(count == 1 || count == 2){
            		System.out.println(1 + " ");
            		count++;
            		}	
            else{	
				sum = prev+num;
				prev=num;
				num=sum;
				count++;
				System.out.println(sum);
			}
		}
	}
	public static void main(String[] args) {
		int upto = 10;
		
		fibbSeries(upto);
	
	}
}