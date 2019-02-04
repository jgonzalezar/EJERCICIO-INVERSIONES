
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgonzalezar
 */
public class Company {
    private String name;
    private ArrayList<Asset> assets;
    private HashMap<Integer, Cliente> clients;

    public Company(String name) {
        this.name = name;
        this.assets = new ArrayList<>();
        this.clients = new HashMap<>();
    }
    
    public boolean addClient(int id, String name, String lastaName, String email, int edad){
        
        
        return false; 
    }
    
    public double getAllMarketValue(){
        double MarketValue = 0;
        for (Cliente client : clients.values()) {
            for (Asset asset : client.getAssets()){
                MarketValue+=asset.getMarketValue();
            }
        }
        return MarketValue;
    }
}
