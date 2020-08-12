package com.trabalho.entidade;

/**
 *
 * @author Daniel F
 */
public abstract class Funcionario extends Pessoa {

    private double salario;

    private int ramal;

    public Funcionario() {
    }

    public Funcionario(double salario, int ramal) {
        this.salario = salario;
        this.ramal = ramal;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public double calculaSalarioAnual() {
        return (this.getSalario() * 12) + this.getSalario();
    }

}
