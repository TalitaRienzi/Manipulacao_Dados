import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Data_e_hora {
    public static void main(String[] args) {

        String nome = "Talita";

        //Aqui declaramos uma variavel com tipo LocalDate.now para receber a hora atual
        LocalDate hoje = LocalDate.now();

        //Aqui colocamos a linguagem que será impressa o dia da semana
        Locale brasil = new Locale( "pt" ,"BR");


        //Aqui declaramos uma variavel do tipo string que recebera o dia da semana o primeiro GET é para
        //puxar o valor do dia da semana e o segundo GET é para traduzir para o Brasil.
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;

        LocalDateTime agora = LocalDateTime.now();


        // Aqui fazemos as condições para retornar a saudação referente a hora atual e o dia.
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        }else {
            saudacao = "Olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n" , nome, diaSemana, saudacao.toUpperCase());
    }
}