
package tiendapoo;




public abstract class Alimentos {
    private String nombre, color;
    private int Calorias, peso_gramos;

    public Alimentos(String nombre, String color, int Calorias, int peso_gramos) {
        this.nombre = nombre;
        this.color = color;
        this.Calorias = Calorias;
        this.peso_gramos = peso_gramos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCalorias() {
        return Calorias;
    }

    public void setCalorias(int Calorias) {
        this.Calorias = Calorias;
    }

    public int getPeso_gramos() {
        return peso_gramos;
    }

    public void setPeso_gramos(int peso_gramos) {
        this.peso_gramos = peso_gramos;
    }
    
    public abstract String getTipo();
    
    
    

}
