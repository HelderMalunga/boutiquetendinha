/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOVenda;
import Model.ModelVenda;
import java.util.List;

/**
 *
 * @author LVIS MACUA
 */
public class ControllerVenda {
    private DAOVenda daoVenda=new DAOVenda();
    
    public int salvarVendasContoller(ModelVenda pModeloVenda){
        return this.daoVenda.salvarVendasDAO(pModeloVenda);
    }  
    
    public boolean excluirVendasController(ModelVenda pModelVenda){
        return this.daoVenda.excluirVendasDAO(pModelVenda);
    } 
    
    public boolean editarVendasController(ModelVenda pModelVenda){
        return this.daoVenda.editarVendasDAO(pModelVenda);
    }  
    
    public ModelVenda buscarVendaController(int idVenda){
        return this.daoVenda.buscarVendaDAO(idVenda);
    } 
    
    public List<ModelVenda> listarTodasVendasController(){
       return this.daoVenda.listarTodasVendaDAO();
    }
}
