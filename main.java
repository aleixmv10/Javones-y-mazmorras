public class Main {

    public static void main(String[] args) {

        Guerrero guerrero = new Guerrero("Arthur", 1, 100);
        Mago mago = new Mago("Gandalf", 1, 80, 50);
        Ladron ladron = new Ladron("Robin", 1, 70);

        
        guerrero.mostrarInfo();
        mago.mostrarInfo();
        ladron.mostrarInfo();

        System.out.println("------------------");

       
        guerrero.proteger(mago);

        mago.bajarVida(40);
        mago.mostrarInfo();

        System.out.println("------------------");

        
        mago.lanzarHechizo(20);

        System.out.println("------------------");

      
        ladron.robar();
        ladron.hacerseInvisible();
        ladron.robar();

        System.out.println("------------------");

        
        Equipamiento espada = new Equipamiento("Espada", "Arma");

        
        guerrero.agregarEquipamiento(espada);

        
        guerrero.getInventario().mostrarInventario();
    }
}
