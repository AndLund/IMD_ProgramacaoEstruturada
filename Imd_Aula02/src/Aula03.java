import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula03 {
    //Atividade 02

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        double media;

        aluno.setNome(sc.nextLine());
        aluno.setDisciplina(sc.nextLine());
        aluno.setNota1(sc.nextInt());
        aluno.setNota2(sc.nextInt());
        aluno.setNota3(sc.nextInt());
        aluno.setNota4(sc.nextInt());

        media = (aluno.getNota1()+aluno.getNota2()+aluno.getNota3()+aluno.getNota4())/4;

        System.out.println(media);
        System.out.println(aluno.getNome()+" "+aluno.getDisciplina());
    }


//02
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<String> frases = new ArrayList();
//        String frase;
//
//        for(int i = 0; i < 3; i++){
//            frase = sc.nextLine();
//            frases.add(frase);
//        }
//        for(int i = 2; i >= 0 ; i--){
//            System.out.println(frases.get(i));
//        }
//    }

//01
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Digite seu nome:");
//        String nome = sc.nextLine();
//        System.out.println("Olá, " + nome);
//    }

    //Atividade 01

    //03
//    public static void main(String[] args) {
//        int ladomenor = 20;
//        int ladoMaior = 30;
//        System.out.println(ladoMaior*ladomenor);
//    }

    //02
//    public static void main(String[] args) {
//        String nome = "And";
//        String sob = "X";
//        System.out.println("Meu nome é "+nome+" "+sob);
//    }

    //01
//    public static void main(String[] args) {
//        System.out.println("\\ e \"");
//    }
}

class Aluno{
    private String nome;
    private String disciplina;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;

    public Aluno(){}

    public Aluno(String nome, String disciplina, int nota1, int nota2, int nota3, int nota4) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }
}