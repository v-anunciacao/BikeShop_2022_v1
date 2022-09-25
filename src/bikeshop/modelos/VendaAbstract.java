/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikeshop.modelos;

import java.util.ArrayList;

/**
 *
 * @author ALCB76
 */
public abstract class VendaAbstract {
    
    protected ArrayList<ItemAbstract> itens;
    
    public abstract double getTotalVendas();
    
}
