/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O;
import java.text.NumberFormat;
import java.util.*;

/**
 *
 * @author USUARIO
 */
public class ClsObjetos {
    Scanner teclado = new Scanner(System.in);
    public static NumberFormat formatoCantidad = NumberFormat.getCurrencyInstance(new Locale("es","GT"));
    List<ClsModeloDatos> lista = new ArrayList<>();
    
    
    public ClsModeloDatos IngresoInformacion (){
        ClsModeloDatos Dato = new ClsModeloDatos();
        
        System.out.println("Ingrese nombre del vendedor");
        Dato.setNombre(teclado.nextLine());
        
        System.out.println("Ingrese la venta de Enero");
        Dato.setVenero(teclado.nextInt());
                
        System.out.println("Ingrese la venta de Febrero");
        Dato.setVfebrero(teclado.nextInt());
        
        System.out.println("Ingrese la venta de Marzo");
        Dato.setVmarzo(teclado.nextInt());
        teclado.nextLine();
        
        lista.add(Dato);
        return Dato;
    }
   
    public static String cambiarFormato(double cantidad){
        return formatoCantidad.format(cantidad);
    }
    
    public void DesplegarInfo(){
        
        for(ClsModeloDatos ele: lista){
            
            System.out.println(ele.getNombre() + "       " + cambiarFormato(ele.getVenero()) +"     "+ cambiarFormato(ele.getVfebrero()) +"     "+ cambiarFormato(ele.getVmarzo()));
        }
    }
   
    public void Sumar(){
        
        double totalEnero = 0;
       double totalFebrero = 0;
       double totalMarzo = 0;
       
       for( ClsModeloDatos ele: lista){
           totalEnero += ele.getVenero();
           totalFebrero += ele.getVfebrero();
           totalMarzo += ele.getVmarzo();
       }
       double GranTotal = totalEnero+totalFebrero+totalMarzo;
        System.out.println("Venta Total hasta la fecha: "+ GranTotal);
        System.out.println("Venta total de Enero: " + totalEnero);
        System.out.println("Venta total de Febrero: " + totalFebrero);
        System.out.println("Venta total de Marzo: " + totalMarzo);
      
    }
 
    public void CargarTotal(){
         for(ClsModeloDatos Mp : lista){  
        
        Mp.setTotal(Mp.Venero + Mp.Vfebrero + Mp.Vmarzo);
        }
    }
    public void QuienVendioMas(){
        
        CargarTotal();
        if(lista.get(0).getTotal() > lista.get(1).getTotal() && lista.get(0).getTotal()> lista.get(2).getTotal()){
            System.out.println(lista.get(0).getNombre() +"  "+ lista.get(0).getTotal());
        }else if(lista.get(1).getTotal() > lista.get(0).getTotal() && lista.get(1).getTotal()> lista.get(2).getTotal()){
            System.out.println(lista.get(1).getNombre() +"  "+ lista.get(1).getTotal());
        }else{
            System.out.println(lista.get(2).getNombre() +"  "+ lista.get(2).getTotal());
        }
    }     
    public void QuienVendioMenos(){
        CargarTotal();
        if(lista.get(0).getTotal() < lista.get(1).getTotal() && lista.get(0).getTotal()< lista.get(2).getTotal()){
            System.out.println(lista.get(0).getNombre() +"  "+ lista.get(0).getTotal());
        }else if(lista.get(1).getTotal() < lista.get(0).getTotal() && lista.get(1).getTotal() < lista.get(2).getTotal()){
            System.out.println(lista.get(1).getNombre() +"  "+ lista.get(1).getTotal());
        }else{
            System.out.println(lista.get(2).getNombre() +"  "+ lista.get(2).getTotal());
        }
    }
    
    public void BusquedaCantidad(){
          double valor=0;
     int indice =0;
     System.out.println("Ingrese el Valor que desea Buscar");
     valor= teclado.nextDouble();
     indice= lista.indexOf(valor);
     if(indice!=-1){
     System.out.println("El dato se encuentra en el indice "+indice);
 
     }else{
              System.out.println("El dato nose encuentra en el rango");
     }
    }
   
    public void Menu(){
         Scanner t = new Scanner(System.in);
            String opc =" ";
            
            do{
            System.out.println("1- Ingreso de Informacion");//ready
            System.out.println("2- Desplegar toda la informacion");//ready
            System.out.println("3- Quien vendio menos (3 meses)");//ready
            System.out.println("4- Quien Vendio Mas(3 meses)");//ready
            System.out.println("5- Editar registro");//processing
            System.out.println("6- Busqueda por cantidad");//processing
            System.out.println("7- Totales por mes");//ready
            System.out.println("8- Salir del programa ;)");//ready jaja
            opc = t.nextLine();
            
            switch(opc){
                case"1": IngresoInformacion();
                break;
                case"2": DesplegarInfo();
                break;
                case"3": QuienVendioMenos();
                break;
                case"4": QuienVendioMas();
                break;
                case"5": QuienVendioMas();
                break;
                case"6": BusquedaCantidad();
                break;
                case"7": Sumar();
                break;
                case"8": System.out.println("Que te valla bien");
                break;
                
                
            }
        }while(!opc.equals("8"));
            
    }
}
