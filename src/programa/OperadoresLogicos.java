package programa;

public class OperadoresLogicos {

    public static void main(String[] args) {
    //Trabalhou na terça = (V ou F)
    //Trabalhou na quinta = (V ou F)

    boolean trabalho1 = true;
    boolean trabalho2 = true;


    //&& = Este símbolo é um operador lógico relacional, que concatena uma condição e a outra condição (joao E maria)
    boolean comprouTV50 = trabalho1 && trabalho2;
    System.out.println("Comprou TV 50\"? " + comprouTV50);

    // || = Este símbolo é um operador lógico relacional, que impõe a duas condições (joao OU maria)
    boolean comprouTV32 = trabalho1 || trabalho2;
    System.out.println("Comprou TV 32\"? " + comprouTV32);

    // ! = Objeto relacional unário de negação
    // Utilização de 2 operadores lógicos relacionais distintos (Unário e Binário)
    boolean comprouSorvete = !trabalho1 && !trabalho2;
        System.out.println("Comprou sorvete? " + comprouSorvete);

    boolean maisSaudavel = !comprouSorvete;
        System.out.println("Mais saudavel? " + maisSaudavel);


    }
}
