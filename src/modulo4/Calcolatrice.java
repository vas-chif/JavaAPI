package modulo4;
import javax.swing.JOptionPane;

public class Calcolatrice {//inizio classe

	public static void main(String[] args) {//inizio main
		//Dichiaro le variabili
		int valA, valB, valC;
		int valRisultato = 0;//Perchè se non dichiaro uguale a 0 non funziona?
		int valScelta;
		
		String a, b, c, scelta;
		String output ="";	//potrei farne a meno ma mi piace di più
				
		//immissione dei valori
		a = JOptionPane.showInputDialog("Immetti il primo valore:"); 
		valA = Integer.parseInt(a);
		b = JOptionPane.showInputDialog("Immetti il secondo valore:"); 
		valB = Integer.parseInt(b);
		
		scelta = JOptionPane.showInputDialog("Scegli le seguenti operazioni:\n"
				+ "1)somma\n"
				+ "2)Divisione\n"
				+ "3)Potenza\n"
				+ "4)Calcolare il valore più alto");
		valScelta = Integer.parseInt(scelta);
		//inizio delle iterazione a casacata
		if(valScelta == 1) {//inizio 1 if
			valRisultato = valA + valB;
			output ="La somma è uguale ad:\t" + valRisultato;
		}//fine 1 if
		else
			if (valScelta == 2) 
		    	output = calcolaDivisione(valA, valB);//oggetto fattoincasa per le divisioni (int,int):String
			
			else  
				if (valScelta == 3) {
				    valRisultato = calcolaPotenza(valA,valB);//L'oggetto da due interi ci restituisce sempre un intero
				    output = "La potenza vale: ";
				    if (valRisultato == -1)
				    	 output += "Indefinito";
				    else
				    	output += valRisultato;
				}
				 else 
					 
					 if (valScelta == 4 ) { //tre numeri per calcola il massimo
						 c = JOptionPane.showInputDialog("Immetti il terzo valore");
						 valC = Integer.parseInt(c);
						 valRisultato = calcolaMassimo(valA,valB,valC);
						 output = "Il valore massimo è : "+ valRisultato;
					 }
					 else
						 output ="Scelta errata" ;
		
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
		
		
	}//fine main
	//esegue la divisione
	public static String calcolaDivisione(int q, int d) {//inizio calcolaDivisione
	    //dichiaro le varibili	
			int ris ;
			int	resto ;
			String output = "";
			
			//elaborazione 		
			if (d == 0)
				output = "La divisione per zero non è definita.";//La divisione per zero non è definita
			
			else {
				ris = q / d;    //restituisce solo un intero
			
				resto = q % d;  //è un int! provare per credere!
			
				output = "Il risultato è: " +ris;
				if (resto > 0 )//resto
					output+="\nIl resto è: " +resto;
				//return
			}
			return output;
	}//
	
	public static int calcolaPotenza(int base,int esp) { //inizio calcola potenza
			//dichiaro le variabili
			int ris = 1;
			//inizio l'if per l'indeterminato
			if ((base == 0) && (esp == 0))
				return -1;
			else {//inizio else
				for (int cont =1;cont <= esp ; cont++)
					ris *=base;
				return ris;//per la semantica lo metto qui dentro
			}//fine else 
		
	}//fine calcolaPotenza
	
	public static int calcolaMassimo(int a,int b, int c) {//inizio max
		
			int max;
			
			if (a > b)
				max = a;
			else
				max = b;
			
			if(c > max )
				max = c;
			
			return max;
			
	}//fine max

}//fine classe