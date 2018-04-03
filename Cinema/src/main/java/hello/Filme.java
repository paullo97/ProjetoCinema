package hello;

public class Filme {
	private String nomeFilme;
	private int ano;
	private String descr;
	private int horario;
	
	
	public Filme(String nomeFilme, int ano, String descr, int horario){
		this.setNomeFilme(nomeFilme);
		this.setAno(ano);
		this.setDescr(descr);
		this.setHorario(horario);
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	
	
	
	

}
