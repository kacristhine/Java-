import java.util.*;
public class Teste1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolhas;

        Conta Conta1 = new Conta();
	nome:"Karen Cristhine";
	numeroConta: 123456789;
	agencia:"12345";
	saldo: 1000000;
	dataAbertura: "1 de março de 2021";
       
	System.out.println("Seja bem-vindo " + Conta1.returnNome());
        
        do{
            System.out.println("digite: \n 1- Sacar \n 2- Depositar \n Outro- Sair");

            escolhas = sc.nextInt();
            if(escolhas==1){
                System.out.println("Qual valor desejaria sacar?");
                Conta1.Sacar(0);
                System.out.print("Saque concluído, sua conta tem R$" + Conta1.returnSaldo() + ". Agora com a taxa de 5%, sua renda e: \nR$");
                Conta1.Renda();
            }else if(escolhas==2){
                System.out.println("Quanto voce gostaria de depositar?");
                Conta1.Depositar(0);
                System.out.print("Depois do deposito, sua conta tem R$" + Conta1.returnSaldo() + ". Agora com a taxa de 5%, sua renda e: \nR$");
                Conta1.Renda();
            }else{
                System.out.println("Obrigado pela preferencia " + Conta1.returnTitular() + ", espero que não odeie o Planeta Fome ");
            }
            if(escolhas==1 || escolhas==2){
                System.out.print("\nVoce sera redirecionado.");
            }
        }while(escolhas<2);
    }
}