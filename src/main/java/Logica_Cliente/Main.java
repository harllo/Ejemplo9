/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Cancion;
import java.util.Scanner;

/**
 *
 * @author 1062076461
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Atributos
        String Titulo="";
        int Minutos=0;
        int Segundos=0;
        int Año_publicado=0;
        int Año_actual=2023;
        
        //Creacion de objetos

        Cancion objcancion = new Cancion();
        Scanner scan = new Scanner (System.in);
        
        System.out.println("digite el titulo de la canion");
        Titulo= scan.nextLine();
        objcancion.setTitulo(Titulo);
        
        System.out.println("Digite el minuto de la cancion ");
        Minutos= scan.nextInt();
        objcancion.setMinutos(Minutos);
        
        System.out.println("digite los segundos de la canion");
        Segundos= scan.nextInt();
        objcancion.setSegundos(Segundos);
        
        System.out.println("digite el año de publicacion de la canion");
        Año_publicado= scan.nextInt();
        objcancion.setAño_publicado(Año_publicado);
        
        //operacion
        int resultado = Año_actual - objcancion.getAño_publicado();
        
        System.out.println("el titulo de la cancion es:"+"\t"+objcancion.getTitulo());
        System.out.println("los minutos y segundos de la cancion es:"+"\t"+objcancion.getMinutos ()+
        ":"+ objcancion.getSegundos());
        
        System.out.println("el año de la publicaion de la cancion es:"+"\t"+resultado);

         
 }  
}
