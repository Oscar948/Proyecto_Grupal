/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author oscar
 */
public class Entrega {

    /**
     * @param args the command line arguments
     */
    public static void print(Object i){
       System.out.println(i.toString());
    }
    public static String read(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String m = br.readLine().toString();
            return m;
        } catch (IOException ex) {
            return ex.getMessage().toString();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int id = 0;
        int p1IntAge = 0;
        int p2IntAge = 0;
        
        id++;
        print("Escriba su nombre");
        String p1Name = read();
        print(p1Name + ", cuántos años tiene?");
        String p1Age = read();
        boolean isNumeric = p1Age.chars().allMatch( Character::isDigit );
        if(!isNumeric){
            print(p1Age + " no es un numero.");
            System.exit(0);
        }else{
            p1IntAge = Integer.parseInt(p1Age);
        }
        print("Doctor "  + p1Name + ", cuál es su especialidad?");
        String p1Oficio = read();
        
        Doctor persona1 = new Doctor(id,p1Name,p1Oficio,p1IntAge);
        
        print("--         *****         ♦♦♦♦♦         *****         --");
        id++;
        print("Escriba su nombre");
        String p2Name = read();
        print(p2Name + ", cuántos años tiene?");
        String p2Age = read();
        boolean isNumeric2 = p2Age.chars().allMatch( Character::isDigit );
        if(!isNumeric2){
            print(p2Age + " no es un numero.");
            System.exit(0);
        }else{
            p2IntAge = Integer.parseInt(p2Age);
        }
        print("Atleta "  + p1Name + ", cuál es su deporte preferido?");
        String p2Oficio = read();
        
        Deportista persona2 = new Deportista(id,p2Name,p2Oficio,p2IntAge);
        
        print("--         *****         ♦♦♦♦♦         *****         --");
        
        print("Resultados:");
        print(persona1.imprimeMensaje());
        print(persona2.imprimeMensaje());
    }
    
}
