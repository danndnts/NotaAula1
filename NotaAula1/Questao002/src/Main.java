import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String r;
        Produto p = new Produto();

        do {
            System.out.println("Digite 0 para cadastrar um produto ou 1 para comprar um produto: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case (0):
                    System.out.println("Digite o nome do produto: ");
                    p.setNome(sc2.nextLine());

                    System.out.println("Digite o código do produto: ");
                    p.setCodigo(sc2.nextLine());

                    System.out.println("Digite o peso do produto (Em kg): ");
                    p.setPeso(sc.nextInt());

                    System.out.println("Digite a cor do produto: ");
                    p.setCor(sc2.nextLine());

                    System.out.println("Digite o preço do produto: ");
                    p.setPreco(sc.nextDouble());

                    System.out.print("Quantidade em Estoque: ");
                    p.setQuantidadeEstoque(sc.nextInt());

                    System.out.println("Produto cadastrado com sucesso!");
                    p.exibirProduto();
                    break;

                case (1):
                    System.out.print("Quantidade a ser vendida: ");
                    int quantidadeVenda = sc.nextInt();

                    if (quantidadeVenda > p.getQuantidadeEstoque()){
                        System.out.println("Estoque insuficiente");
                        return;
                    }
                    double valorTotal = p.getPreco() * quantidadeVenda;
                    System.out.println("Método de pagamento:");
                    System.out.println("1 - Pix, Espécie, Transferência ou Débito (5% de desconto)");
                    System.out.println("2 - Crédito (Parcelado em 3x sem juros)");
                    int metodoPagamento = sc.nextInt();
                    double valorFinal = valorTotal;

                    switch (metodoPagamento){
                        case (1):
                            valorFinal = valorTotal * 0.95;
                            break;

                        case (2):
                            valorFinal = valorTotal;
                            break;

                        default:
                            System.out.println("Metódo de pagamento inválido");
                            return;
                    }
                    int novoEstoque = p.getQuantidadeEstoque() - quantidadeVenda;
                    p.setQuantidadeEstoque(novoEstoque);
                    System.out.println("\nVenda realizada com sucesso!");
                    System.out.println("Valor total: R$ " + valorTotal);
                    System.out.println("Valor com desconto: R$ " + valorFinal);
                    System.out.println("Novo estoque: " + p.getQuantidadeEstoque());



            }




            System.out.println("Deseja realizar uma outra operação, digite S");
            r = sc.next();
        } while (r.equalsIgnoreCase("S"));

    }
}
