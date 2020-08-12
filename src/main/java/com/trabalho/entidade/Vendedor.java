package com.trabalho.entidade;

/**
 *
 * @author Daniel F
 */
public class Vendedor extends Funcionario {
    
    private double comissao;

    public Vendedor() {
    }

    public Vendedor(double comissao) {
        this.comissao = comissao;
    }
    

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public double salarioMesComComissao() {
        return this.getComissao() + this.getSalario();
    }
    
    
}
