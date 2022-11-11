import br.com.dio.desafio.dominio.Conteudo;
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

        Conteudo conteudo = new Mentoria();
        Conteudo conteudo1 = new Curso();

        System.out.println(curso);
        System.out.println(mentoria);
    }
}