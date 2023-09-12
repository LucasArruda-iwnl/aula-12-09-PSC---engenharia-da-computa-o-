public class for {
      public static void main(String[] args) {
    double nota1, nota2; 
 
    for (int contador = 1; contador <= 5; contador ++) { 
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("digite a nota 1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("digite a nota 2"));
        JOptionPane.showMessageDialog(null, "media" + (nota1 + nota2) / 2 );
    }  
    
}
} 