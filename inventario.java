package javones_mazmorras;

public class inventario {

    private Equipamiento[] lista;
    private int cantidad;

    public Inventario() {
        lista = new Equipamiento[10]; // máximo 10 objetos
        cantidad = 0;
    }
	public void agregarEquipamiento(Equipamiento e) {
        if (cantidad < lista.length) {
            lista[cantidad] = e;
            cantidad++;
        } else {
            System.out.println("El inventario está lleno.");
        }
    }
    public void mostrarInventario() {
        if (cantidad == 0) {
            System.out.println("El inventario está vacío.");
        }

        for (int i = 0; i < cantidad; i++) {
            System.out.println(lista[i].getNombre() + " - " + lista[i].getTipo());
        }
    }
}
