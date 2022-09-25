/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikeshop.modelos;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ALCB76
 */
public class PessoaVendedor extends Pessoa{
    
    private double comissao;

    public PessoaVendedor(String nome, LocalDate dataNascimento, String telefone, String email, String cpf) {
        super(nome, dataNascimento, telefone, email, cpf);
        super.setPontos(0);
        this.comissao=0;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public void Atender(PessoaCliente cliente) {
        Atendimento venda = new Atendimento(cliente);
    }
    
    
    
    
    
}
