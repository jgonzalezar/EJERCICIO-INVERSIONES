/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgonzalezar
 */
public class Cliente {
    private int cedula; 
    private String name;
    private String lastName;
    private int edad;
    private String email;
    private Asset[] assets; 

    public Cliente(int cedula, String name, String lastName, int edad, String email, Asset[] assets) {
        this.cedula = cedula;
        this.name = name;
        this.lastName = lastName;
        this.edad = edad;
        this.email = email;
        this.assets = new Asset[10];
    }

    public boolean addAsset(Asset asset){
        
        
        return false;
    
    }

    public Asset[] getAssets() {
        return assets;
    }
    
}
