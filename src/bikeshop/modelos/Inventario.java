/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikeshop.modelos;

import bikeshop.repositorio.Clientes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victo
 */
public class Inventario {
    private ArrayList<ItemPeca> inventario;
    
    public Inventario(){
        this.inventario = new ArrayList<>();
        
    }
    public void CarregarItens(){
        InputStream file = Clientes.class.getResourceAsStream("Produtos.txt"); //pega o endereço do arquivo
        try (BufferedReader br = new BufferedReader (new InputStreamReader(file))) { //cria o leitor
            var linha = br.readLine(); //pula a linha do cabeçalho
            linha = br.readLine(); //le a 
            while(linha != null) {
                String[] vetor = linha.split(";"); // divide em colunas
                String nome = vetor[0]; // seta nome
                Double valor = Double.parseDouble(vetor[1].replace(',', '.')); // seta o valor
                Integer qte = Integer.parseInt(vetor[2]); // seta o estoque

                ItemPeca item = new ItemPeca(nome, valor); // cria o item
                this.inventario.add(item); // adiciona o item no ArrayList inventario
                
                linha = br.readLine(); // pula pra próxima linha
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ItemPeca RetornarItem(String nome) {
        for(ItemPeca i : inventario) {
            if (i.getNome() == null ? nome == null : i.getNome().equals(nome)) {
                return i;
            }
        }
        return null;
    }
    
    public void ExibirItens(){
        for (ItemPeca i : inventario){
            System.out.println(i);
        }
    }
    
    public List<String> ItensEmVetor() {
        List<String> lista = new ArrayList<>();
            for (ItemPeca i : inventario){
                lista.add(i.toString());
            }
           return lista;
    }
    
    public int TamanhoDoInventario() {
        return this.inventario.size();
    }
    
    public ItemPeca RetornarItemPeloIndex(int index) {
        return this.inventario.get(index);
    }
}