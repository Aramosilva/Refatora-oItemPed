import javax.swing.JOptionPane;

public abstract class TesteGato {

	public static void main(String[] args) {

		gato g = new gato();
		
		g.circular();
		g.FazerRuido();
        g.dormir();
        g.comer();
        g.setComida("Comida do Gato");
        g.setIdade(2);
        g.setLocalizacao("Salvador");
        
        JOptionPane.showMessageDialog(null, "Ração : " + g.getComida());
        JOptionPane.showMessageDialog(null, "Idade do Gato : " + g.getIdade());
        JOptionPane.showMessageDialog(null, "Localização : " + g.getLocalizacao());
	}

}
