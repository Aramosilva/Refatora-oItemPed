import javax.swing.JOptionPane;

public class cpf2{



   static int[] cpf = new int[12];
   static int soma=0, n1=0, n2=0, i, a=10,x, xx=0;
	
   public static int gerar(){ 
   soma=0;
   n1=0;
   n2=0;
   for(i=0;i<9;i++){
	String b = JOptionPane.showInputDialog(null,"Digite o "+(i+1)+"º numero do CPF que deseja Gerar");
	cpf[i]=Integer.parseInt(b);
                  }
  return cpf[i] ; 
	   } 
	
	public static int validar(){    	
		soma=0;
		n1=0;
		n2=0;
	  for(i=0;i<11;i++){
			String b = JOptionPane.showInputDialog(null,"Digite o "+(i+1)+"º numero do CPF que deseja Gerar");
			cpf[i]=Integer.parseInt(b);
			}
		return cpf[i] ; 
		   }
	
	
	
public static int verificar(){   	 
	 	
	xx=0;
	for(i=0;i<9;i++){
			if(cpf[1]==cpf[i]){
			xx=xx+1;
			}
		}
		return xx ; 
		   }


	
	public static void main(String[] args) {

		
		
		do{
		Object[] opcoes = {"Gerar CPF","Consultar CPF","Sair"};
			x = JOptionPane.showOptionDialog(null, "Escolha a Opção desejada", "CPF",0,1,null, opcoes, "CPF");
				
		switch(x){
		case 0:
			gerar();
			
				break;
	      case 1:
	    	  validar();
	    	  break;
	    	  
	      case 2:
	    	  JOptionPane.showMessageDialog(null, "Saindo...");	
	    	  System.exit(0);
	    	  break;
    	
		}
		
			verificar();
				
			if(xx==9){
			JOptionPane.showMessageDialog(null, "O CPF não pode ter todos os numeros iguais !");
				}else{
				a=10;
				for(i=0;i<9;i++){
				soma = soma +(a*cpf[i]);
				a = a-1;
				}
					
				n1 = soma % 11;
				if(n1<2){
					n1 = 0;							
				}else{
					n1 = 11 - n1;
				}
				soma=0;
				a=11;
				for(i=0;i<9;i++){
				soma = soma +(a*cpf[i]);
					a = a-1;
				}
				soma = soma+(2 * n1);
				
				n2 = soma % 11;
				if(n2<2){
					n2 = 0;							
				}else{
					n2 = 11 - n2;
				}
				
				if(x==0 && xx!=9){	
				JOptionPane.showMessageDialog(null, "O CPF é: "+cpf[0]+cpf[1]+cpf[2]+"."+cpf[3]+cpf[4]+cpf[5]+"."+cpf[6]+cpf[7]+cpf[8]+"-"+n1+n2);
				}else if(x==1 && xx!=9 && cpf[9]==n1 && cpf[10]==n2){
					JOptionPane.showMessageDialog(null, "CPF Valido!!!");
				}else{
					JOptionPane.showMessageDialog(null, "CPF Invalido!!!");
			JOptionPane.showMessageDialog(null, "O CPF correto é: "+cpf[0]+cpf[1]+cpf[2]+"."+cpf[3]+cpf[4]+cpf[5]+"."+cpf[6]+cpf[7]+cpf[8]+"-"+n1+n2);
					}
					}
					
		
		}while(x!=2);
		}
		}