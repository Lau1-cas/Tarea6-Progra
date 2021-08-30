/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O;

public class ClsModeloDatos {
     String nombre;
    double Venero;
    double Vfebrero;
    double Vmarzo;
    private double total;
    
    //constructor
    public ClsModeloDatos(){
    nombre = "";
    Venero = 0;
    Vfebrero = 0;
    Vmarzo = 0;
    total =0;
}

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Venero
     */
    public double getVenero() {
        return Venero;
    }

    /**
     * @param Venero the Venero to set
     */
    public void setVenero(double Venero) {
        this.Venero = Venero;
    }

    /**
     * @return the Vfebrero
     */
    public double getVfebrero() {
        return Vfebrero;
    }

    /**
     * @param Vfebrero the Vfebrero to set
     */
    public void setVfebrero(double Vfebrero) {
        this.Vfebrero = Vfebrero;
    }

    /**
     * @return the Vmarzo
     */
    public double getVmarzo() {
        return Vmarzo;
    }

    /**
     * @param Vmarzo the Vmarzo to set
     */
    public void setVmarzo(double Vmarzo) {
        this.Vmarzo = Vmarzo;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
}
