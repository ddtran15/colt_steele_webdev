class Solution{
	public static void main(String[] args){
		int n = 123456789;
		System.out.println("Hello, the number" + n + " will be reversed." );
		System.out.println("....");
		System.out.println(reverseInt(n));
	}

	public static int reverseInt(int n){
		int res = 0 
		while(n > 0){
			int digit = n % 10;
			res = (res * 10) + digit; 
			n = n/10;
		}
		return res;
	}
}