public class exemplopoocaixaeletronico {

    public static void main(String[]args){
        Contasegura c= new Contasegura (212121);
        c.movimentação(50);
        c.saldo();
        c.movimentação(-75);
        c.saldo();
        c.movimentação(-1100);

    }
}
