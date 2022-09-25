/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikeshop.modelos;

/**
 *
 * @author victo
 */
public abstract class ItemAbstract {
    protected String nome;
    protected double valor;

    public ItemAbstract(String nome, double valor) {
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

    @Override
    public String toString() {
        return "ItemAbstract{" + "nome=" + nome + ", valor=" + valor + '}';
    }

    
    public void reajuste(int percentual) {
        this.setValor(this.getValor() * (1 + percentual / 100));
    }
}
