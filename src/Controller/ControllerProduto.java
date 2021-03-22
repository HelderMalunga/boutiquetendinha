/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOProduto;
import Model.ModeloProduto;
import java.util.List;

/**
 *
 * @author LVIS MACUA
 */
public class ControllerProduto {  
    private DAOProduto daoProduto=new DAOProduto();
    
    public int salvarProdutoController(ModeloProduto pModelProduto){
       return this.daoProduto.salvarProdutosDAO(pModelProduto);
    }  
    public ModeloProduto buscarProdutoController(int idProduto){
        return this.daoProduto.buscarProdutoDAO(idProduto);
    } 
    
    public boolean excluirProdutoController(ModeloProduto pModeloProduto) {
        return this.daoProduto.excluirProdutoDAO(pModeloProduto);
    }
    public boolean editarProdutosController(ModeloProduto pModeloProduto){
        return this.daoProduto.editarProdutosDAO(pModeloProduto);
    }
    public List<ModeloProduto> listarTodosProdutosController(){
      return this.daoProduto.listarTodosProdutosDAO();
    } 
    
}
