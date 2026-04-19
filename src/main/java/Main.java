

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um  número inteiro: "));

        JOptionPane.showMessageDialog(null, "O valor da variável é: " + numero);
    }
}
