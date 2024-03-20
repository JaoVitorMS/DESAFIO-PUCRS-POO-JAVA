public class Desafio { //

    public static void main(String[] args) {
        
        //criando o objeto
        Carros novocarro = new Carros("IRM9H24 ", " nao ", " Honda ", " Civic ", " Preto ",  70000 , 60 , 7 , 0 );
        System.out.println(novocarro.getCor());
        System.out.println(novocarro.getPlacamerco());
        //testando o metodo toString
        System.out.println(novocarro.toString());
        //testando o metodo setPlacamerco
        novocarro.setPlacamerco("sim");
        //testandoo metodo setCor
        novocarro.setCor(" Cinza ");
        //testando o metodo abastecerReais
        System.out.println(novocarro.abastecerReais(100));
        //testando o metodo abastecerLitros
        System.out.println(novocarro.abastecerLitros(10));
        //testando o metodo andar
        System.out.println(novocarro.andar(50));
        //testando o metodo capacidadeDeslocamento
        System.out.println(novocarro.capacidadeDeslocamento(100));
        //testando o metodo previsaoCombustivel
        System.out.println(novocarro.previsaoCombustivel(100));

        System.out.println(novocarro.toString());
        System.out.println(novocarro.getPlacamerco());
        System.out.println(novocarro.getCor());
    }
}