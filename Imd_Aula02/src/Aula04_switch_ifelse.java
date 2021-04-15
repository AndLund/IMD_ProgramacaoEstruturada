import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula04_switch_ifelse {
    public static Scanner sc = new Scanner(System.in);
//Atividade 02
//02
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList();
        String nome;
        int idade;
        for (int i = 0; i < 2; i++) {
            nome = sc.nextLine();
            idade = sc.nextInt();
            sc.nextLine();
            pessoas.add(new Pessoa(nome,idade));
        }

        if(pessoas.get(0).idade > pessoas.get(1).idade){
            System.out.println(pessoas.get(0).nome+" eh mais velha.");
        }else{
            System.out.println(pessoas.get(1).nome+" eh mais velha.");
        }
    }



    //01
//    public static void main(String[] args) {
//        int num;
//        num = sc.nextInt();
//        System.out.println((num % 2 == 0) ? "Eh par":"Eh impar");
//    }


    //Atividade 01

//02
//    public static void main(String[] args) {
//        int A,B,C;
//
//        A = sc.nextInt();
//        B = sc.nextInt();
//        C = sc.nextInt();
//
//        if(A < (B + C) && B < (A + C) && C < (A + B)){
//            System.out.println("Forma Triangulo");
//        }
//    }



    //01
//    public static void main(String[] args) {
//        int[] vetor = new int[5];
//        int soma = 0;
//
//        for (int i = 0; i < vetor.length; i++) {
//            vetor[i] = sc.nextInt();
//            soma = soma + vetor[i];
//            if(i != 0 && soma%2 == 0){
//                System.out.println("Múltiplo de 2");
//            }
//        }
//    }
}

class Pessoa {
    String nome;
    int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
