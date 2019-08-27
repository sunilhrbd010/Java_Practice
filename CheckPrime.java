class CheckPrime{
	public static void checkPrime(int num){
		int count=2;
		if(num==1||num==2){
				System.out.println("It is a prime");
		}
		
		for(int i=2;i<=num/2;i++){			
			if(num%i!=0){
				System.out.println("It is a prime" + i);
				break;
			}
			else{
				System.out.println("Not a prime number");
				break;
			}
		}
		
	}


	public static void main(String[] args) {
		int num = 2;
		checkPrime(num);


	}
}