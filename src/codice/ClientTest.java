package codice;

import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		ModelShop S=new ModelShop("FranzBurger","StaARoma");
		BeanShopBeanCGDirections BeanS = new BeanShopBeanCGDirections(S);
		CGgetLocationDirections controllerGrafico = new CGgetLocationDirections(BeanS);
		ViewCustomerGetLocationDirections View1 = new ViewCustomerGetLocationDirections(controllerGrafico, BeanS);
		S.attach(View1);
		View1.printNomeEIndirizzo();
		
		String scelta="no";
		System.out.println("Cambiare i valori del Model ??? (Ipotetica modifica dei dati di uno shop)");
		Scanner kb = new Scanner(System.in);
		scelta = kb.next();
		while(! scelta.equalsIgnoreCase("si")) {
			System.out.println("\nNON È CAMBIATO NULLA");
			View1.printNomeEIndirizzo();
			System.out.println("");
			System.out.println("Cambiare i valori del Model ??? (Ipotetica modifica dei dati di uno shop)");
			kb = new Scanner(System.in);
			scelta = kb.next();
		}
		S.setNomeEIndirizzo();
		System.out.println("");
		View1.printNomeEIndirizzo();
		System.out.println("");
		
		scelta = "no";
		System.out.println("Cambiare i valori del Model ??? (Ipotetica modifica dei dati di uno shop)");
		kb = new Scanner(System.in);
		scelta = kb.next();
		while(! scelta.equalsIgnoreCase("si")) {
			System.out.println("\n NON È CAMBIATO NULLA");
			View1.printNomeEIndirizzo();
			System.out.println("");
			System.out.println("Cambiare i valori del Model ??? (Ipotetica modifica dei dati di uno shop)");
			kb = new Scanner(System.in);
			scelta = kb.next();
		}
		S.setNomeShop();
		System.out.println("");
		View1.printNomeEIndirizzo();
		System.out.println("");
		
		System.out.println("PROVA MODIFICA INDIRIZZO DA Casirate D'adda a Torrenova...");
		
		S.setIndirizzoShop();
		System.out.println("");
		View1.printNomeEIndirizzo();
		System.out.println("");
		
	}
}
