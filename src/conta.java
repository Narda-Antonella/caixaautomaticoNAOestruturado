public class conta {

    private int conta;
    private float saldo = 100;    //// 100 é apenas um exemplo pois as novas ocntas nao possuin saldo

    public void movimentação(float valor){
        this.saldo = this.saldo + valor; /// this é usado para se referia ao atributo da classe neste caso conta ou saldo
    }
    public void saldo(){
        System.out.println("=========");
        System.out.println("conta: " + this.conta);
        System.out.println("saldo: R$" + this.saldo);
    }
}
