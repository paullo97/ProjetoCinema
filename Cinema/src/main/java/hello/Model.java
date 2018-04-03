package hello;
import java.util.List;
import java.util.LinkedList;
public class Model {
	private List<Usuario> usuarios = new LinkedList<Usuario>();
	private List<Sala> salas = new LinkedList<Sala>();
	public void addUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	public void addSala(Sala sala) {
		salas.add(sala);
	}
	public Usuario buscarUsuario(int cpf) {
		for(Usuario usuario:usuarios) {
			if(usuario.getCpf() == cpf) return usuario;
		}
		return null;
	}
	public Sala buscarSala(int numeroSala) {
		for(Sala sala:salas) {
			if(sala.getNumeroSala()== numeroSala) return sala;
		}
		return null;
	}
	public List<Sala> buscarTodasSalas(){
		List<Sala> salasEncontradas = new LinkedList<Sala>();
		for(Sala sala:salas) {
			salasEncontradas.add(sala);
		}
		return salasEncontradas;
	}
	public List<Usuario> buscarTodosUsuarios(){
		List<Usuario> usuariosEncontrados = new LinkedList<Usuario>();
		for(Usuario usuario: usuarios) {
			usuariosEncontrados.add(usuario);	
		}
		return usuariosEncontrados;
	}
//	public List<Carro> buscarEspecificacao(Especificacao esp){
//		List<Carro> carrosEncontrados = new LinkedList<Carro>();
//		
//		for(Carro carro:carros){
//			 if(esp.comparar(carro.getEspc())) carrosEncontrados.add(carro);
//		}
//		
//		return carrosEncontrados;		
//	}
	public List<Usuario> getUsuarios(){
		return usuarios;
	}
	
	public List<Sala> getSalas(){
		return salas;
	}


}
