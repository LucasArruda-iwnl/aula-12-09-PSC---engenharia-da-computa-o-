import java.util.Scanner;
public class exercicio1209pt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n;
        System.out.println("digite um número"); 
        n = sc.nextInt(); 
        if ( n <= 3) { 
            System.out.println("é primo");

        }
        else { 
             boolean ehPrimo = true;

            for (int div = 2; div < (n - 1); div++){ 
                if (n % div == 0) { 
                    System.out.println("consegui dividir por" + div);
                    ehPrimo = false; 
                }
            }
            if (ehPrimo) { 
                System.out.println("é primo");
                
            }
            else { 
                System.out.println("não é primo");
            }
        }
        


        sc.close();
    }
    
}
