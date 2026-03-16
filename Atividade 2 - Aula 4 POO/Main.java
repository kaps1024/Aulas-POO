public class Main {

    public static void main(String[] args) {

        PagamentoCartao cartao = new PagamentoCartao();
        cartao.setNumeroCartao("1234 5678 9012 3456");
        cartao.setTitular("João Silva");

        PagamentoPix pix = new PagamentoPix();
        pix.setChavePix("joao@email.com");
        pix.setNomeTitular("João Silva");

        cartao.realizarPagamento(150);
        pix.realizarPagamento(75);
    }
}