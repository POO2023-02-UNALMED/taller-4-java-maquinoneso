package classroom;

public enum Tipo {
	DISCIPLINAR(10, "POO"), FUNDAMENTACION(20, "Fisica"), ELECTIVA(30, "Deporte");

	public int codigo;
	public String nombre;

	private Tipo(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
