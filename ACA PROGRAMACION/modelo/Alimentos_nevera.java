package modelo;

public class Alimentos_nevera extends Productos{
    private int frescos;
    private int perecederos;


    public Alimentos_nevera (String categoria, String nombre, String familiar, String personal, int vencimiento, double precio, int frescos, int perecederos){
        super(categoria, nombre, familiar, personal, vencimiento, precio);
        this.frescos = frescos;
        this.perecederos = perecederos;
    }

    public int getfrescos (){
        return frescos;
    }
    public int getperecederos (){
        return perecederos;
    }

    @Override 
    public void mostrarinformacion (){
        System.out.println("frescos " + frescos);
        super.mostrarinformacion();
        System.out.println("perecederos " + perecederos);
    }
}


