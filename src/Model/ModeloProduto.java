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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author LVIS MACUA
 */ 

@Entity
@Table(name = "tbl_produto")
public class ModeloProduto {  
    @Id
    @GeneratedValue 
    @Column(name = "pk_id_produto")
    private int idProduto;
    @Column(name = "pro_descricao")
    private String descricao; 
    @Column(name = "pro_sexo")
    private String sexo;
    @Column(name = "pro_codigo_de_barras")
    private String codigoDeBarras;
    @Column(name = "pro_paisDe_Origem")
    private String paisDeOrigem;
    @Column(name = "pro_fornecedor")
    private String Fornecedor;
    @Column(name = "pro_estoque")
    private int estoque;
    @Column(name = "pro_valor")
    private double valor;  
    
    /**
     * @Helder Macuácua 
     */
//    @ManyToOne
//    @Column(name = "pk_id_venda",insertable = false,updatable = false)
//    private ModelVenda venda;

    public ModeloProduto() {
    }

    public ModeloProduto(String descricao, String sexo, String codigoDeBarras, String paisDeOrigem, String Fornecedor, int estoque, double valor) {
        this.descricao = descricao;
        this.sexo = sexo;
        this.codigoDeBarras = codigoDeBarras;
        this.paisDeOrigem = paisDeOrigem;
        this.Fornecedor = Fornecedor;
        this.estoque = estoque;
        this.valor = valor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  idProduto + "   "+ descricao ;
    }
    
    
    
}
