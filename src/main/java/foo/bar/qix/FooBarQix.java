package foo.bar.qix;

import java.util.List;

/**
 * Created by ozoghlami on 13/01/16.
 */
public class FooBarQix {

	/**
	 *
	 * @param number
	 * @return
	 */
	public static String formatNumber(int number) {
		StringBuilder result = new StringBuilder();

		List<FooBarQixEnum> fooBarQixes = FooBarQixEnum.sortByNumber(number);
		fooBarQixes.stream().forEach(s -> result.append(s.getDivideResult(number)));
		fooBarQixes.stream().forEach(s -> result.append(s.getContainResult(number)));

		return result.length() == 0 ? String.valueOf(number) : result.toString();
	}

	public static void main(String[] args) {
		for (int i = 1; i < 16; i++) {
			System.out.print(formatNumber(i) + " ");
		}
	}

}
