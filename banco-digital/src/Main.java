public class Main {
    public static void main(String[] args) {

        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

        Conta cc = new ContaCorrente(lucas);
        cc.depositar(777);

        Conta poupanca = new ContaPoupanca(lucas);
        cc.transferir(777, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}