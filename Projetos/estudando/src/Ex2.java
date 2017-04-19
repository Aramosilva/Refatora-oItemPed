import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {

		int[] valor = new int[5];

		String total = "";

		for (int i = 0; i < 5; i++) {

			String x = JOptionPane.showInputDialog(null, "Informe um valor:");
			valor[i] = Integer.parseInt(x);

			if (valor[i] >= 0) {
				total = total + valor[i] + " | ";

			}
		}

		JOptionPane.showMessageDialog(null, total);

	}
}