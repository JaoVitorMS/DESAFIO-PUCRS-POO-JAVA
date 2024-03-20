/*implementar uma classe carro,
 que tera os atributos: placa, marca, modelo, cor, kilometragem e capacidade do tanque
 o objeto terá uma quantia no tanque e seu consumo medio km/litros
 objetivos: criar metodos construtores, modificadores de acesso e toString*/

 public class Carros {
    //atributos
    private String placa; //placa 
    private String placamerco; //placa da mercosul
    private String marca; //marca
    private String modelo; //modelo
    private String cor; //cor
    private double kmrod; //kilometragem
    private double capactan; //capacidade do tanque
    private double consuli; //consumo medio 
    public double quantiatan = 0; //quantia no tanque
    public double abastecerLitros; //abastecer litros
    public double abastecerReais; //abastecer reais
    public double andar; //andar
    public double capacidadeDeslocamento; //capacidade de deslocamento

    //metodo construtor
    public Carros(String placa, String placamerco, String marca, String modelo, String cor, double kmrod, double capactan, double consuli, double quantiatan){
        this.placa = placa;
        this.placamerco = placamerco;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.kmrod = kmrod;
        this.capactan = capactan;
        this.consuli = consuli;
        this.quantiatan = quantiatan;
    }

    //moetodos get
    public String getPlacamerco(){
        return placamerco;
    }
    public String getCor(){
        return cor;
    }
    //metodo set
    public void setPlacamerco(String placamerco){
       switch (placamerco) {
        case "sim":
            System.out.println("Você tem a placa da mercosul!");
            break;
        case "nao":
            System.out.println("Você não tem a placa da mercosul!");
            break;
       }

    }
    public void setCor(String cor){
        this.cor = cor;
    }
   

    
    //metodo toString
    public String toString(){
        return "Placa: " + placa + "| Marca: " + marca + "| Modelo: " + modelo + "| Cor: " + cor + "| Kilometragem: " + kmrod + "| Capacidade do tanque: " + capactan + "| Consumo medio: " + consuli;
    }

/* Agora tem que criar novos metodos descritos a seguir:
1- abastecerLitros(parametro) (responsavel por adicionar mais litros no
 atributo quantiatan. 
2- abastecerReais(valor em reais), que será responsavel por mostrar o
valor do abastecimento em reais e ira permitir que o atributo abastercerLitros,
atualize a quantiatan preço da gasolina para calculo está [1 litro = 5,65 reais])
3- andar(distancia percorrida em km) que ira fazer o calculo km / quantiatan.
4- capacidadeDeslocamento que ira mostrar quantos km o carro pode andar apartir 
da quantiatan
5- previsaoCombustivel(distancia percorrida em km) que ira mostrar quantos 
km o carro pode andar apartir da capactan
 */

        //metodo abastecerReais
    String abastecerReais(double valor){
        double litros = valor / 5.65;
        quantiatan += litros;
        return String.format("Você abasteceu %.2f litros de gasolina, com %.2f reais", litros, valor);
    }

    //metodo abastecerLitros
    String abastecerLitros(double litros){
        quantiatan += litros;
        return String.format("Você abasteceu %.2f litros de gasolina", litros);
    }

    //metodo andar
    String andar(double kilometros){
        double resultado = 100 / quantiatan;
        return String.format("Você pode andar %.2f", resultado);
    }

    //metodo capacidadeDeslocamento
    String capacidadeDeslocamento(double capdes){
        double resultado = capdes / quantiatan;
        return String.format("Você pode andar %.2f km apartir da quantia no tanque", resultado);
    }

    //metodo previsaoCombustivel
    String previsaoCombustivel(double kilometros){
        double preco = 100 / capactan;
        return String.format("Você pode andar %.2f km apartir da capacidade do tanque", preco);
    }

}
