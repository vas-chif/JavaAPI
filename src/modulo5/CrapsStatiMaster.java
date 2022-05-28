package modulo5;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CrapsStatiMaster {
	
	static int dado1;
	static int dado2;

	public static void main(String[] args) {
		
		final int VINCE = 0;
		final int PERDE = 1;
		final int CONTINUA = 2;
		
		boolean primoLancio = true;
		int sommaDadi;
		int punteggio = 0;
		int statoGioco = CONTINUA;
		String messaggioDiStatoGioco;
		String output;
		
		JTextArea outputArea = new JTextArea();
		
		while(true) {
			
			if(primoLancio == true) {
				messaggioDiStatoGioco = "Clicca su \"OK\" per iniziare una nuova partita";
				JOptionPane.showMessageDialog(null, messaggioDiStatoGioco);
			} //fine if(primoLancio == true)
			
			sommaDadi = lancia2Dadi();
			
			if(primoLancio == true) {
				
				switch(sommaDadi) {
					case 7: case 11:
						statoGioco = VINCE;
						break;
					case 2: case 3: case 12:
						statoGioco = PERDE;
						break;
					default:
						statoGioco = CONTINUA;
						punteggio = sommaDadi;
						primoLancio = false;
				} //fine switch(sommaDadi)
				
			} //fine if(primoLancio = true)
			else {
				
				if(sommaDadi == punteggio)
					statoGioco = VINCE;
				else
					if(sommaDadi == 7)
						statoGioco = PERDE;
				
			} //fine else di if(primoLancio = true)
			
			if(statoGioco == CONTINUA)
				messaggioDiStatoGioco = "Lancia ancora";
			else {
				if(statoGioco == VINCE)
					messaggioDiStatoGioco = "Hai vinto!!!";
				else
					messaggioDiStatoGioco = "Hai perso :-(";
				//primoLancio = true;
			} //fine else di if(statoGioco == CONTINUA)
			
			output = "Dado_1 = " +dado1 +"\tDado_2     = " +dado2 +"\nSomma = " +sommaDadi;
			if(primoLancio == false) {
				output += "\tPunteggio = " +punteggio;
				if(statoGioco != CONTINUA)
					primoLancio = true;
			} //fine if(primoLancio == false)
			output +="\n\n" +messaggioDiStatoGioco;
			
			outputArea.setText(output);
			JOptionPane.showMessageDialog(null, outputArea);
			
		} //fine ciclo while(true)
		
	} //fine metodo main()
	
	public static int lancia2Dadi() {
		
		int somma;
		
		dado1 = 1 + (int)(Math.random()*6);
		dado2 = 1 + (int)(Math.random()*6);
		somma = dado1 + dado2;
		
		return somma;
		
	} //fine metodo lancia2Dadi()
	
} //fine classe Craps
