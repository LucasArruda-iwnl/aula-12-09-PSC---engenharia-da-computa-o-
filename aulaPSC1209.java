import javax.swing.JOptionPane;

public class aulaPSC1209 {
    public static void main(String[] args) {
    double nota1, nota2; 
    int contador = 1; 
    while (contador <= 5) { 
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("digite a nota 1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("digite a nota 2"));
        JOptionPane.showMessageDialog(null, "media" + (nota1 + nota2) / 2 );
        
    }        



        
    }
}