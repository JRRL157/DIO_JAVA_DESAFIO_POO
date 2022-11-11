import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Aprendendo java!");
        curso.setCargaHoraria(1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Hoho");
        mentoria.setDescricao("Hoho2");
        mentoria.setData(LocalDate.now());

        System.out.println(curso.toString());
        System.out.println(mentoria.toString());
    }
}