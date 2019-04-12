import java.util.Scanner;
public class Welcome {
    public static void main (String [] args){
        String nome;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nome = ler.next();
        
        System.out.print("Welcome, "+nome);
        
    }
    
}