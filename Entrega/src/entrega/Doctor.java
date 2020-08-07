/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrega;

/**
 *
 * @author oscar
 */
public class Doctor extends Persona{

    private int Id;
    private String Nombre;
    private String Profesion_u_Oficio;
    private int Edad;

    public Doctor(int Id, String Nombre, String Profesion_u_Oficio,int Edad ) {
        super(Id,Nombre,Profesion_u_Oficio,Edad);
        this.Id = Id;
        this.Nombre = Nombre;
        this.Profesion_u_Oficio = Profesion_u_Oficio;
        this.Edad = Edad;
    }


   public String imprimeMensaje(){
       return "El id: " + Id + " es el " + Profesion_u_Oficio + " " + Nombre + " de " + Edad + " años de edad";
   }
}
