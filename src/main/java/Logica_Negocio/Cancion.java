/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1062076461
 */
public class Cancion {
    //atributos
    public String Titulo;
    public int Minutos;
    public int Segundos;
    public int Año_publicado;
    
    //constructor no parametrizado
    public Cancion(){
        
    }
   
    
    //constructor parametrizado

    public Cancion(String Titulo, int Minutos, int Segundos, int Año_publicado) {
        this.Titulo = Titulo;
        this.Minutos = Minutos;
        this.Segundos = Segundos;
        this.Año_publicado = Año_publicado;
    }
    
    //setters

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public void setSegundos(int Segundos) {
        this.Segundos = Segundos;
    }

    public void setAño_publicado(int Año_publicado) {
        this.Año_publicado = Año_publicado;
    }
    
    //getters

    public String getTitulo() {
        return Titulo;
    }

    public int getMinutos() {
        return Minutos;
    }

    public int getSegundos() {
        return Segundos;
    }

    public int getAño_publicado() {
        return Año_publicado;
    }
    
}
