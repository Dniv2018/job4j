package ru.job4j.calculate;

/**
 * Вывод строки в консоль.
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @since 2018-10-31
 */
public class Calculate {
	/**
	 * Main
	 * @param arg - arg.
	 */
	public static void main(String[] arg) {
		System.out.println("Hello World");
	}

	/**
	 * Method echo.
	 * @param name Your name.
	 * @return Echo plus your name.
	 */
	public String echo(String name) {
		return "Echo, echo, echo : " + name;
	}
}