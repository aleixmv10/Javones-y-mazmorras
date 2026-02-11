package javones_mazmorras;

public class mago extends personajes {
	private int mana;
	
	public mago ( String nombre, int nivel, int vida, int mana) {
	super();
	
		this.mana = mana;
	}
	 public void lanzarHechizo(int costeMana) {
        if (mana >= costeMana) {
            mana = mana - costeMana;
            System.out.println(getNombre() + " lanza un hechizo.");
        } else {
            System.out.println("No hay suficiente maná.");
        }
    }
	public void recargarMana(int cantidad) {
        mana = mana + cantidad;
    }

    public int getMana() {
        return mana;
    }
}

