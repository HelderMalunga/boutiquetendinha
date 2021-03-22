/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOUsuario;
import Model.ModelUsuario;
import java.util.List;

/**
 *
 * @author LVIS MACUA
 */
public class ControllerUsuario {  
     private DAOUsuario daoUsuario=new DAOUsuario();
     
    public int salvarUsuarioController(ModelUsuario pModeloUsuario){
       return this.daoUsuario.salvarUsuarioDAO(pModeloUsuario);
    }  
    
    public boolean excluirUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.excluirUsuarioDAO(pModelUsuario);
    } 
    public boolean editarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.editarUsuarioDAO(pModelUsuario);
    } 
    public ModelUsuario buscarUsuarioController(int idUsuario){
        return this.daoUsuario.buscarUsuarioDAO(idUsuario);
    }  
    
    public List<ModelUsuario> listarTodosUsuariosController(){
        return this.daoUsuario.listarTodosUsuariosDAO();
    }

    public boolean validarUsuarioController(String pLogin , String pSenha,String perfil) { 
     return this.daoUsuario.validarUsuarioDAO(pLogin,pSenha,perfil);
    } 
    
}
