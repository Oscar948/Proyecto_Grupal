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

public abstract class Persona {
    
    private int Id;
    private String Nombre;
    private String Profesion_u_Oficio;
    private int Edad;

    public Persona() {
    }

    public Persona(int Id, String Nombre, String Profesion_u_Oficio, int Edad) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Profesion_u_Oficio = Profesion_u_Oficio;
        this.Edad = Edad;
    }
    

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setProfesion_u_Oficio(String Profesion_u_Oficio) {
        this.Profesion_u_Oficio = Profesion_u_Oficio;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getProfesion_u_Oficio() {
        return Profesion_u_Oficio;
    }

    public int getEdad() {
        return Edad;
    }
    
    
    public abstract String imprimeMensaje();
    
    
     public void imprimiriDoctor(){
        
        System.out.println("ID        "+Id);
        System.out.println("Nombre "+Nombre);
        System.out.println("Profesion u Oficio    "+Profesion_u_Oficio);
        System.out.println("Edad          "+Edad);
        
    }
      public void imprimiriSeportista(){
        
        System.out.println("ID        "+Id);
        System.out.println("Nombre "+Nombre);
        System.out.println("Profesion u Oficio          "+Profesion_u_Oficio);
        System.out.println("Edad          "+Edad);
        
    }
    
}