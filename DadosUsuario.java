package com.mycompany.dadosusuario;
//importei a classe scanner e a locale para padronizar a resposta dos caracteres
import java.util.Scanner;
import java.util.Locale;

public class DadosUsuario {//denominei de DadosUsuario

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar;//Responsável por controlar o fluxo do loop

        do { //aqui é pedido as informações do usuário
            System.out.println("\n=== CADASTRO DE USUÁRIO ===");
            
            System.out.print("Nome completo: ");
            String nome = scanner.nextLine();
            
            System.out.print("Data de nascimento (DD/MM/AAAA): ");
            String dataNascimento = scanner.nextLine();
            
            System.out.print("Curso: ");
            String curso = scanner.nextLine();
            
            System.out.print("Série/Ano: ");
            String serie = scanner.nextLine();
            
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            
            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); 
            
            exibirResumo(nome, dataNascimento, curso, serie, altura, peso);
            
            continuar = verificarNovoCadastro(scanner);
        } while (continuar);
        
        scanner.close();
    }
// aqui será exibido o resumo dos dados coletados
    public static void exibirResumo(String nome, String dataNascimento, String curso, 
                                  String serie, double altura, double peso) {
        System.out.println("\n=== RESUMO DOS DADOS ===");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Série/Ano: " + serie);
        System.out.printf("Altura: %.2f m\n", altura);
        System.out.printf("Peso: %.2f kg\n", peso);
    }
// Aqui será feito uma nova verificação
    public static boolean verificarNovoCadastro(Scanner scanner) {
        System.out.print("\nDeseja cadastrar outro usuário? (SIM ou NAO): ");
        String resposta = scanner.nextLine().toUpperCase(Locale.ROOT);
        return !resposta.equals("NAO");
    }
}