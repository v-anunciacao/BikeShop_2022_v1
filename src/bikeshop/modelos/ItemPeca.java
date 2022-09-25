/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikeshop.modelos;

/**
 *
 * @author ALCB76
 */
public class ItemPeca {
    private String nome;
    private double valor;

    @Override
    public String toString() {
        
        int espaco = 30 - nome.length();
        String espacos = new String(new char[espaco]).replace("\0", " ");
        return "" + nome + espacos + "R$ " + valor;
    }

    public ItemPeca(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
