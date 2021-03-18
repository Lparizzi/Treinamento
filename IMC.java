package fundamentos;

import javax.swing.JOptionPane;

public class IMC {
public static void main(String[] args) {
	String peso = JOptionPane.showInputDialog("Digite seu peso em KG");
	String kg = peso.replace(",", ".");
	
	String altura = JOptionPane.showInputDialog("Digite sua altura em metros");
	String alt = altura.replace(",",".");
	
	Double kg1 = Double.parseDouble(kg);
	Double alt1 = Double.parseDouble(alt);
	
	Double IMC = kg1 / Math.pow(alt1, 2);
	
	System.out.printf("%.2f",(IMC));
	
	if(IMC<=18.5)
		System.out.println("\nAbaixo do peso");
	
	if(18.6<= IMC && IMC<=24.9)
		System.out.println("\nPeso Ideal");
	
	if(25.0 <=IMC && IMC<=29.9)
	System.out.println("\nLevemente acima do peso");
	
	if(IMC>=30.0)
		System.out.println("Obeso");
	}
}
