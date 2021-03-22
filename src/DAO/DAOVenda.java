/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModelVenda;
import conexao.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LVIS MACUA
 */
public class DAOVenda {  
    
    public int salvarVendasDAO(ModelVenda pModelVenda){
         Integer idInseridoVenda=0;
         Session session=null;
         Transaction transaction=null;
        try {  
            session=NewHibernateUtil.getSessionFactory().openSession();
            transaction=session.beginTransaction();
            idInseridoVenda=(Integer) session.save(pModelVenda);
            transaction.commit();
            
        } catch (Exception e) { 
            e.printStackTrace();
            return 0;
        }finally{
            if (session!=null) {
                session.close();
            }
        } 
        return idInseridoVenda;
    }  
    
    public boolean excluirVendasDAO(ModelVenda pModelVenda){
        Session session =null;
        try {
            session=NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction=session.beginTransaction();
            session.delete(pModelVenda);
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
    
    public boolean editarVendasDAO(ModelVenda pModelVenda){
        Session session=null;
        try {  
            session=NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction=session.beginTransaction();
            session.update(pModelVenda);
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
    
    public ModelVenda buscarVendaDAO(int idVenda){
        ModelVenda modeloVenda=null;
        Session session=null;
        try {
            session=NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction=session.beginTransaction();
            modeloVenda=(ModelVenda) session.get(ModelVenda.class, idVenda);
            transaction.commit();
        } catch (Exception e) { 
            e.printStackTrace();
            
        }finally{
            if (session!=null) {
                session.close();
            }
        }  
        return modeloVenda;
    }   
    
    public List<ModelVenda> listarTodasVendaDAO(){  
        List<ModelVenda> listarTodasVendasDAO=null;
        Session session=null;
        
        try {  
            session=NewHibernateUtil.getSessionFactory().openSession();
            Transaction transaction=session.beginTransaction();
            listarTodasVendasDAO=session.createQuery("from ModelVenda").list();
            transaction.commit();
            
        } catch (Exception e) { 
            e.printStackTrace();
        }finally{
            if (session!=null) {
                session.close();
            }
        }
       return listarTodasVendasDAO;
    }
    
}
