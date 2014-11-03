package application;

import control.ExchangeCommand;
import view.persistance.CurrencySetLoader;

public class Application {

    public static void main(String[] args) {
        
        CurrencySetLoader loader = new CurrencySetLoader();
        loader.load();
        ExchangeCommand exchangeController = new ExchangeCommand();
        exchangeController.execute();
    }
}
