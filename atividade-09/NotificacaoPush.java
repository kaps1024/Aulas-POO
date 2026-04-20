class NotificacaoPush extends Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação push para " + getDestinatario());
    }
}