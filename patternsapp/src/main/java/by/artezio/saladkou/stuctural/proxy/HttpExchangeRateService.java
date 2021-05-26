package by.artezio.saladkou.stuctural.proxy;

public class HttpExchangeRateService implements ExchangeService{

    public double getDollarRate() {
        //complicated logic to receive dollar rate by http
        return 2.50;
    }
}
