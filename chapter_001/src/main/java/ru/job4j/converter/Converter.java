package ru.job4j.converter;
/**
 * Конвертор валюты.
 * @author Dmitry Nikolaev (dymy@yandex.ru)
 * @since 2018-11-10
 *
 */
public class Converter {

    final double dollInRubl = 67.92d;
    final double euroInRubl = 77.00d;

    /**
     * Конвертируем рубли в евро
     * @param value рубли
     * @return евро
     */
    public double rubleToEuro (double value){
        return value / this.euroInRubl;
    }

    /**
     * Конвертируем рубли в доллар
     * @param value рубли
     * @return доллары
     */
    public double rubleToDollar (double value){
        return value / this.dollInRubl;
    }

    /**
     * Конвертируем евро в рубли
     * @param value евро
     * @return рубли
     */
    public double euroToRubl (int value) {
        return value * this.euroInRubl;
    }

    /**
     * Конвертируем доллары в рубли
     * @param value доллары
     * @return рубли
     */
    public double dollarToRubl (int value) {
        return value * this.dollInRubl;
    }
}
