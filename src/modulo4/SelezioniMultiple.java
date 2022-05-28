package modulo4;

import javax.swing.JOptionPane;

public class SelezioniMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Dichiarazione delle variabili
	int valA=0,valB=0,valC=0,valScegliMetodo=0,risultato=0,resto=0;
	String a,b,c,scegliMetodo,output="";
	
	//Inserimento a e b
	a=JOptionPane.showInputDialog(null,"Inserisci a");
	valA=Integer.parseInt(a);
	b=JOptionPane.showInputDialog(null,"Inserisci b");
	valB=Integer.parseInt(b);
	
	//Scelta metodo
	scegliMetodo=JOptionPane.showInputDialog(null,"Inserisci metodo [1...4]\n[1] Somma\n[2] Divisione\n[3] Potenza\n[4] Massimo");
	valScegliMetodo=Integer.parseInt(scegliMetodo);
	
	if (valScegliMetodo==1)
			risultato=calcolaSomma(valA, valB);
	else if (valScegliMetodo==2) {
			risultato=calcolaDivisione(valA, valB);
			System.out.println("Risultato = " +risultato);
			resto=calcolaRestoDivisione(valA, valB);
			System.out.println("Resto = " +resto);
	}
	else if (valScegliMetodo==3)
		risultato=calcolaPotenza(valA, valB);
	else if (valScegliMetodo==4) {
		// Inserimento c
		c=JOptionPane.showInputDialog(null,"Inserisci c");
		valC=Integer.parseInt(c);
		risultato=calcolaMassimo(valA, valB, valC);
	}
	else 
		output="Scelta errata";	// Check sulla scelta del metodo
	
	if ((valScegliMetodo >= 1) && (valScegliMetodo <= 4)) {
		if (risultato == -1)	// Check sulle forme indeterminate
			output="Indeterminato";
		else
			output="Risultato: "+risultato;
		
		if (resto!=0)
			output+="\n\nResto: "+resto;
	}	
	
	// Stampa finale
	JOptionPane.showMessageDialog(null,output);
	System.exit(0);
	
	}
	
	public static int calcolaSomma(int a, int b) {
		
		int ris = a + b;
		
		return ris;
		
	} //fine metodo calcolaSomma(int a, int b)
	
	public static int calcolaDivisione(int a, int b) {
			
		if(b == 0)
			return -1;
		else {
			int ris = a / b;
			return ris;
					
		} //fine else di if(b==0)
		
	} //fine metodo calcolaDivisione(int a, int b)
	
	public static int calcolaRestoDivisione(int a, int b) {
		
		if(b == 0)
			return -1;
		else {
			int res = a % b;
			return res;
		} //fine else di if(b==0)
		
	} //fine metodo calcolaRestoDivisione(int a, int b)
	
	public static int calcolaPotenza(int a, int b) {
		
		int ris = 1;
		
		if((a == 0) && (b == 0))
			return -1;
		else {
			for (int cont = 1; cont <= b; cont++)
				ris *= a;
			return ris;
			
		} //fine else di if((a==0)&&(b==0))
		
	} //fine metodo calcolaPotenza(int a, int b)
	
	public static int calcolaMassimo(int a, int b, int c) {
		
		int max = 0;
		
		if((a <= c) && (b <= c))
			max = c;
		if((b <= a) && (c <= a))
			max = a;
		if((c <= b) && (a <= b))
			max = b;			
			
		return max;
		
	} //fine metodo calcolaMassimo (int a, int b, int c)
}
