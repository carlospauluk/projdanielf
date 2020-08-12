/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalho.mapa;

import com.trabalho.entidade.Cliente;
import com.trabalho.entidade.Presidente;
import com.trabalho.entidade.Secretaria;
import com.trabalho.entidade.Vendedor;

/**
 *
 * @author carlos
 */
public class MapaMain {

    public static void main(String[] args) {

        Presidente presidente = new Presidente();
        presidente.setDocumento("111.111.111-11");
        presidente.setNome("Asdrubal Leôncio Correa");
        presidente.setRamal(1111);
        presidente.setSalario(100000.0);
                
        Secretaria fatima = new Secretaria();
        fatima.setDocumento("222.222.222-22");
        fatima.setNome("Fátima");
        fatima.setRamal(2222);
        fatima.setSalario(2222.0);

        Secretaria ana = new Secretaria();
        ana.setDocumento("333.333.333-33");
        ana.setNome("Ana");
        ana.setRamal(3333);
        ana.setSalario(3333.0);

        Vendedor joao = new Vendedor();
        joao.setDocumento("444.444.444-44");
        joao.setNome("João");
        joao.setRamal(4444);
        joao.setSalario(4444.0);
        

        Vendedor vanessa = new Vendedor();
        vanessa.setDocumento("555.555.555-55");
        vanessa.setNome("Vanessa");
        vanessa.setRamal(5555);
        vanessa.setSalario(5555.0);
        

        Vendedor carlos = new Vendedor();
        carlos.setDocumento("666.666.666-66");
        carlos.setNome("Carlos");
        carlos.setRamal(6666);
        carlos.setSalario(6666.0);
        

        Cliente marcos = new Cliente();
        marcos.setDocumento("777.777.777-77");
        marcos.setNome("Marcos");
        marcos.setUsuario("marcos");
        marcos.setSenha("m");

        Cliente joana = new Cliente();
        joana.setDocumento("888.888.888-88");
        joana.setNome("Joana");
        joana.setUsuario("joana");
        joana.setSenha("j");

        Cliente elisa = new Cliente();
        elisa.setDocumento("999.999.999-999");
        elisa.setNome("Elisa");
        elisa.setUsuario("elisa");
        elisa.setSenha("e");

        Cliente lucas = new Cliente("lucas", "e");
        lucas.setDocumento("010.010.010-10");
        lucas.setNome("Lucas");
        lucas.setUsuario("lucas");
        lucas.setSenha("teste");
        
        
        joao.setComissao(444);
        vanessa.setComissao(555);
        carlos.setComissao(666);
        
        System.out.println("Salário Anual de Asdrúbal: " + presidente.calculaSalarioAnual());
        System.out.println("Salário Anual de Ana: " + ana.calculaSalarioAnual());
        
        System.out.println("A senha Lucas é '123456'? " + (lucas.verificarSenha("123456") ? "Sim" : "Não"));
        System.out.println("A senha Lucas é 'segredo'? " + (lucas.verificarSenha("segredo") ? "Sim" : "Não"));
        System.out.println("A senha Lucas é 'teste'? " + (lucas.verificarSenha("teste") ? "Sim" : "Não"));
        
        
        presidente.exibeDados();
        
        fatima.exibeDados();
        ana.exibeDados();
        
        joao.exibeDados();
        vanessa.exibeDados();
        carlos.exibeDados();
        
        marcos.exibeDados();
        joana.exibeDados();
        elisa.exibeDados();
        lucas.exibeDados();
        
        
        
        
        

    }

}
