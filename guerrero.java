package javones_mazmorras;

public class guerrero extends personajes {
     private Personaje protegido;
    
     public guerrero (String nombre, int nivel, int vida){
        super(nombre, nivel, vida);
     }
      
     public void proteger(Personaje p) {
        protegido = p;
        p.proteger();
        System.out.println(getNombre() + " protege a " + p.getNombre());
    }
   
    public void dejarDeProteger() {
        if (protegido != null) {
            protegido.desproteger();
            protegido = null;
        }
    }

}
