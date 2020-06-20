/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Mega_
 */
public class Atributos {
    String Nombre;
    String Matricula;
    String Correo;
    String Promedio;

    public void setPromedio(String Promedio) {
        this.Promedio = Promedio;
    }

    public String getPromedio() {
        return Promedio;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getCorreo() {
        return Correo;
    }
    
}
