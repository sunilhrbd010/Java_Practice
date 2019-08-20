class ArmstrongNum{
	static int countDigits(int num){
		int count=0;
		while(num!=0){
			num=num/10;
			count++;
		}
		return count;
	}
	static void isArmstrong(int num,int power){
		int temp=num;
		int sum=0;
		while(num!=0){
			int rem=num%10;
			sum=sum+(int)Math.pow(rem,power);
			num=num/10;
		}
		if(sum==temp){
			System.out.println("It is ArmstrongNum");
		}
		else 
			System.out.println("Not an armstrong");
	}
	public static void main(String[] args) {
		int num=13;
		int power=countDigits(num);

		isArmstrong(num,power);
	}
}