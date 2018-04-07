package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Model model;
	
	public Controller(Model model){
		this.model = model;
	}
	
	//Buscar
	public void buscarSala() { //Busca uma sala por numero da sala
		get("/sala/:numeroSala", (req,res) ->{ //ta funfando
			int numerosala = Integer.parseInt(req.params(":numeroSala"));
			Sala salaEncontrada = model.buscarSala(numerosala);
			return new Gson().toJson(salaEncontrada);
		});
	}
	
	public void buscarSalaPorFilme() {
		get("/salaFilme/:nomeFilme", (req, res) -> {
			String nomeFilme = req.params(":nomeFilme");
			List<Sala> salasEncontradas2 = model.buscarSalaPorFilme(nomeFilme);
			return new Gson().toJson(salasEncontradas2);
		});
	}
	
	public void buscarSalas() { //Retorna todas as salas
		get("/salas", (req, res) -> { //ta funfando
			List<Sala> salasEncontradas = model.buscarTodasSalas();
			return new Gson().toJson(salasEncontradas);
		});
	}
	
	public void buscarUsuario() { //Busca um usuario por cpf
		get("/usuario/:cpf", (req, res) -> { //funfo
			int numeroCpf = Integer.parseInt(req.params(":cpf"));
			Usuario usuarioEncontrado = model.buscarUsuario(numeroCpf);
			return new Gson().toJson(usuarioEncontrado);
		});
	}
	
	public void buscarUsuarios() { //Retorna todos os usuarios
		get("/usuarios", (req, res) -> {
			List<Usuario> usuariosEncontrados = model.buscarTodosUsuarios();
			return new Gson().toJson(usuariosEncontrados);
		});
	}
	
	//Adicionar
	public void adicionarSala() { //funfo
		get("/sala/addSala/:numeroSala/:nomeFilme/:ano/:descr/:horario", (req, res) -> {
			Sala sala = new Sala(Integer.parseInt(req.params(":numeroSala")), new Filme(req.params(":nomeFilme"),Integer.parseInt(req.params(":ano")), req.params(":descr"),Integer.parseInt(req.params(":horario"))));
			model.addSala(sala);
			return "";
		});
	}

	public void adicionarUsuario() { //funfo
		get("/usuario/addUsuario/:nome/:cpf/:numSala/:letra/:numero", (req, res)->{
			Usuario usuario = new Usuario(req.params(":nome"),Integer.parseInt((req.params(":cpf"))));
			int numSala = Integer.parseInt(req.params(":numSala"));
			int numero = Integer.parseInt(req.params(":numero"));
			String letra = req.params(":letra");
			
			model.escolherSala(numSala, letra, numero);
			model.addUsuario(usuario);
			return "";
		});
	}
}
