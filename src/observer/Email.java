package observer;

public class Email implements StockObserver {
  public void announce () {
    System.out.println("Produto disponivel \n");
    System.out.println("Realizando ultimos ajustes para sua compra \n");
  }
}
