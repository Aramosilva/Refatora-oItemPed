import javax.swing.JOptionPane;

public abstract class TesteLobo {

	public static void main(String[] args) {

		lobo l = new lobo();
		
		l.circular();
		l.FazerRuido();
        l.dormir();
        l.comer();
        l.setComida("Comida do Lobo");
        l.setIdade(2);
        l.setLocalizacao("São Paulo");
        
        JOptionPane.showMessageDialog(null, "Comida do Lobo : " + l.getComida());
        JOptionPane.showMessageDialog(null, "Idade do Lobo : " + l.getIdade());
        JOptionPane.showMessageDialog(null, "Localização : " + l.getLocalizacao());
	}

}