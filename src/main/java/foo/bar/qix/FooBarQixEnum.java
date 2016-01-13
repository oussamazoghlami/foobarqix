package foo.bar.qix;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ozoghlami on 13/01/16.
 */
enum FooBarQixEnum {

	FOO(3, "FOO"), BAR(5, "BAR"), QIX(7, "QIX");

	private final int dividor;

	private final String label;

	private FooBarQixEnum(int dividor, String label) {
		this.dividor = dividor;
		this.label = label;
	}

	public int getDividor() {
		return dividor;
	}

	public String getLabel() {
		return label;
	}

	public String getDivideResult(int number) {
		if (number % dividor == 0) {
			return label;
		}
		return "";
	}

	public String getContainResult(int number) {
		StringBuilder result = new StringBuilder();
		Pattern p = Pattern.compile(String.valueOf(dividor));
		Matcher m = p.matcher(String.valueOf(number));
		while (m.find()) {
			result.append(label);
		}
		return result.toString();
	}

	public static List<FooBarQixEnum> sortByNumber(int number) {
		String numberChar = String.valueOf(number);
		List<FooBarQixEnum> result = Arrays.asList(values());
		result.sort((o1, o2) -> Integer.compare(numberChar.indexOf(String.valueOf(o1.getDividor())), numberChar.indexOf(String.valueOf(o2.getDividor()))));
		return result;
	}
}
