package by.artezio.saladkou.stuctural.proxy;

public class Program {

    public static void main(String[] args) {
        ExchangeService exchangeService = new CachingHttpExchangeRateServiceProxy();
        System.out.println(exchangeService.getDollarRate());
    }
}
