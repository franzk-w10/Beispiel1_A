import AlgoTools.IO;
public class Bsp1A {

	public static void main(String[] args) {

		titel("Fibonacci-Demo");
		verabschiedung();

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