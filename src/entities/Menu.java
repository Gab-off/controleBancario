package entities;

import javax.swing.*;

public class Menu {
    protected int opcao;
    protected String mensagemMenu;

    public void executar() {
        executarMenu();
    }

    protected void executarMenu() {
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(mensagemMenu));
                avaliarOpcaoEscolhida();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números!");
            }
        } while (opcao != 0);
    }

    protected void avaliarOpcaoEscolhida() {
    }
}
