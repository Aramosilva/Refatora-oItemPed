import javax.swing.JOptionPane;

public abstract class TesteTigre {

	public static void main(String[] args) {

		tigre t = new tigre();
		
		t.circular();
		t.FazerRuido();
        t.dormir();
        t.comer();
        t.setComida("Comida do Tigre");
        t.setIdade(8);
        t.setLocalizacao("São Paulo");
        
        JOptionPane.showMessageDialog(null, "Comida do Tigre : " + t.getComida());
        JOptionPane.showMessageDialog(null, "Idade do Tigre : " + t.getIdade());
        JOptionPane.showMessageDialog(null, "Localização : " + t.getLocalizacao());
	}

}
