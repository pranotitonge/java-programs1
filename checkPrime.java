package javaprograms;

public class checkPrime {

	public static void main(String[] args) {
     int num=2;
     if (isPrime(num)){
    	 System.out.println(num + "is a prime Number");
    	 
     }else {
    	 System.out.println(num + "is not a prime Number");
     }
	}

	 static boolean isPrime(int n) {
		if(n<=1) {
		return false;
	}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0) {
				return false;
			}
		}
	return true;

}}
