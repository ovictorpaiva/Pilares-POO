/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fb = new FacebookMessenger();
        System.out.println("Facebook");
        fb.enviarMensagem();
        fb.receberMensagem();


        Telegram tlg = new Telegram();
        System.out.println("Telegram");
        tlg.enviarMensagem();
        tlg.receberMensagem();

    }
}