package Fibonacci;

	public class Fibonacci {

	    public static boolean ehFibonacci(int num) {
	        if (num == 0 || num == 1) {
	            return true;
	        }

	        int fiMRecent = 0, proxNFi = 1;
	        int somaRecProx = fiMRecent + proxNFi;

	        while (somaRecProx < num) {
	        	fiMRecent = proxNFi;
	        	proxNFi = somaRecProx;
	        	somaRecProx = fiMRecent + proxNFi;
	        }

	        return somaRecProx == num;
	    }

		
}
