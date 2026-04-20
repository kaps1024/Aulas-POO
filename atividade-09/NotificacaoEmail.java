class NotificacaoEmail extends Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando e-mail para " + getDestinatario());
    }
}