public class exercicio1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite um número");
        int n = sc.nextInt(); 
        long resultado; 
        for (int i = 2; i <=n; i++){
            resultado *= i; // mesmo que resultado = resultado * i 

        }
        System.out.println(resultado);

sc.close(); 

    }
    
}
