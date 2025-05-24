
package tiendapoo;


public class FrutasVerduras extends Alimentos {
private boolean esFruta;
    
    
    public FrutasVerduras(String nombre, String color, int Calorias, int peso_gramos, boolean esFruta) {
        super(nombre, color, Calorias, peso_gramos);
        this.esFruta = esFruta;
    }

    public boolean isEsFruta() {
        return esFruta;
    }

    public void setEsFruta(boolean esFruta) {
        this.esFruta = esFruta;
    }

    @Override
    public String toString() {
        return "Frutas y Verduras{" + "-> ¿es una fruta? = " + esFruta + " // Nombre: " + super.getNombre() + " // Color: " + super.getColor()+ " // Calorias: " + super.getCalorias() + " // Peso: " + super.getPeso_gramos() + '}';
    }
    
    
    @Override
    public String getTipo() {
        return "fruta o verdura";
    }
    
    
}
