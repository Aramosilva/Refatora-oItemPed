import java.util.Random;

import javax.swing.JOptionPane;

public class loteria {

	public static void main(String[] args) {

		int l = 0, c = 0;
		Object[] loteria = { "Loto", "Sena", "Lotomania", "Sair" };

		int menu = 0;
		do {
		menu =	JOptionPane.showOptionDialog(null, "Escolha seu Jogo",
					"Programa de Jogos", 0, 3, null, loteria, " ");
        switch( menu){
    
        case 0:
        
       
        int[][] M = new int[1][5];
     String total = "";
     Random preencher = new Random();
     
     for (l = 0; l < 1; l++){
			for (c = 0; c < 5; c++){
				
				M[l][c] = preencher.nextInt(30);
				total = total + "  " + M[l][c];

			
			}
			}
			total = total +"\n";
		
		
		JOptionPane.showMessageDialog(null, total);
      
		break;
		
        
		case 1:
        	
        	int s1 [][]  = new int[1][6];
            String total2 = "";
               
            Random preencher1 = new Random();
       		for (l = 0; l < 1; l++) {
       			for (c = 0; c < 6; c++) {
    				s1[l][c] = preencher1.nextInt(30);
       				total2 = total2 + "  " + s1[l][c];

       			}
       			total2 = total2 +"\n";
       		}
       		JOptionPane.showMessageDialog(null, total2);
            
        break;
   
        case 2:

            int N[][] = new int[4][5];
         String total3 = "";
            
         Random preencher2 = new Random();
    		for (l = 0; l < 4; l++) {
    			for (c = 0; c < 5; c++) {
    				N[l][c] = preencher2.nextInt(30);
    				total3 = total3 + "  " + N[l][c];

    			}
    			total3 = total3 +"\n";
    		}
    		JOptionPane.showMessageDialog(null, total3);
    		
    		

        
        }
        
		}
		
        	while (menu != 3);

		}
	
	}



