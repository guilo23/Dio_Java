public class contaPoupanca extends conta{
    
    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato conta poupança ===");
        imprimirInfosComuns();
    }

}
