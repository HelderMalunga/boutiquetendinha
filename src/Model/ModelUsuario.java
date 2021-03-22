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
import javax.persistence.Table;

/**
 *
 * @author LVIS MACUA
 */
@Entity
@Table(name = "tbl_usuario")
public class  ModelUsuario {  
    @Id
    @GeneratedValue
    @Column(name = "pk_id_usuario")
    private int idUsuario;
    @Column(name = "usu_nome")
    private String nome;
    @Column(name = "usu_apelido")
    private String apelido;
    @Column(name = "usu_login")
    private String login;
    @Column(name = "usu_senha")
    private String senha;
    @Column(name = "usu_confirmar_senha" )
    private String confirmarSenha;
    @Column(name = "usu_perfil")
    private  String perfil; 

    public  ModelUsuario() {
    }

    public ModelUsuario(String nome, String apelido, String login, String senha, String perfil,String confirmarSenha) {
        this.nome = nome;
        this.apelido = apelido;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
        this.confirmarSenha=confirmarSenha;
    }
    

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
        
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }
    
    
    
}
