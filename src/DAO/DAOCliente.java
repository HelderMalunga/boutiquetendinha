/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModelCliente;
import conexao.NewHibernateUtil;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LVIS MACUA
 */
public class DAOCliente {  
    
    /**
     * Gravar clientes na  base de dados
     * @param pModelCliente
     * @return 
     */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        Session session=null;
        Transaction transaction =null;
        Integer idClienteInserido=0;
        try { 
            session=NewHibernateUtil.getSessionFactory().openSession();
            transaction=session.beginTransaction();
            idClienteInserido=(Integer)session.save(pModelCliente);
            transaction.commit();
        } catch (Exception e) { 
            e.printStackTrace();
        }finally{
            if (session!=null) {
                session.close();
            }
        }
        return idClienteInserido;
    } 
    
    /**
     * Excluir clientes na  base de dados
     * @param pModelCliente
     * @return 
     */
    
    public boolean excluirClienteDAO(ModelCliente pModelCliente){ 
        Session session=null;
        try { 
            session=NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction=session.beginTransaction();
           session.update(pModelCliente);
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
     * Listar todos clientes existentes na  base de dados
     * @return 
     */
    
  public List<ModelCliente> listarTodosClientesDAO(){
    List<ModelCliente> listaClientes=null;
    Session session=null;
      try {
          session=NewHibernateUtil.getSessionFactory().openSession();
          Transaction transaction=session.beginTransaction();
          listaClientes=session.createQuery("from ModelCliente").list();
          transaction.commit();
      } catch (Exception e) { 
          e.printStackTrace();
      }finally{
          if (session!=null) {
              session.close();
          }
      }
      return listaClientes;
  }
  
  
  /**
   * buscar um cliente na base de dados
   * @param idCliente
   * @return 
   */
    
  public ModelCliente  buscarClienteDAO(int idCliente){
      ModelCliente modeloCliente=null;
      Session session=null;
      try {
          session=NewHibernateUtil.getSessionFactory().openSession();
          Transaction transaction=session.beginTransaction();
          modeloCliente=(ModelCliente) session.get(ModelCliente.class, idCliente);
          transaction.commit();
      } catch (Exception e) { 
          e.printStackTrace();
      }finally{
          if (session!=null) {
              session.close();
          }
      }
      
      return modeloCliente;
  }
//  
//  public ModelCliente  buscarClienteDAO(int idCliente){
//      ModelCliente modeloCliente=null;
//      Session session=null;
//      try {
//          session=NewHibernateUtil.getSessionFactory().openSession();
//          Transaction transaction=session.beginTransaction();
//          modeloCliente=(ModelCliente) session.get(ModelCliente.class, idCliente);
//          transaction.commit();
//      } catch (Exception e) { 
//          e.printStackTrace();
//      }finally{
//          if (session!=null) {
//              session.close();
//          }
//      }
//      
//      return modeloCliente;
//  }
  
  public boolean editarClienteDAO(ModelCliente pModelCliente){
      Session session=null;
      try {
          session=NewHibernateUtil.getSessionFactory().openSession();
          Transaction transaction=session.beginTransaction();
          session.update(pModelCliente);
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
    
}
