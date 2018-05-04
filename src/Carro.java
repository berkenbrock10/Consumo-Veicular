import java.util.ArrayList;

public class Carro {
	private ArrayList<Viagem> viagens;
	
	Carro() {
		this.viagens = new ArrayList<Viagem>();
	}
	
	public float getMediaKmLitro() {
		float kmLitroTotal = 0;
		for(Viagem viagem : viagens) {
			kmLitroTotal += viagem.getKmLitro();
		}
		return kmLitroTotal / viagens.size();
	}
	
	public float getMediaDistancia() {
		float distanciaTotal = 0;
		for(Viagem viagem : viagens) {
			distanciaTotal += viagem.getDistancia();
		}
		return distanciaTotal / viagens.size();
	}
	
	public void addViagem(Viagem viagem) {
		this.viagens.add(viagem);
	}
}
