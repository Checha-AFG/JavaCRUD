/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author chech
 */
public class Empleado extends Persona {
    private String cod_Empleado,puesto;

    public String getCod_Empleado() {
        return cod_Empleado;
    }

    public void setCod_Empleado(String cod_Empleado) {
        this.cod_Empleado = cod_Empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public void agregar(){
    System.out.println("Codigo Empleado: "+getCod_Empleado());
    System.out.println("Puesto: "+getPuesto());
    System.out.println("Nombres: "+getNombres());
    System.out.println("Apellidos: "+getApellidos());
    System.out.println("Dirección: "+getDireccion());
    System.out.println("Teléfono: "+getTelefono());
    System.out.println("Fecha Nacimiento: "+getFecha_nacimiento());
    };
}
