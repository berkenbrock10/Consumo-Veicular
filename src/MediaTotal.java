import javax.swing.JOptionPane;

public class MediaTotal {

	public static void main(String[] args) {
		// Carregando classe carro.
		Carro carro = new Carro();
		
		// Criando variavel para criar um laco de repeticao para que o menu so feche quando o usuario quiser.
		int menu;
		
		// Laco de repeticao citado a cima.
		while (menu != 3) {
			// Menu de opcoes
			menu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Bem vindo ao calculador de media veicular\n"
							+ " Digite 1 - Para inserir a distancia e a media de km/l\n"
							+ " Digite 2 - Para calcular a media total\n" 
							+ " Digite 3 - Para Sair"));
			// Switch case para tratar o menu que criei a cima.
			switch (menu) {
				case 1:	
					carro.setDistancia(JOptionPane.showInputDialog(null,
							"Digite a distancia que seu carro " + "percorreu: \n(Digite valores separados por pontos)"));
		
					float dist = Float.parseFloat(carro.getDistancia());
		
					carro.setKmLitro(JOptionPane.showInputDialog(null, "Digite a media de km/l que "
							+ "seu carro fez nesse trajeto: \n(Digite valores separados por pontos)"));
		
					float km = Float.parseFloat(carro.getKmLitro());
		
					System.out.println("O veiculo percorreu uma distancia de " + dist + "km e fez uma"
							+ " m�dia de " + km + " km/l.\n");
					break;
				case 2: 
					System.out.println(carro.getDistancia());
					break;
				case 3:
					System.out.println("\nObrigado por usar nosso app =]");
					// Comando que encerra o switch case.
					System.exit(0);
					break;
				// Qualquer numero diferente das op��es do menu, apresentar� essa mensagem default.	
				default:
					System.out.println("\nVoc� n�o digitou uma op��o v�lida.");
			}
		}
	}

}
