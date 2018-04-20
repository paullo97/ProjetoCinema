package hello;

public class Usuario {
	private String nome;
	private String cpf;
	
	public Usuario(String nome, String cpf){
		this.setNome(nome);
		this.setCpf(cpf);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public boolean compararUsuario(Usuario usuario) {
		if(this.getNome().equals(usuario.getNome())) {
			return true;
		}
		else {
			return false;
		}
	}


}
