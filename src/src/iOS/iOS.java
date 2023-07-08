package iOS;

import smartPhone.Mensagem.Mensagem;
import smartPhone.Navegador.Safari;
import smartPhone.AparelhoTelefonico.Telefone;
import smartPhone.PlayerDeMusica.Lista;
import smartPhone.PlayerDeMusica.iPod;
import smartPhone.iPhone.iPhone;

public class iOS  {
    public static void main(String[] args) {
        iPhone em = new iPhone();
        Telefone telefone = em;
        iPod ipod = em;
        Mensagem mensagem = em;
        Safari safari = em;
        Lista lista = em;

        telefone.fazerLigacoes();
        mensagem.enviarMensagem();
        ipod.tocarMusica();
        safari.abrirNavegador();
        lista.adicionarMusica();

    }

}
