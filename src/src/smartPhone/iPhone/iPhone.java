package smartPhone.iPhone;

import smartPhone.Mensagem.Mensagem;
import smartPhone.Navegador.Safari;
import smartPhone.AparelhoTelefonico.Telefone;
import smartPhone.PlayerDeMusica.Lista;
import smartPhone.PlayerDeMusica.iPod;
public class iPhone extends Lista implements Safari, Telefone, Mensagem, iPod {
    @Override
    public void fazerLigacoes() {
        System.out.println("Chamando contato...");
    }

    @Override
    public void receberLigacoes() {
        System.out.println("Chamada recebida.");
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem...");
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo o Safari...");
    }

    @Override
    public void tocarMusica(){
        System.out.println("Tocando música.");
    }

    @Override
    public void adicionarMusica() {

    }
}
