
package tiendapoo;


public class Carbohidratos extends Alimentos {
boolean esRefinado;
    public Carbohidratos(String nombre, String color, int Calorias, int peso_gramos, boolean esRefinado) {
        super(nombre, color, Calorias, peso_gramos);
        this.esRefinado = esRefinado;
    }

    public boolean isEsRefinado() {
        return esRefinado;
    }

    public void setEsRefinado(boolean esRefinado) {
        this.esRefinado = esRefinado;
    }
    

    @Override
    public String toString() {
        return "Carbohidratos{" + "-> ¿es refinado? = " + esRefinado + " // Nombre: " + super.getNombre() + " // Color: " + super.getColor()+ " // Calorias: " + super.getCalorias() + " // Peso: " + super.getPeso_gramos() + '}';
    } 

    @Override
    public String getTipo() {
        return "es refinado o complejo";
    }
    
}
