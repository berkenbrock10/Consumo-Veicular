import javax.swing.JOptionPane;

public class MediaTotal {

	public static void main(String[] args) {
		// Carregando classe carro.
		Carro carro = new Carro();
		
		// Criando variavel para criar um la�o de repeti��o para que o menu s� feche quando o usu�rio quiser.
		int menu = 0;
		
		// La�o de repeti��o citado a cima.
		while (menu != 3) {
			// Menu de op��es
			menu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Bem vindo ao calculador de m�dia ve�cular\n"
							+ " Digite 1 - Para inserir a distancia e a m�dia de km/l\n"
							+ " Digite 2 - Para calcular a m�dia total\n" 
							+ " Digite 3 - Para Sair"));
			// Switch case para tratar o menu que criei a cima.
			switch (menu) {
				case 1:	
					carro.setDistancia(JOptionPane.showInputDialog(null,
							"Digite a distancia que seu carro " + "percorreu: \n(Digite valores separados por pontos)"));
		
					float dist = Float.parseFloat(carro.getDistancia());
		
					carro.setKmLitro(JOptionPane.showInputDialog(null, "Digite a m�dia de km/l que "
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
