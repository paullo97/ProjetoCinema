package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Model model;
	
	
	public Controller(Model model){
		this.model = model;
	}
	public void buscarSala() {
		
		get("/sala/:numeroSala", (req,res) ->{
			
			int numerosala = Integer.parseInt(req.params(":numeroSala"));
			Sala salasEncontradas = model.buscarSala(numerosala);
			return new Gson().toJson(salasEncontradas);
		});
	}
	
	public void buscarUsuario() {
		
		get("/usuario", (req, res) -> {
			int numeroCpf = Integer.parseInt(req.params(":cpf"));
			Usuario usuarioEncontrado = model.buscarUsuario(numeroCpf);
			return new Gson().toJson(usuarioEncontrado);
		});
	}
	
	public void bucasrUsuarios() {
		get("/usuario/muitos", (req, res) -> {
			int numeroCpf = Integer.parseInt(req.params(":cpf"));
			Usuario usu = new Usuario(req.params(":nome"), numeroCpf);
			
			List<Usuario> usuariosEncontrados = model.buscarTodosUsuarios(usu);
			return new Gson().toJson(usuariosEncontrados);
		});
	}
	public void adicionarSala(){
		get("/sala/add|Sala", (req, res) -> {
			Sala sala = new Sala(Integer.parseInt(req.params(":numeroSala")), new Filme(req.params(":nomeFilme"),Integer.parseInt(req.params(":ano")), req.params(":descr"),Integer.parseInt(req.params(":horario"))));
			model.addSala(sala);
			return "";
		});
	}
	
	public void adicionarUsuario(){
		get("/usuario/addUsuario", (req, res)->{
			Usuario usuario = new Usuario(req.params(":nome"),Integer.parseInt((req.params(":cpf"))));
			model.addUsuario(usuario);
			return "";
		});
	}
	/*public void buscarCarro(){
		get("/carro/:modelo/:marca/:cor", (req, res) -> {
		
			Especificacao espec = new Especificacao(req.params(":modelo"), req.params(":marca"), req.params(":cor"));	
			List<Carro> carrosEncontrados = model.buscarEspecificacao(espec);	
			return new Gson().toJson(carrosEncontrados);
			
		});
	}*/
}
