package modulo5;
import javax.swing.JOptionPane;

public class AzzardoStatiMaster {

	public static void main(String[] args) {
		
		final int CONTINUA = 0;
		final int VITTORIA = 1;
		final int SCONFITTA = 2;
		final int PATTA = 3;
		
		int budget = 1000; 
		int vincita = 0;
		String puntata;
		int valPuntata;
		int statoGioco = CONTINUA;
		int statoMano = CONTINUA;
		int risultatoLancio;
		String outputLancio;
		
		while(statoGioco == CONTINUA) {
			
			do {
				puntata = JOptionPane.showInputDialog("Budget: " +budget +"\nQuanto vuoi puntare?");
				valPuntata = Integer.parseInt(puntata);
				if ((valPuntata < 0)||(valPuntata > budget))
					JOptionPane.showMessageDialog(null, "Range di puntate ammesso tra 0 e il budget",
							"Puntata errata", JOptionPane.ERROR_MESSAGE);
			} while((valPuntata < 0)||(valPuntata > budget));
				
			budget -= valPuntata;
			JOptionPane.showMessageDialog(null, "Hai puntato: "+valPuntata +" euro"
					+"\nBudget attuale: " +budget +" euro"
					+"\nClicca su \"OK\" per lanciare i dadi", "Pronti a giocare!!!",
					JOptionPane.WARNING_MESSAGE);
			
			risultatoLancio = lanciaDadi();
			
			switch(risultatoLancio) {
				case 2: case 12:
					vincita = valPuntata + (valPuntata * 4);
					statoMano = VITTORIA;
					break;
				case 3: case 11:
					vincita = valPuntata + (valPuntata * 2);
					statoMano = VITTORIA;
					break;
				case 4: case 10:
					vincita = valPuntata * 2;
					statoMano = VITTORIA;
					break;
				case 5:
					vincita = valPuntata; 
					statoMano = PATTA;
					break;
				default:
					statoMano = SCONFITTA;
					break;
			} //fine switch(risultatoLancio)
			
			if(statoMano == SCONFITTA)
				outputLancio = "Punteggio dadi: " +risultatoLancio +"\nHai perso la mano :-("
						   +"\nPerdi " +valPuntata +" euro";
			else {
				if(statoMano == VITTORIA) 
					outputLancio = "Punteggio dadi: " +risultatoLancio +"\nHai vinto la mano!!!"
							   +"\nVinci " +vincita +" euro";
				else 
					outputLancio = "Punteggio dadi: " +risultatoLancio +"\nPatta."
							   +"\nRecuperi la puntata di " +valPuntata +" euro";
				budget += vincita;
			} //fine else di if(statoMano == SCONFITTA)
			
			JOptionPane.showMessageDialog(null, outputLancio);
			
			if(budget == 0)
				statoGioco = SCONFITTA;
			else 
				if(budget >= 5000)
					statoGioco = VITTORIA;
					
		} //fine ciclo while((budget > 1000) && (statoGioco == CONTINUA))
		
		if(statoGioco == SCONFITTA)
			JOptionPane.showMessageDialog(null, "Il banco vince. Perdi tutto :-(",
					"Sorry...", JOptionPane.ERROR_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "Complimenti: hai fatto saltare il banco!!!"
					+ "\nPorti a casa " +budget +" euro",
					"Good Job!!", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
	} //fine metodo main
	
	public static int lanciaDadi() {
		
		int dado1, dado2, risultato;
		
		dado1 = 1 + (int)(Math.random()*6);
		dado2 = 1 + (int)(Math.random()*6);
		risultato = dado1 + dado2;
		
		return risultato;
		
	} //fine metodo lanciaDadi

} //fine classe Azzardo
