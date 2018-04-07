package hello;

import static spark.Spark.*;


public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 1234;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		//inicializarCarros();
		instalarSala();
		inicializarUsuarios();

		Controller controller = new Controller(model);
		
		controller.adicionarSala();
		controller.adicionarUsuario();
		
		controller.buscarSala();
		controller.buscarSalas();
		controller.buscarUsuario();
		controller.buscarUsuarios();
		controller.buscarSalaPorFilme();
		
		//controller.buscarCarro();
		
		
    }
    public static void instalarSala(){
    	model.addSala(new Sala(1, new Filme("Homem Formiga", 2014, "E mexilhaozinho", 14)));
    	model.addSala(new Sala(2, new Filme("Homem Formiga", 2014, "E mexilhaozinho", 14)));

    }
    
    public static void inicializarUsuarios() {
    	model.addUsuario(new Usuario("Jonathan", 1));
    }
    
    /*public static void inicializarCarros(){
    	model.addCarro(new Carro("AAA-1111", new Especificacao("gol", "vw", "verde")));
    }*/
}
