/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOCliente;
import Model.ModelCliente;
import java.util.List;

/**
 *
 * @author LVIS MACUA
 */
public class ControllerCliente {
    private DAOCliente daoCliente=new DAOCliente();
    
    public int salvarClienteController(ModelCliente pModelCliente){
      return this.daoCliente.salvarClienteDAO(pModelCliente);
    } 
    
    public List<ModelCliente> listarTodosClientesController(){
        return this.daoCliente.listarTodosClientesDAO();
    }
    
    public boolean excluirClienteController(ModelCliente pCliente){
       return this.daoCliente.excluirClienteDAO(pCliente);
    }
    
    public ModelCliente buscarClienteController(int idCliente){
        return this.daoCliente.buscarClienteDAO(idCliente);
    }
    
    public boolean editarClienteController(ModelCliente pModelCliente){
       return this.daoCliente.editarClienteDAO(pModelCliente);
    } 
}
