package classroom;

public enum Tipo {
	DISCIPLINAR(10, "10"), FUNDAMENTACION(20, "Fund"), ELECTIVA(30, "ele");

	public int codigo;
	public String nombre;

	private Tipo(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
