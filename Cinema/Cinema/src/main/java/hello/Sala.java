package hello;
import java.util.List;
import java.util.LinkedList;
public class Sala {
	private int numeroSala;
	private Filme filme;
	private  List<Cadeira> cadeiras = new LinkedList<Cadeira>();
	
	public Sala(int numeroSala, Filme filmeSala) {
		String letra[] = {"A","B","C"};
		this.setNumeroSala(numeroSala);
		this.setFilme(filmeSala);
		for( int a = 0; a<3;a++) {
			for (int i=0;i<10;i++) {
				Cadeira c = new Cadeira(letra[a],i,false);
				cadeiras.add(c);	
			}
		}
		this.setCadeiras(cadeiras);
	}
	
	public int getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public List<Cadeira> getCadeiras() {
		return cadeiras;
	}
	
	public void setCadeiras(List<Cadeira> cadeiras) {
		this.cadeiras = cadeiras;
	}
	public boolean compararSala(Sala s) {
		if(this.getNumeroSala() == (s.numeroSala)) {
			return true;
		}
		else {
			return false;		
		}
	}
}
