/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalho.entidade;

/**
 *
 * @author carlos
 */
public class Cliente extends Pessoa {
    
    private String usuario;
    
    private String senha;

    public Cliente() {
    }

    public Cliente(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
  

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean verificarSenha(String s) {
        return this.senha.equals(s);
    }
    
    
    
}
