import AlgoTools.IO;
public class Bsp1A {

	public static void main(String[] args) {

		int n;
		
		titel("Fibonacci-Demo");
		
		n=IO.readInt("Eingabe einer natuerlichen Zahl:");
		for (int i=1; i<=n;i++) {                                    
			IO.print(i,5);
			IO.println("..."+fibo(i));
		}
		verabschiedung();

	}
	
	static int fibo(int n) {
		if (n<3)
			return 1;
		return fibo(n-2)+fibo(n-1);
	}

	//Ausgabe desTitels
	static void titel(String text) {
		IO.print("\n\t\t");
		for (int i=0; i<text.length()+6; i++)
			IO.print("*");
		IO.print("\n\t\t*  "+ text + "  *\n\t\t");
		for (int i=0; i<text.length()+6; i++)
			IO.print("*");
		IO.println("\n");
	}
	
	//Ausgabe der Verabschiedung
	static void verabschiedung() {
			
		System.out.println("\n\n\t Have A Nice Day!");
	
	}	
}
