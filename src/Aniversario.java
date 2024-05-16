import java.util.Date;
import java.text.*;
import java

public class Aniversario extends Pessoa{
    private Date dataNascimento;
    Date dataNascimento =request.getParameter("Data de Nascimento do Aluno");
    SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy"); //define a mascara da data
    Date dataNascimento=sdf1.parse(stx);


    public void fazerAniversario () {
        LocalDate hoje = LocalDate.now();
        LocalDate proximoAniversario = LocalDate.of(hoje.getYear(), dataNascimento.getMonth(), dataNascimento.getDayOfMonth());

        // Verifica se o próximo aniversário já passou
        if (hoje.isAfter(proximoAniversario) || hoje.isEqual(proximoAniversario)) {
            proximoAniversario = proximoAniversario.plusYears(1);
        }

        // Informa quantos dias faltam para o proximo aniversario
        int diasRestantes = (int) hoje.until(proximoAniversario).getDays();
        System.out.println("O próximo aniversário será em " + proximoAniversario + ". Faltam " + diasRestantes + " dias.");
    }
}
