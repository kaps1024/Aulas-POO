public class Main {
    public static void main(String[] args) {

        Notificacao generica = new Notificacao();
        generica.enviar();
        generica.enviar("Promoção disponível!");
        generica.enviar("Olá!", "usuario@email.com");
        generica.enviar("Alerta urgente", "99999-9999", 5);

        System.out.println();

                
        NotificacaoEmail email = new NotificacaoEmail();
        email.setDestinatario("maria@email.com");
        email.enviar();

        NotificacaoSMS sms = new NotificacaoSMS();
        sms.setDestinatario("99999-9999");
        sms.enviar();

        NotificacaoPush push = new NotificacaoPush();
        push.setDestinatario("João");
        push.enviar();
    }
}