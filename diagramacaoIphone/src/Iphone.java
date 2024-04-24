public class Iphone {
    public static void main(String[] args) throws Exception {

    }
}

class ReproductorMusicaliPhone implements Reprodutor {
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausa");
    }


    @Override
    public void selecionarMusica(String cancion) {
    System.out.println("Canção selecionada" + cancion);
    }
}






class AparatoTelefonicoiPhone implements Telefono {
    
    @Override
    public void iniciarCorreoVoz() {
System.out.println("Iniciando correio de voz");
    }

    @Override
    public void ligar(String numero) {
    System.out.println("ligando" + numero);     
    }

    @Override
    public void atender() {

 System.out.println("atendendo ligação");   }
}


// Clase que implementa el navegador web para el iPhone
class NavegadorWebiPhone implements Navegador {
    @Override
    public void exibirPagina(String pagina) {
  System.out.println("exibindo pagina");  }

    @Override
    public void adicionarNovaAba() {
        System.out.println("abrindo nova aba");  }
    

    @Override
    public void atualizarPagina() {
    System.out.println("atualizando pagina");
    }
}
