/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModelUsuario;
import conexao.NewHibernateUtil;
import java.io.Serializable;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author LVIS MACUA
 */
public class DAOUsuario {  
    
    /**
     * 
     * @param pModelUsuario
     * @return  idUsuario
     */  
    
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario){
        Session session=null;
        Transaction transaction=null;
        Integer idUsuarioInserido=0;
        try {
            session=NewHibernateUtil.getSessionFactory().openSession();
            transaction=session.beginTransaction(); 
            idUsuarioInserido=(Integer) session.save(pModelUsuario);
            transaction.commit();
        } catch (Exception e) {  
            e.printStackTrace();
        }finally{
            if (session!=null) {
                session.close();
            }
        }  
        return idUsuarioInserido;
    }  
    
    public boolean excluirUsuarioDAO(ModelUsuario pModelUsuario){  
          Session session=null;
          try {
            session=NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction=session.beginTransaction();
            session.delete(pModelUsuario);
            transaction.commit();
        } catch (Exception e) {  
            e.printStackTrace();
            return false;
        } finally{
              if (session!=null) {
                  session.close();
              }
          }
           
         return true;
    } 
    /**
     * 
     * @param pModelUsuario
     * @return boolean 
     */
    
    public boolean editarUsuarioDAO(ModelUsuario pModelUsuario){ 
        Session session=null;
        try {
            session=NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction=session.beginTransaction();
            session.update(pModelUsuario);
            transaction.commit();
        } catch (Exception e) {  
            e.printStackTrace();
            return false;
        }finally{
            if (session!=null) {
                session.close();
            }
        }
        return true;
    } 
    
    /**
     * 
     * @param idUsuario
     * @return um usuario
     */
    public ModelUsuario buscarUsuarioDAO(int idUsuario){
        ModelUsuario modeloUsuario=null;
        Session session=null;
        try {
            session=NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction=session.beginTransaction();
            modeloUsuario=(ModelUsuario) session.get(ModelUsuario.class, idUsuario);
            transaction.commit();
        } catch (Exception e) {  
            e.printStackTrace();
        }finally{
            if (session!=null) {
                session.close();
            }
        } 
        return modeloUsuario;
    }  
    /**
     * 
     * @return lista de Usuarios 
     */
    
    public List<ModelUsuario> listarTodosUsuariosDAO(){
         Session session=null;
         List<ModelUsuario> listaUsuarios=null;
         try {
            session=NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction=session.beginTransaction();
            listaUsuarios=session.createQuery("from ModelUsuario").list();
            transaction.commit();
        } catch (Exception e) {  
            e.printStackTrace();
            
        }finally{
             if (session!=null) {
                session.close();
             }
         } 
         return listaUsuarios;
    }

    public boolean validarUsuarioDAO(String login ,String senha,String perfil)  { 
        
        Session session= NewHibernateUtil.getSessionFactory().openSession();
        ModelUsuario modeloUsuario= (ModelUsuario) session.createCriteria(ModelUsuario.class)
                .add(Restrictions.eq("login", login)).uniqueResult();
        if (modeloUsuario!=null) {
            if (modeloUsuario.getSenha().equalsIgnoreCase(senha) && modeloUsuario.getPerfil().equalsIgnoreCase(perfil)) { 
           
                return true;
            } else { 
  
                return false; 
            }
        } else { 
          
          
            return false;
        }
        
    }
    
}
