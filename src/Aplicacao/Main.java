package Aplicacao;
import IchiranRamenShop.Bebidas.Ko_Cha;
import IchiranRamenShop.Bebidas.O_Cha;
import IchiranRamenShop.Bebidas.Refrigerante;
import IchiranRamenShop.Carnes.Boi;
import IchiranRamenShop.Carnes.Porco;
import IchiranRamenShop.Carnes.Vegano;
import IchiranRamenShop.Extras.*;
import IchiranRamenShop.FilaDeEspera.Cliente;
import IchiranRamenShop.FilaDeEspera.FilaDeEspera;
import IchiranRamenShop.Pedido;
import IchiranRamenShop.Tamanhos.Grande;
import IchiranRamenShop.Tamanhos.Medio;
import IchiranRamenShop.Tamanhos.Pequeno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


class RealizarPedido{
    private Pedido pedidoTotal = new Pedido();
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private DecimalFormat formatPrice = new DecimalFormat("#.##");

    RealizarPedido() throws IOException {
        int input = 0;
        System.out.println("Bem Vindo ao Ichiran Ramen Shop! \n");
        while (input != 5){
            System.out.println("Escolha uma Opçao \n");
            System.out.println("1. Escolher Tamanho");
            System.out.println("2. Escolher Carne");
            System.out.println("3. Escolher Extra");
            System.out.println("4. Escolher Bebida");
            System.out.println("5. Fechar Pedido");
            input = Integer.parseInt(br.readLine());
            pedidoTotal = getValoresDescricao(input);
        }
         System.out.println(pedidoTotal.getDescricao());
         System.out.println("Preço total: \t R$" + formatPrice.format(pedidoTotal.getValor()));
        System.out.println("Aguarde seu pedido ficar pronto!");

        FilaDeEspera fila = new FilaDeEspera();
        new Cliente(fila);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            return;
        }

        fila.setState(pedidoTotal);
    }

    private Pedido getValoresDescricao(int escolha) throws IOException {
         Pedido pedido;
        switch (escolha){
            case 1:
                if (pedidoTotal.tamanhoSelecionado){
                    System.out.println("Tamanho Já selecionado!");
                    break;
                }
                System.out.println("Escolha um tamanho!");
                System.out.println("1 - Pequeno \t R$9,90 \n 2 - Medio \t R$12,90 \n 3 - Grande \t R$15,90");
                pedido = selecionar(Integer.parseInt(br.readLine()), "TAMANHO");
                return pedido;
            case 2:
                System.out.println("Escolha uma carne!");
                System.out.println("1 - Vegano \t R$3,90 \n 2 - Porco \t R$5,90 \n 3 - Boi \t R$7,90");
                pedido = selecionar(Integer.parseInt(br.readLine()), "CARNE");
                return pedido;
            case 3:
                System.out.println("Escolha um extra!");
                System.out.println("1 - Carne Extra \t R$4,00 \n 2 - Crème Alho \t R$1,50 \n 3 - Chili \t R$2,50");
                System.out.println("4 - Croutons \t R$2,00 \n 5 - Shitake \t R$6,90 \n 6 - Tofu \t R$2,70");
                pedido = selecionar(Integer.parseInt(br.readLine()), "EXTRA");
                return pedido;
            case 4:
                System.out.println("Escolha uma Bebida!");
                System.out.println("1 - Refrigerante \t R$5,90 \n 2 - O-Chá (Verde) \t R$3,90 \n 3 - KO-Chá (Preto) \t R$0,00");
                pedido = selecionar(Integer.parseInt(br.readLine()), "BEBIDA");
                return pedido;
            case 5:
                System.out.println("Obrigado por pedir no Ichiran Ramen Shop! ");
                return pedidoTotal;
            default:
                System.out.println("Opção Inválida");
                return pedidoTotal;
        }
        return null;
    }

    private Pedido selecionar (int escolha, String tipo) {
        switch (tipo){
            case "TAMANHO":
                if (escolha == 1)
                    return new Pequeno(pedidoTotal);
                 else if (escolha == 2)
                    return new Medio(pedidoTotal);
                  else if (escolha == 3)
                    return new Grande(pedidoTotal);
                else
                    System.out.println("Opção Inválida!");
                    return pedidoTotal;
            case "CARNE":
                if (escolha == 1)
                    return new Vegano(pedidoTotal);
                 else if (escolha == 2)
                    return new Porco(pedidoTotal);
                 else if (escolha == 3)
                    return new Boi(pedidoTotal);
                else
                    System.out.println("Opção Inválida!");
                    return  pedidoTotal;
            case "EXTRA":
                if (escolha == 1)
                    return new CarneExtra(pedidoTotal);
                 else if (escolha == 2)
                    return new CremeAlho(pedidoTotal);
                 else if (escolha == 3)
                   return new Chili(pedidoTotal);
                 else if (escolha == 4)
                     return new Croutons(pedidoTotal);
                 else if (escolha == 5)
                    return new Shitake(pedidoTotal);
                 else if(escolha == 6)
                     return new Tofu(pedidoTotal);
                 else
                    System.out.println("Opção Inválida!");
                    return pedidoTotal;
            case "BEBIDA":
                if (escolha == 1)
                    return new Refrigerante(pedidoTotal);
                else if (escolha == 2)
                    return new O_Cha(pedidoTotal);
                else if (escolha == 3)
                    return new Ko_Cha(pedidoTotal);
                else
                    System.out.println("Opção Inválida!");
                    return pedidoTotal;
            default:
                    return pedidoTotal;
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        RealizarPedido executar = new RealizarPedido();



    }
}
