package javones_mazmorras;

public class Ladron extands personajes{

    private boolean invisible;

    public Ladron(String nombre, int nivel, int vida) {
        super(nombre, nivel, vida);
        invisible = false;
    }
    public void robar() {
        if (invisible) {
            System.out.println(getNombre() + " roba sin ser visto");
        } else {
            System.out.println(getNombre() + " roba y es descubierto");
        }
    }
    public void hacerseInvisible() {
        invisible = true;
    }


}
