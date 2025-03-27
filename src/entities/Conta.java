package entities;

import exceptions.SaldoInsuficienteException;
import exceptions.ValorMenorException;

public class Conta {
    protected double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new ValorMenorException("O Valor deve ser maior que 0 (ZERO).");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new ValorMenorException("O valor deve ser maior ou igual ao saldo.");
        } else if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para efetuar o saque.");
        }
        saldo -= valor;
    }

    public void atualizarSaldo() {
        if (saldo < 0) {
            double valorExcedente = saldo * -1;
            double multa = valorExcedente * 0.08;
            saldo -= multa;
        }
    }

}
