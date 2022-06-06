import javax.swing.*;

public class Calificaciones {

    private JPanel panel1;
    private JTextField textField1;
    private JButton calcularPromedioButton;
    private JTextArea textArea1;

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JButton getCalcularPromedioButton() {
        return calcularPromedioButton;
    }

    public void setCalcularPromedioButton(JButton calcularPromedioButton) {
        this.calcularPromedioButton = calcularPromedioButton;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public static void main(String[] args) {

        Calificaciones ventana = new Calificaciones();
        JFrame contenedor = new JFrame();
        contenedor.setSize(500,500);
        contenedor.setLocationRelativeTo(null);
        contenedor.setVisible(true);

        contenedor.add(ventana.getPanel1());

    }
}
