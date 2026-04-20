public class Notificacao {
    private String mensagem;
    private String destinatario;

    public Notificacao() {}

    public void enviar() {
        System.out.println("Enviando notificação genérica.");
    }

    public void enviar(String mensagem) {
        this.mensagem = mensagem;
        System.out.println("Enviando mensagem: " + this.mensagem);
    }

    public void enviar(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        System.out.println("Enviando mensagem: " + this.mensagem + " para " + this.destinatario);
    }

    public void enviar(String mensagem, String destinatario, int prioridade) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
        System.out.println("Enviando mensagem: " + this.mensagem + " para " + this.destinatario + " com prioridade " + prioridade);
    }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
    public String getDestinatario() { return destinatario; }
    public void setDestinatario(String destinatario) { this.destinatario = destinatario; }
}