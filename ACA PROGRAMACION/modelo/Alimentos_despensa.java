package modelo;

public class Alimentos_despensa extends Productos{
    private int despensa;


public Alimentos_despensa (String categoria, String nombre, String familiar, String personal, int vencimiento, double precio, int frescos, int perecederos){
        super(categoria, nombre, familiar, personal, vencimiento, precio);
    }

    public int getdespensa (){
        return despensa;
    }

  @Override 
    public void mostrarinformacion (){
        System.out.println("despensa " + despensa);

    }
}
