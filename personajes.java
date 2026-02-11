package javones_mazmorras;


public abstract class personajes {

	private String nombre;
	private int nivel;
	private int puntosVida;
	private boolean protegido;
	private inventario inventario;
	
	public void Personaje (String nombre, int nivel,  int puntosVida) {
		this.nombre = nombre ;
		this.nivel = nivel;
		this.puntosVida = puntosVida;
		this.protegido = false;
		this.inventario = new inventario();
		
	}
	
	public void mostrarInfo () {
		System.out.println(" Nombre: " + nombre);
		System.out.println("Nivl: " + nivel);
		System.out.println(" Vida: " + puntosVida);
		
	}
	
	public void bajarVida (int cantidad) {
		if (protegido) {
			cantidad = cantidad / 2;
			
		}
		
		puntosVida -= cantidad;
		if (puntosVida < 0) {
			puntosVida += cantidad;
			
		}		
	}
	
	
	public void curar (int cantidad) {
		puntosVida += cantidad;
		
	}
	
	public inventario getInventario() {
		return inventario;
	}
	
	public void agregarEquipamiento(Equipamiento e ) {
		inventario.agregarEquipamineto(e);
	}
	
	public void setProtegido (boolean protegido) {
		this.protegido = protegido;
	}
	
	public boolean estaProtegido() {
		return protegido;
	}
	
	public String getNombre() {
		return nombre;
		
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public int getPuntosVida() {
		return puntosVida;
	}
	
	public String getNombre() {
        return nombre;
    }
	
	
	
	
	
	
	
	
	
}
