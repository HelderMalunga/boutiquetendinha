/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LVIS MACUA Helder
 */ 
@Entity 
@Table(name = "tbl_cliente")
public class ModelCliente { 
    @Id
    @GeneratedValue
    @Column(name = "pk_id_Cliente")
    private int idCliente;
    @Column(name = "cli_nome")
    private String nome;
    @Column(name = "cli_apelido")
    private String apelido;
    @Column(name = "cli_endereco")
    private String endereco;
    @Column(name = "cli_bairro")
    private String bairro;
    @Column(name = "cli_cidade")
    private String cidade;
    @Column(name = "cli_provincia")
    private String provincia;
    @Column(name = "cli_nuit")
    private String nuit;
    @Column(name = "cli_telefone")
    private String telefone;
    @Column(name = "cli_estado")
    private String estado;

    public ModelCliente() {
    }

    public ModelCliente(String nome, String apelido, String endereco, String bairro, String cidade, String provincia, String nuit, String telefone, String estado) {
        this.nome = nome;
        this.apelido = apelido;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.provincia = provincia;
        this.nuit = nuit;
        this.telefone = telefone;
        this.estado = estado;
    }
    

 

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getNuit() {
        return nuit;
    }

    public void setNuit(String nuit) {
        this.nuit = nuit;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

    @Override
    public String toString() {
        return idCliente + "   " + nome + " " + apelido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

  

   
    
    
    
    
}
