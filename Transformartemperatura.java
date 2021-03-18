package fundamentos;

import javax.swing.JOptionPane;

public class Transformartemperatura {
	public static void main(String[] args) {
		String temperatura = JOptionPane.showInputDialog("Digite a temperatura em °F");
		System.out.println("Temperatura em °F= " + temperatura);
		
		double numero1 = Double.parseDouble(temperatura);
			final double C2 = 5/9.0;		
			final double C = ( numero1 - 32) * C2;
		System.out.println("Temperatura em °C = " + C);
	}
}

