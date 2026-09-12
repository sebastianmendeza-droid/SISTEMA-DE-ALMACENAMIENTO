package modelo;

public class Liquidos extends Productos{
    private int liquidos;
    private int congelados;


    public Liquidos (String categoria, String nombre, String familiar, String personal, int vencimiento, double precio, int liquidos){
        super(categoria, nombre, familiar, personal, vencimiento, precio);
        this.liquidos = liquidos;
    }

    public int getliquidos (){
        return liquidos;
    }
    public int getcongelados (){
        return congelados;
    }

  @Override 
    public void mostrarinformacion (){
        System.out.println("liquidos " + liquidos);
        super.mostrarinformacion();
        System.out.println("congelados " + congelados);
    }
    
}
