/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mega_
 */
public class Archivos {
    private final String NombreArch="FinalTesoem.txt";
    List <Atributos> Datos = new ArrayList(); 
    boolean verificarArch;
    public boolean verificarArch(){
        File archivo = new File(NombreArch);
        if(!archivo.exists()) return false;
                else return true;
    }
    public boolean Guardar(List<Atributos> Datos2, int accion){
        FileWriter archivo;
        try{
            if (accion == 0){
                archivo = new FileWriter(NombreArch, true);
            } else {
                archivo = new FileWriter(NombreArch);
            }
            try(BufferedWriter bw = new BufferedWriter(archivo)){
              for(Atributos dato : Datos2){
                  bw.write(Conviertegson(dato)+ "\n");
              }  
              bw.close();
            }
            archivo.close();
        } catch(Exception ex){
            return false;
        }
        return true;
     
    }
    public boolean Leer(){
        String cadena = "";
        try{
            FileReader archivo = new FileReader(NombreArch);
            BufferedReader br = new BufferedReader(archivo);
            
            while((cadena =br.readLine())!= null){
                Datos.add(ConvierteClase(cadena));
                
            }
            br.close();
            archivo.close();
        } catch(Exception ex){
            return false;
        }
        return true;
        
    }
    public void Agregar(Atributos dato){
        Datos.add(dato);
    }
    private String Conviertegson(Atributos dato){
        Gson gson = new Gson();
        return gson.toJson(dato);
    }
    
    private Atributos ConvierteClase(String dato){
        Gson gson = new Gson();
        return gson.fromJson(dato, Atributos.class);
        
    }
    
    public List<Atributos> getDatos1(){
        return Datos;
    }
}

