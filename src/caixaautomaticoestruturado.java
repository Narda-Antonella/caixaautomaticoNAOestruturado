public class caixaautomaticoestruturado {
    public static void main (String[]args){
        int numeroconta = 212121;
        float saldoconta = 100;

        saldoconta = movimentacao(saldoconta,50);
        saldo(numeroconta,saldoconta);

        saldoconta = movimentacao(saldoconta,-75);
        saldo(numeroconta,saldoconta);
    }
    public static float movimentacao(float saldo, float valor){
        return saldo + valor;
    }
    public static void saldo(int conta, float saldo){
        System.out.println("=========");
        System.out.println("conta: " + conta);
        System.out.println("saldo: R$" + saldo);

    }
}
