package by.artezio.saladkou.stuctural.proxy;

import java.time.LocalDateTime;

public class CachingHttpExchangeRateServiceProxy implements ExchangeService {

    private HttpExchangeRateService service;
    private Double cachedDollarRate;

    public CachingHttpExchangeRateServiceProxy() {
        service = new HttpExchangeRateService();
    }

    @Override
    public double getDollarRate() {
        if (checkIsNeededToUpdate()) {
            update();
        }
        return cachedDollarRate;
    }

    private void update() {
        cachedDollarRate = service.getDollarRate();
    }

    private boolean checkIsNeededToUpdate() {
        if (cachedDollarRate == null) {
            return true;
        }
        LocalDateTime now = LocalDateTime.now();
        return now.getHour() == 0 && now.getMinute() == 0;
    }
}
