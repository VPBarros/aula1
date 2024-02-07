import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
         Scanner sc = new Scanner(System.in);

	        System.out.println("Por gentileza preencher formulario: ");
	        System.out.println("Nome completo: ");
	        String name = sc.nextLine();
	        System.out.println("Idade: ");
	        int idade= sc.nextInt();
	        // Consumir a nova linha pendente após o nextInt()
	       sc.nextLine();
	        System.out.println("Escolaridade: ");
	        String escolaridade=sc.nextLine();
	        System.out.println("Endereço: ");
	        String endereco=sc.nextLine();

	        System.out.println("As informações são: ");
	        System.out.println("Nome completo: "+name);
	        System.out.println("Idade: "+idade);
	        System.out.println("Escolaridade: "+escolaridade);
	        System.out.println("Endereço: "+endereco);

	        sc.close();		
		
    }
}
