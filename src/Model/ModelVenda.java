/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author LVIS MACUA
 */
@Entity
@Table(name = "tbl_vendas")
public class ModelVenda {  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_venda")
    private int idVenda; 
    @Column(name = "ven_quantidade")  // estoque
    private double quantidade;
    @Column(name = "ven_data")
    private Date dataVenda;
    @Column(name = "ven_valor_liquido") // valor unitario
    private double valorLiquido;
    @Column(name = "ven_valor_bruto") // valor total
    private double  valorBruto;
    @Column(name = "ven_desconto")
    private double desconto;
    @Column(name = "ven_hora")
    private Date horaVenda;
    
    
    /**
     * Relacionamentos 
     * 1 cliente pode fazer varias vendas
     */
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ModelCliente cliente; 
    
    /**
     * Relacionamento
     *  one to many-
     */
    @ManyToOne
    @JoinColumn(name = "id_produto")
    private ModeloProduto produtos; 

    
    /** @Hélder info.
     * O relacionamento significa : Um cliente esta para varios produtos na classe Venda 
     */  
    
    public ModelVenda() {
    } 

    public ModelVenda(double quantidade, Date dataVenda, double valorLiquido, double valorBruto, double desconto, ModelCliente cliente, ModeloProduto produtos) {
        this.quantidade = quantidade;
        this.dataVenda = dataVenda;
        this.valorLiquido = valorLiquido;
        this.valorBruto = valorBruto;
        this.desconto = desconto;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public int getIdVenda() {
        return idVenda;
    }
    

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataVenda() {
        return dataVenda;
    }
    
    public String getDataVendaConvertida() {
 
        DateFormat dateFormat = new SimpleDateFormat("dd / MM / yyyy ");
        String dataFormatada = dateFormat.format(this.dataVenda);
        return dataFormatada;
       
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }


    public ModelCliente getCliente() {
        return cliente;
    }

    public void setCliente(ModelCliente cliente) {
        this.cliente = cliente;
    }

    public ModeloProduto getProdutos() {
        return produtos;
    }

    public void setProdutos(ModeloProduto produtos) {
        this.produtos = produtos;
    }
    public String getHoraVendaConvertida() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String dataFormatada = dateFormat.format(this.horaVenda);
        return dataFormatada;
    }
    
    public Date getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(Date horaVenda) {
        this.horaVenda = horaVenda;
    }

    @Override
    public String toString() {
        return idVenda + " " + cliente ;
    }

    
     

   
    
    
    
    
    
    
    
    
}
