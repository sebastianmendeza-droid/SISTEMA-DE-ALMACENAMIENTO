package modelo;





public class Productos { 


protected String categoria;
protected String nombre; 
protected int vencimiento;
protected double precio;
protected String familiar; 
protected String personal; 

public Productos (String categoria, String nombre, String familiar, String personal, int vencimiento, double precio){
         this.categoria = categoria; 
         this.nombre = nombre;
         this.vencimiento = vencimiento;
         this.precio = precio;
         this.familiar = familiar;
         this.personal = personal;
}

public  String getcategoria (){
    return categoria;
}
public  String getnombre (){
    return nombre;
}
public  int getvencimiento (){
    return vencimiento;
}
public  double getprecio () {
    return precio;
}
public String getfamiliar (){
    return  familiar;
}
public String getpersonal (){
    return personal;
}

 public void mostrarinformacion (){
    System.out.println("categoria " + categoria);
    System.out.println("nombre " + nombre);
    System.out.println("vencimiento " + vencimiento);
    System.out.println("precio " + precio);
    System.out.println("familiar " + familiar);
    System.out.println("personal " + personal);
 }

}
