package view;

import controller.FatorialDuploController;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		FatorialDuploController fatCont = new FatorialDuploController();
		int impar = 0;
		
		do {
			try {
				String input = JOptionPane.showInputDialog("digite um número inteiro positivo ímpar: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "encerrado");
					System.exit(0);
				}
				impar = Integer.parseInt(input);
				if (impar <= 0 || impar %2 == 0) {
					JOptionPane.showMessageDialog(null, "número inválido");
					continue;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "tamanho inválido");
				continue;
			}
			break;
		}while (true);
		JOptionPane.showMessageDialog(null, "o fatorial duplo de " +impar+ " é igual a = " + fatCont.fatduplo(impar));
	}

}
