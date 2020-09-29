/* (b)
Implemente uma classe `Truco` que contém como atributos dois 
`Jogador`es, um `Baralho`, uma `cartaVirada` do tipo `Carta`. 
Sua classe deve ter um construtor padrão que inicializa cada um 
desses atributos (basicamente faz `new` neles). 
Deve ter um método privado `embaralharCartas()` que chama o método 
`embaralha()` do `Baralho`, um método privado `distribuirMaos()`, 
que deve distribuir três cartas do baralho para cada jogador 
(lembre-se do método `receberCarta` de `Jogador`). 
Você também deve implementar um método `inicializaManilha()`, 
que põe uma carta na meso (distribui uma carta do baralho e atribui a 
`cartaVirada`). Esses métodos que você implementar, 
vão complementar a classe truco. 
Para sua referência, segue o método `jogar()`, 
que implementa a lógica básica do início do jogo:
*/
public class Truco {

    private Jogador primeiroJogador;
    private Jogador segundoJogador;
    private Baralho baralho;
    private Carta cartaVirada;

    public Truco() {
        primeiroJogador = new Jogador();
        segundoJogador = new Jogador();
        baralho = new Baralho();
    }

    private void embaralhaCartas()
    {
        baralho.embaralhartudo();
    }

    public void distribuiMaos(){
        for(int cont = 0; cont < 3; cont++)
        {
            primeiroJogador.recebeacarta(baralho.distribuir());
            segundoJogador.recebeacarta(baralho.distribuir());
        }
    }

    public void inicializaManilha()
    {
        cartaVirada = baralho.distribuir();
    }

    private void imprimeMesa()
    {
        System.out.println("Apenas um placeholder para a impressão de mesa.");
        System.out.println("Você não precisa implementar esse método.");
    }

    public void jogar()
    {
        embaralhaCartas();
        distribuiMaos();
        inicializaManilha();
        imprimeMesa();
    }
}
