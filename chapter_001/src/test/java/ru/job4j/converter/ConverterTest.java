package ru.job4j.converter;

//import static java.lang.Math.*;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    int rublToDoll = 60;
    int rublToEuro = 70;
    int toRubl = 37;

    /**
     * Тест перевода рублей в доллары
     */
    @Test
    public void when6792RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = (int) converter.rubleToDollar(this.rublToDoll);
        assertThat(result, is((int) (rublToDoll/67.92d)));
    }
    /**
     * Тест перевода рублей в евро
     */
    @Test
    public void when7700RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = (int) converter.rubleToEuro(this.rublToEuro);
        assertThat(result, is((int) (rublToEuro/77.00d)));
    }
    /**
     * Тест перевода долларов в рубли
     */
    @Test
    public void when6792DollarToRublThen1() {
        Converter converter = new Converter();
        int result = (int) converter.dollarToRubl(this.toRubl);
        assertThat(result, is((int) (toRubl*67.92d)));
    }
    /**
     * Тест перевода евро в рубли
     */
    @Test
    public void when7700EuroToRublThen1() {
        Converter converter = new Converter();
        int result = (int) converter.euroToRubl(this.toRubl);
        assertThat(result, is((int) (toRubl*77.00d)));
    }
}
