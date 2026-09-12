package modelo;

public class No_alimentos extends Productos{
    private int aseo;
    private int limpieza;
    private int mascotas;

    public No_alimentos (String categoria, String nombre, String familiar, String personal, int vencimiento, double precio, int aseo, int limpieza, int mascotas){
        super(categoria, nombre, familiar, personal, vencimiento, precio);
        this.aseo = aseo;
        this.limpieza = limpieza;
        this.mascotas = mascotas;
    }

    public int getaseo (){
        return aseo;
    }

    public int getlimpieza (){
        return limpieza;
    }

    public int getmascotas (){
        return mascotas;
    }

  @Override 
    public void mostrarinformacion (){
        System.out.println("aseo " + aseo);
        super.mostrarinformacion();
        System.out.println("limpieza " + limpieza);
        super.mostrarinformacion();
        System.out.println("mascotas " + mascotas);

    }
    
}
