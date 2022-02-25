package ingressos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Ingressos {
	
		public int inteira() {
			
			int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos ingressos deseja? ", "Bilheteria Cinefun", JOptionPane.PLAIN_MESSAGE));
			int n2 = (int) 24.00;
			int valorTotalInteira = n1*n2;

			JOptionPane.showMessageDialog(null,"Total a pagar é: R$"+ valorTotalInteira ,"Tela Final", JOptionPane.PLAIN_MESSAGE );
			return valorTotalInteira;
		}
		
		public int meia() {
			
			int	n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos ingressos deseja? ", "Bilheteria Cinefun", JOptionPane.PLAIN_MESSAGE));
			int n2 = (int) 12.00;
			int valorTotalMeia = n1*n2;
			
			JOptionPane.showMessageDialog(null,"Total a pagar é: R$ " + valorTotalMeia, "Tela Final", JOptionPane.PLAIN_MESSAGE);
			return valorTotalMeia;
		}
			
		public void sair() {
			
			//int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos ingressos deseja? ", "Bilheteria Cinefun", JOptionPane.PLAIN_MESSAGE));
			//int n2 = (int) 36.00;	
			//int valorTotalInteiraMeia = n1*n2;
			
			JLabel label1 = new JLabel("<html><center> Volte sempre ao CineFun!");
			label1.setHorizontalAlignment(SwingConstants.CENTER);
			
			JOptionPane.showMessageDialog(null, label1, "Cinefun", JOptionPane.PLAIN_MESSAGE);
			//JOptionPane.showMessageDialog(null,"Volte sempre ao CineFun!", "Tela Final", JOptionPane.PLAIN_MESSAGE);
			//return valorTotalInteiraMeia;
					
		}					
}

	
