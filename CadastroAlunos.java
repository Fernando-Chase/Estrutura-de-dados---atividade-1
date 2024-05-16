import java.util.ArrayList;

public class CadastroAlunos {

   public static void main(String[] args) {

       ArrayList<String> alunos = new ArrayList<>();

       // Cadastrar os 25 alunos iniciais

       for (int i = 1; i <= 25; i++) {

           alunos.add("Aluno " + i);

       }

       // Inserir cinco novos alunos

       alunos.add("Novo Aluno 1");

       alunos.add("Novo Aluno 2");

       alunos.add("Novo Aluno 3");

       alunos.add("Novo Aluno 4");

       alunos.add("Novo Aluno 5");

       // Exibir todos os alunos cadastrados

       for (String aluno : alunos) {

           System.out.println(aluno);

       }

   }

}