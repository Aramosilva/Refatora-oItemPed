import javax.swing.JOptionPane;

public abstract class TesteLeao {

	public static void main(String[] args) {

		leao le = new leao();
		
		le.circular();
		le.FazerRuido();
        le.dormir();
        le.comer();
        le.setComida("Comida do Le�o");
        le.setIdade(2);
        le.setLocalizacao("Paran�");
        
        JOptionPane.showMessageDialog(null, "Comida do Leao : " + le.getComida());
        JOptionPane.showMessageDialog(null, "Idade do Leao : " + le.getIdade());
        JOptionPane.showMessageDialog(null, "Localiza��o : " + le.getLocalizacao());
	}

}
