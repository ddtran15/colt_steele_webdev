class Solution{
	public static void main(String[] args){
		reverseInt(565); 

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