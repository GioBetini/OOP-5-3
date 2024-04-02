package View;

import javax.swing.JOptionPane;

import Controller.OperacaoController;

public class Main {
    public static void main(String[] args) throws Exception {
        OperacaoController op = new OperacaoController();

        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número natural"));
        try {
            System.out.println(op.operacaoValor(num));
        } catch (ArithmeticException arithmeticException) {
            System.err.println("Insira apenas valores positivos");
        }
    }
}
