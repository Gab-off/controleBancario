package entities;

import exceptions.SaldoInsuficienteException;
import exceptions.ValorMenorException;

import javax.swing.*;

public class MenuConta extends Menu {
    private ContaCorrente contaCC;
    private ContaPoupanca contaCP;

    public MenuConta() {
        contaCC = new ContaCorrente(500, 1000);
        contaCP = new ContaPoupanca(5000, 0.01);
        mensagemMenu = "1 - Conta Corrente\n2 - Conta Poupança\n0 - Sair";
    }

    @Override
    protected void executarMenu() {
        do {
            super.executarMenu();
        } while (opcao != 0);
    }

    @Override
    protected void avaliarOpcaoEscolhida() {
        switch (opcao) {
            case 1 -> operarContaCC();
            case 2 -> operarContaCP();
            case 0 -> JOptionPane.showMessageDialog(null, "Saindo...");
            default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }

    private void operarContaCC() {
        String submenu = """
            1 - Consultar Saldo
            2 - Depositar
            3 - Sacar
            4 - Atualizar Saldo
            0 - Voltar""";

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(submenu));

                switch (opcao) {
                    case 1 -> JOptionPane.showMessageDialog(null, contaCC.toString());
                    case 2 -> {
                        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito:"));
                        contaCC.depositar(valor);
                    }
                    case 3 -> {
                        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque:"));
                        contaCC.sacar(valor);
                    }
                    case 4 -> contaCC.atualizarSaldo();
                    case 0 -> opcao = -1;
                    default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            } catch (ValorMenorException | SaldoInsuficienteException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        } while (opcao != -1);
    }

    private void operarContaCP() {
        String submenu = """
            1 - Consultar Saldo
            2 - Depositar
            3 - Sacar
            4 - Atualizar Saldo
            0 - Voltar""";

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(submenu));

                switch (opcao) {
                    case 1 -> JOptionPane.showMessageDialog(null, contaCP.toString());
                    case 2 -> {
                        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito:"));
                        contaCP.depositar(valor);
                    }
                    case 3 -> {
                        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque:"));
                        contaCP.sacar(valor);
                    }
                    case 4 -> {
                        double reajuste = Double.parseDouble(JOptionPane.showInputDialog("Reajuste (%):"));
                        contaCP.atualizarSaldo(reajuste);
                    }
                    case 0 -> opcao = -1;
                    default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            } catch (ValorMenorException | SaldoInsuficienteException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        } while (opcao != -1);
    }
}
