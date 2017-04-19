import javax.swing.JOptionPane;

public abstract class TesteLeao {

	public static void main(String[] args) {

		leao le = new leao();
		
		le.circular();
		le.FazerRuido();
        le.dormir();
        le.comer();
        le.setComida("Comida do Leão");
        le.setIdade(2);
        le.setLocalizacao("Paraná");
        
        JOptionPane.showMessageDialog(null, "Comida do Leao : " + le.getComida());
        JOptionPane.showMessageDialog(null, "Idade do Leao : " + le.getIdade());
        JOptionPane.showMessageDialog(null, "Localização : " + le.getLocalizacao());
	}

}
