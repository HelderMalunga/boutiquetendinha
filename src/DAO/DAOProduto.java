/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModeloProduto;
import conexao.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LVIS MACUA
 */
public class DAOProduto { 
    
    public int salvarProdutosDAO(ModeloProduto pModelProduto){
        Session session=null;
        Transaction transaction=null;
        Integer idInseridoProduto=0;
        try {
            session=NewHibernateUtil.getSessionFactory().openSession();
            transaction=session.beginTransaction();
            idInseridoProduto=(Integer) session.save(pModelProduto);
            transaction.commit();
        } catch (Exception e) { 
            e.printStackTrace();
            return 0;
        }finally{
            if (session!=null) {
                session.close();
            }
        }
        return idInseridoProduto;
    }   
    
    public boolean excluirProdutoDAO(ModeloProduto pModeloProduto){
        Session session=null;
        try {
            session=NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction=session.beginTransaction();
            session.delete(pModeloProduto);
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
    
    public ModeloProduto buscarProdutoDAO(int idProduto){
         Session session=null;
         ModeloProduto modeloProduto=null;
         try {
            session=NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction=session.beginTransaction();
            modeloProduto=(ModeloProduto) session.get(ModeloProduto.class, idProduto);
            transaction.commit();
        } catch (Exception e) { 
            e.printStackTrace();
        }finally{
             if (session!=null) {
                   session.close();
             }
         }
        return modeloProduto;
    }
    
    
    
   public List<ModeloProduto> listarTodosProdutosDAO(){
         List<ModeloProduto> listarTodoProduto=null;
         Session session=null;
         try {
           session=NewHibernateUtil.getSessionFactory().openSession();
           Transaction transaction=session.beginTransaction();
           listarTodoProduto=session.createQuery("from ModeloProduto").list();
           transaction.commit();
       } catch (Exception e) { 
           e.printStackTrace();
       }finally{
             if (session!=null) {
                 session.close();
             }
         } 
         return listarTodoProduto;
   } 
   
   public boolean editarProdutosDAO(ModeloProduto pModelProduto){
      
       Session session=null;
       try {
           session=NewHibernateUtil.getSessionFactory().openSession();
           Transaction transaction=session.beginTransaction();
           session.update(pModelProduto);
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
