import javax.swing.JOptionPane;

public abstract class TesteCachorro {

	public static void main(String[] args) {

		cachorro c = new cachorro();
		
		c.circular();
		c.FazerRuido();
        c.dormir();
        c.comer();
        c.setComida("Comida do Cachorro");
        c.setIdade(5);
        c.setLocalizacao("Rio de Janeiro");
        
        JOptionPane.showMessageDialog(null, "Ra��o : " + c.getComida());
        JOptionPane.showMessageDialog(null, "Idade do Cachorro : " + c.getIdade());
        JOptionPane.showMessageDialog(null, "Localiza��o : " + c.getLocalizacao());
	}

}
