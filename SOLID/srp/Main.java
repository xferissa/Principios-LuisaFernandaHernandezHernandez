class Main{
	public static void main(String[] args){
		Usuario user = new Usuario("Fer","email@gmail.com");
		UsuarioRepository ur= new UsuarioRepository();
		ur.guardar(user);
		EmailService es = new EmailService();
		es.enviarBienvenida(user);
	}
}
