package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
        //selecionarCandidatos();
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void entrandoEmContato (String candidato){
        int tentativasrealizadas = 1;
        Boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasrealizadas++;
            else
                System.out.println("Contato Realizado");
        } while (continuarTentando && tentativasrealizadas < 3);
            if(atendeu)
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasrealizadas + " Tentativa");
            else
                System.out.println("nao conseguimos conatato com " + candidato + " , numero maximo de tentativas " + tentativasrealizadas);
    }
    static void selecionarCandidatos (){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA"};
        String [] candidatosAprovados = {};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            //System.out.println("o candidato " + candidato + " solicitou esse valor de salario " + salarioPretendido);
            if(salarioBase <= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static void analisarCandidato(double SalarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > SalarioPretendido){
            System.out.println("Ligar para o Candidato");
        }
        else if(salarioBase == SalarioPretendido){
            System.out.println("Ligar para o Candidato com contra proposta");
        }
        else { 
            System.out.println("esperar resultado dos demais candidatos");
        }   
    }
}

