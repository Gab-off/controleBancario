package entities;

import exceptions.SaldoInsuficienteException;
import exceptions.ValorMenorException;

public class ContaCorrente extends Conta {
    private double limiteEspecial;

    public ContaCorrente() {
    }

    public ContaCorrente(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public ContaCorrente(double saldo, double limiteEspecial) {
        super(saldo);
        this.limiteEspecial = limiteEspecial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new ValorMenorException("O valor deve ser maior que 0 (ZERO).");
        }

        double saldoTotal = saldo + limiteEspecial;

        if (valor > saldoTotal) {
            throw new SaldoInsuficienteException("Saldo insuficiente para efetuar o saque. Saldo disponível: " + saldoTotal);
        }
        saldo -= valor;

    }

    @Override
    public String toString() {
        return String.format("Conta Corrente\nSaldo: R$%.2f\nLimite: R$%.2f", saldo, limiteEspecial);
    }
}
