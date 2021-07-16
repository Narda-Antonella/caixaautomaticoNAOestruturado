public class Contasegura {
    private int conta;
    public float saldo = 100;//// 100 é apenas um exemplo pois as novas ocntas nao possuin saldo

    public Contasegura(int conta){
        this.conta = conta;
        this.saldo = 100;
    }
    public void movimentação(float valor){
        if(valor>= -1000 && valor <= 1000){
        this.saldo = this.saldo + valor; /// this é usado para se referia ao atributo da classe neste caso conta ou saldo
    }
        else{
            System.out.println("atenção: não é possivel movimentar mais de R$1000.00");
        }
    }

    public void saldo() {
    }
}
