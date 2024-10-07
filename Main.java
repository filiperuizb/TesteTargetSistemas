import java.util.Scanner;
import Fibonacci.Fibonacci;  
import TesteLetraA.TesteLetraA;
import Soma.Soma;
//Os próximos dois exercícios são exercícios lógicos creio eu que não é pra criar o código em si, então vou deixar no switch mais duas opções que irão primir o resultado que eu acho.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a opção: \n1 - Exercício 1 (Fibonacci) \n2 - Exercicio 2 (LetraAString) \n3 - Exercicio 3 (ExibirSoma) \n4 - Exercício 4 (SequênciaNúmeros) \n5 - Exercício 5 (LógicaInterruptor)");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe o número: ");
                int num = entrada.nextInt();
                if (Fibonacci.ehFibonacci(num)) {  
                    System.out.printf("O número %d pertence a sequência de Fibonacci.", num);
                } else {
                    System.out.printf("O número %d não pertence a sequência de Fibonacci.", num);
                }
                break;
            case 2:
            	System.out.println("Informe a palavra/frase: ");
            	String frase = entrada.next();
            	int contagemA = TesteLetraA.tamanhoA(frase);
            	System.out.printf("A string (%s) possui %d letras A/a! \n",frase,contagemA);
                
                boolean contemA = TesteLetraA.temA(frase);
                if (contemA) {
                    System.out.printf("A palavra/frase (%s) possui a letra a!\n", frase);
                } else {
                	System.out.printf("A palavra/frase (%s) possui a letra a!\n", frase);
                }
                break;
            case 3: 
            	int resultado = Soma.soma();
            	System.out.printf("Valor da variável Soma: %d \n", resultado);
            	break;
            case 4:
            	//a)
            	System.out.println("a) 1, 3, 5, 7, ___\n");
            	System.out.println("Próximo número da sequência: 9");
            	System.out.println("Lógica: 2 em 2");
            	//b)
            	System.out.println("b) 2, 4, 8, 16, 32, 64, ____");
            	System.out.println("Próximo número da sequência: 128");
            	System.out.println("Lógica: Sequência binária, dobrando.");
            	//c
            	System.out.println("c) 0, 1, 4, 9, 16, 25, 36, ____");
            	System.out.println("Próximo número da sequência: 49");
            	System.out.println("Lógica: Quadrado dos números em sequência, no caso 49 é 7 ao quadrado");
            	//d
            	System.out.println("d) 4, 16, 36, 64, ____");
            	System.out.println("Próximo número da sequência: 100");
            	System.out.println("Lógica: Quadrado PAR dos números em sequência, no caso 100 é 10 ao quadrado");
            	//e
            	System.out.println("e) 1, 1, 2, 3, 5, 8, ____");
            	System.out.println("Próximo número a sequência: 13");
            	System.out.println("Lógica: Mesma do primeiro exercício, a sequência e FIBONACCI, a sequência equivale aos dois números anteriores");
            	//f
            	System.out.println("f) 2, 10, 12, 16, 17, 18, 19, ____");
            	System.out.println("Próximo número a sequência: 20");
            	System.out.println("Lógica: Não entendi muito bem, mas acredito ser 20 pois após o 12 ele addota uma sequência 16,17,18,19,20");
            	break;
            case 5:
            	System.out.println("5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes."
            			+ " Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser."
            			+ " Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, "
            			+ "qual interruptor controla cada lâmpada?  ");
            	System.out.println("COMO IDENTIFIQUEI: ");
            	System.out.printf("Sala -> 3 interruptores \nCada interruptor conectado a 1 lampada em salas diferentes \nNão vejo as lampadas da sala que estou, "
            			+ "mas posso ligar e desligar os interruptores quantas vezes quiser \nNão vejo as lampadas da sala que estou, mas posso ligar e desligar os interruptores quantas vezes quiser"
            			+ "Obj -> Descobrir qual controla qual lâmpada \nREGRAS -> Usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lampada "
            			+ "\nInterruptor 1 | Interruptor 2 | Interruptor 3 \nLigo o interruptor 1, o que ficar ligado na sala é o 1 (1 IDA A SALA) \n"
            			+ "Volta acende o interruptor 2, o que ficar desligado será o Interruptor 3 e o que liguei Interruptor 2 (2 IDAS A SALA).");
            	
            default:
                System.out.println("Opção inválida.");
                break;
        }

        entrada.close();
    }
}
