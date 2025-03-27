package entities;

import exceptions.ValorMenorException;

public class ContaPoupanca extends Conta {
    private double reajusteMensal;

    public ContaPoupanca() {
    }

    public ContaPoupanca(double reajusteMensal) {
        this.reajusteMensal = reajusteMensal;
    }

    public ContaPoupanca(double saldo, double reajusteMensal) {
        super(saldo);
        this.reajusteMensal = reajusteMensal;
    }

    public double getReajusteMensal() {
        return reajusteMensal;
    }

    public void setReajusteMensal(double reajusteMensal) {
        this.reajusteMensal = reajusteMensal;
    }

    public void atualizarSaldo(double reajusteMensal) {
        if (reajusteMensal <= 0) {
            throw new ValorMenorException("Porcentagem do reajuste deve ser maior que 0 (ZERO).");
        }

        this.reajusteMensal = reajusteMensal;
        double rendimento = this.saldo * reajusteMensal;
        this.saldo += rendimento;
    }
}
