/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bikeshop.modelos;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author ALCB76
 */
public class Pessoa extends PessoaAbstract{
    
    String nome;
    LocalDate dataNascimento;
    String telefone;
    String email;
    String cpf;
    private int pontos;

    public Pessoa(String nome, LocalDate dataNascimento, String telefone, String email, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.pontos = 0;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
        
    @Override
    public void adicionaPontos(int pontos){
        this.pontos += pontos;
        
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", dataNascimento=").append(dataNascimento);
        sb.append(", telefone=").append(telefone);
        sb.append(", CPF=").append(cpf);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
