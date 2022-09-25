/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikeshop.modelos;

import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class Atendimento {
    private ArrayList<ItemAbstract> itens;
    private PessoaCliente cliente;
    
    public Atendimento(PessoaCliente cliente){
        this.cliente = cliente;
        this.itens = new ArrayList<ItemAbstract>();
    }
    
    public void adicionarItem(ItemAbstract item){
        this.itens.add(item);
    }
    
    public double getTotal(){
        double total = 0.0;
        for(ItemAbstract i : this.itens) {
            total += i.getValor();
        }
        return total;
    }

    public PessoaCliente getCliente() {
        return cliente;
    }
}
