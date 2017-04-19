import javax.swing.JOptionPane;


public class animal {
	 
		private int idade;
		private String comida;
		private String localizacao;
		
		public void setIdade(int idade){
			this.idade = idade;
		}
		public int getIdade(){
			return idade;
		}
		public void setComida(String comida){
			this.comida = comida;
		}
		public String getComida(){
			return comida;
		}
		
		public void setLocalizacao(String localizacao){
			this.localizacao = localizacao;
		}
		public String getLocalizacao(){
			return localizacao;
		}

		public void circular(){
			JOptionPane.showMessageDialog(null, "Circular do Animal");
			
		}
		public void FazerRuido(){
			JOptionPane.showMessageDialog(null, "Fazer Ruido do Animal");
			
		}
		public void comer(){
			JOptionPane.showMessageDialog(null, "Comer do Animal");
			
		}
		public void dormir(){
			JOptionPane.showMessageDialog(null, "Dormir do Animal");
			
		}
	}

