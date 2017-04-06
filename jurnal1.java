public class jurnal1{
	
	public static void main(String [] args){
		Scanner show = new Scanner(System.in);
		System.out.print("Masukkan Jumlah Deret Fibonacci: ");
		int i = show.nextInt();
		long fib[] = new long[i];
		
		fib[0] = 1;
		fib[1] = 1;
		
		for(int n = 2; n < i; n++){
			fib[n] = fib[n-1] + fib[n-2];
		}
		
		for(int n = 0; n < i; n++){
			System.out.print(fib[n] + " ");
		}
	}
}