
public class Fatorial {
	public static void main(String[] args) {
	int f = 7;
	int f1 = 1;
	int n = 12;
	System.out.println("O fatorial de "+f+ " eh "+fat(f));
	System.out.println("O fatorial de "+n+ " eh "+fatComCalda(n,f1));

		
		
	}
	//recursão com calda
	public static int fat(int n) {
		if(n==0) {
			return 1;
		}
		return n* fat(n-1);
	}
	//recursão sem calda
	public static int fatComCalda(int n, int f) {
		if(n>1) {
			return fatComCalda(n-1, f*n);
		}else {
			return f;
		}
	}
};
