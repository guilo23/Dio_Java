public class ContaCorrente extends conta{
    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato conta Corrente ===");
        imprimirInfosComuns();
    }
}