import com.br.dio.challenge.dominio.Curso;
import com.br.dio.challenge.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.settitulo();
        mentoria1.setdescricao();
        mentoria1.setdata(LocalDate.now());

        System.out.println(Curso1);
        System.out.println(curso2);
    }
}