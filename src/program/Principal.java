package program;

import entities.MenuConta;
import exceptions.SaldoInsuficienteException;
import exceptions.ValorMenorException;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        try {
            MenuConta menu = new MenuConta();
            menu.executar();
        } catch (ValorMenorException e) {
            JOptionPane.showMessageDialog(null, "Erro de valor: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            JOptionPane.showMessageDialog(null, "Erro de saldo: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        } finally {
            JOptionPane.showMessageDialog(null, "Programa encerrado");
        }
    }
}