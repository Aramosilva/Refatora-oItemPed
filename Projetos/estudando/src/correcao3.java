import java.util.Random;

import javax.swing.JOptionPane;

public class correcao3 {

	public static void main(String[] args) {
		
		int[][] mat = new int[5][5];
		String total = " ";
		Random ale = new Random();
		int l, c, maior = 0;

		for (l = 0; l < 5; l++) {
			for (c = 0; c < 5; c++) {
				 	 
				
				mat[l][c] = ale.nextInt(9);
				total = total + mat [l][c] + " | ";
				if (l==0 && c == 0){
					maior = mat[l][c];
				}else if (mat [l][c] > maior){
					
					maior = mat [l][c];
					
							}
			total = total + "\n";
		}
		
			for (l = 0; l < 5; l++) {
				for (c = 0; c < 5; c++) {
		
					mat [l][c] = mat[l][c] * maior;
					
				}
				
			}
			
		JOptionPane.showMessageDialog(null, total);
	}
	}
}