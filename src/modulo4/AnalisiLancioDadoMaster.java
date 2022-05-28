package modulo4;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class AnalisiLancioDadoMaster {

	public static void main(String[] args) {
		
		final int LANCI_TOTALI = 1000000;
		
		int frequenza1 = 0, frequenza2 = 0, frequenza3 = 0,
		    frequenza4 = 0, frequenza5 = 0, frequenza6 = 0;
		int faccia;
		String output = "Lanci = " +LANCI_TOTALI; 
		
		JTextArea outputArea = new JTextArea(9, 20);
		
		for(int lancio = 1; lancio <= LANCI_TOTALI; lancio++) {
			
			faccia = lancioDado();
			
			switch(faccia) {
				case 1:
					frequenza1++;
					break;
				case 2:
					frequenza2++;
					break;
				case 3:
					frequenza3++;
					break;
				case 4:
					frequenza4++;
					break;
				case 5:
					frequenza5++;
					break;
				case 6:
					frequenza6++;
					break;
			}//fine switch
			
		}//fine for (int lancio = 1; lancio <= LANCI_TOTALI; lacnio++)
		
		output +="\n\nFaccia\tFrequenza";
		output += "\n1\t" +frequenza1 +"\n2\t" +frequenza2 +"\n3\t" +frequenza3
				 +"\n4\t" +frequenza4 +"\n5\t" +frequenza5 +"\n6\t" +frequenza6;
		
		outputArea.setText(output);
		outputArea.setEditable(false);
		JOptionPane.showMessageDialog(null, outputArea);
		System.exit(0);

	}//fine metodo main()

	public static int lancioDado() {
		
		int risultato;
		
		risultato = 1 + (int)(Math.random() * 6);
		return risultato;
		
	}//fine metodo lancioDado()
	
}//fine classe AnalisiLancioDado
