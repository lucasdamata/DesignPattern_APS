import services.SalesService;
import Produtos.SimpleProdutos;
import Produtos.Produtos;

import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception {
    SimpleProdutos Cama = new SimpleProduct("Cama", 960.36);
    SimpleProdutos Armario = new SimpleProduct("Armario", 587.69);
    SimpleProdutos Mesa = new SimpleProduct("Mesa", 789.65);

    List<Product> products = new ArrayList<>();
    Produtos.add(Cama);
    Produtos.add(Armario);
    Produtos.add(Mesa);

    SalesService seller = new SalesService();
    seller.sellProdutos(Produtos);
  }
}
