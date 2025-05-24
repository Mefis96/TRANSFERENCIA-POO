
package tiendapoo;




public class Grasas extends Alimentos {
 
    private boolean esSaturada;
    
    public Grasas(String nombre, String color, int Calorias, int peso_gramos, boolean esSaturada) {
        super(nombre, color, Calorias, peso_gramos);
        this.esSaturada = esSaturada;
    }

    public boolean isEsSaturada() {
        return esSaturada;
    }

    public void setEsSaturada(boolean esSaturada) {
        this.esSaturada = esSaturada;
    }
    

    @Override
    public String toString() {
        return "Grasas{" + "-> ¿es saturado? = " + esSaturada + " // Nombre: " + super.getNombre() + " // Color: " + super.getColor()+ " // Calorias: " + super.getCalorias() + " // Peso: " + super.getPeso_gramos() + '}';
    }
    
    
    @Override
    public String getTipo() {
        return "es saturada o no";
    }
    
}
