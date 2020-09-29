/* (a)
Implemente uma classe `Quadrado`, que possui um atributo 
`lado` de tipo `double`. Implemente um construtor que preenche 
o atributo `lado`. Faça com que essa classe __implemente__ a 
interface `Geometria`.
*/
public class Quadrado implements Geometria {

    private double lado;


    public Quadrado(double ladoInf){
        this.lado = ladoInf;
    }

    @Override
    public double getPerimetro() {
         return this.lado * 4;
    }

    @Override
    public double getArea(){
        return this.lado * this.lado;
    }

}
