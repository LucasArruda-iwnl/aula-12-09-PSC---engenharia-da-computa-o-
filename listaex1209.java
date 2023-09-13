public class listaex1209 {
    public static void main(String[] args) {
        double salario = 1000; 
        double salario_2006 = salario * 1.015;
        for (int ano = 2006; ano <= 2023; ano++ ){
            salario = salario + (salario * (salario_2006 / 100));  
            salario_2006 *= 2;
            System.out.println("ano" + ano + "salario" + salario +"persentual do ano seguinte"  + salario_2006);
        }
        System.out.println(salario);
    }
    
}
