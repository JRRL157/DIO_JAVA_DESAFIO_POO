import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Uma descrição qualquer!");
        bootcamp.addConteudo(curso);
        bootcamp.addConteudo(mentoria);

        Dev dev1 = new Dev("João");
        Dev dev2 = new Dev();
        dev2.setNome("Maria");

        dev1.signUpBootcamp(bootcamp);
        dev2.signUpBootcamp(bootcamp);

        //Antes de progredir
        System.out.println(dev1.exibirCursos());
        System.out.println(dev2.exibirCursos());

        //Após progredir
        dev2.progredir();
        dev2.progredir();
        dev1.progredir();
        System.out.println(dev1.exibirCursos()+"\nXP = "+dev1.calcularTotalXP());
        System.out.println(dev2.exibirCursos()+"\nXP = "+dev2.calcularTotalXP());
    }
}