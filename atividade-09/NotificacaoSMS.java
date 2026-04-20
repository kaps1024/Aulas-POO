class NotificacaoSMS extends Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando SMS para " + getDestinatario());
    }
}