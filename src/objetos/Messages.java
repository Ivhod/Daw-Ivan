package objetos;

public class Messages {

	private String texto;
	private int id_remite;
	private int id_destino;
	private boolean nuevo;

	public Messages(String texto, int rem, int dest, boolean nuevo) {
		this.texto = texto;
		this.id_remite = rem;
		this.id_destino = dest;
		this.nuevo = nuevo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getId_remite() {
		return id_remite;
	}

	public void setId_remite(int id_remite) {
		this.id_remite = id_remite;
	}

	public int getId_destino() {
		return id_destino;
	}

	public void setId_destino(int id_destino) {
		this.id_destino = id_destino;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	public String toString() {
		return this.texto + " " + this.nuevo;
	}
}
