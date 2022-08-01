import dio.desafio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do desafio Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do desafio Js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria do curso Java");
        mentoria.setData(LocalDate.now());

        //Polimorfismo
        Conteudo conteudo = new Curso();


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java dev");
        bootcamp.setDescricao("Descrição sobre o bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruno = new Dev();

        devBruno.setNome("Bruno");
        devBruno.InscreverBootCamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devBruno.getConteudosConcluidos());
        System.out.println("XP:" + devBruno.calcularTotalXp());


        System.out.println("<=======================>");


        Dev devCamila = new Dev();
        devCamila = new Dev();
        devCamila.InscreverBootCamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());



    }
}
