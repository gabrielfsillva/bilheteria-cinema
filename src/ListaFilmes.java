import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

//import ingressos.Ingressos;

public class ListaFilmes {

	public static void main(String[] args) {
		
		JLabel label = new JLabel("<html><center> Bem-vindo ao Cinefun!");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JOptionPane.showMessageDialog(null, label, "Cinefun", JOptionPane.PLAIN_MESSAGE);
		
		//Filmes
		int filmes;	
		String listaFilmes[] = {"1 - Vingadores", "2 - Homem de Ferro", "3 - Capitão América", "4 - Hulk" };
		filmes = Integer.parseInt(JOptionPane.showInputDialog(null, String.join("\n", listaFilmes), "Filmes Disponíveis", JOptionPane.PLAIN_MESSAGE));

		//Sessões
		String listaSessoes[] = {"1 - 16h (Dublado)", "2 - 18h40 (Dublado)","3 - 20h30 (Legendado)"};

		
		switch(filmes) {
			case 1: 
				Integer.parseInt(JOptionPane.showInputDialog(null, String.join("\n", listaSessoes),"Sessões Disponíveis", JOptionPane.PLAIN_MESSAGE));
			break;
			
			case 2:
				Integer.parseInt(JOptionPane.showInputDialog(null, String.join("\n", listaSessoes), "Sessões Disponíveis", JOptionPane.PLAIN_MESSAGE));
			break;
			
			case 3:
				Integer.parseInt(JOptionPane.showInputDialog(null, String.join("\n", listaSessoes), "Sessões Disponíveis", JOptionPane.PLAIN_MESSAGE));
			break;
			
			case 4:
				Integer.parseInt(JOptionPane.showInputDialog(null, String.join("\n", listaSessoes), "Sessões Disponíveis", JOptionPane.PLAIN_MESSAGE));
			break;
			
		default: break;		
		
		}	
		
		//Escolher Ingressos
		int inteira = 24;
        int quantidadeInteira = 0;
        int meia = 12;
        int quantidadeMeia = 0;
        
        String opcoes[] = {"Inteira", "Meia", "Encerrar compra"};
        
        //Ingressos
        int opcao = 0;
        while (opcao != 2) {
            opcao = JOptionPane.showOptionDialog(null, "Deseja comprar qual tipo de ingressos?", null, 0, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
            if (opcao == 0) quantidadeInteira++;
            else if (opcao == 1) quantidadeMeia++;

            int total = quantidadeInteira * inteira + quantidadeMeia * meia;
            JOptionPane.showMessageDialog(null, "Você comprou: \n " + "- " + quantidadeInteira + " inteira \n" + "- " + quantidadeMeia + " meia \n" + "Total a pagar: R$ " + total, "Tela Final", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        JLabel label1 = new JLabel("<html><center> Volte sempre ao CineFun!");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JOptionPane.showMessageDialog(null, label1, "Cinefun", JOptionPane.PLAIN_MESSAGE);
	}

}

