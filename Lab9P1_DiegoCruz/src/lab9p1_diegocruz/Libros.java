/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Libros {
    
    //Aqui se encuentran los atributos.
    private String titulo, autor, genero;
    private int edmi;
            
    
    public Libros(String titulon, String autorn, String generon, int edmin){
        
        this.titulo = titulon;
        this.autor = autorn;
        this.genero = generon;
        this.edmi = edmin;
        
        
    }
    
    public Libros(){
        
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setEdmi(int edmi) {
        this.edmi = edmi;
    }

    public int getEdmi() {
        return edmi;
    }

    
    
    
}
