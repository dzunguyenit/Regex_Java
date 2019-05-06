package regexSubString;

public class Regex_Exercise_7 {

	public static void main(String[] args) {
		String regex = "(\\w+)\\(([\\w\\.]+):(\\d+)\\)";
		String TEXT1 = "at widget.List.makeView(ListView.java:1727)";
		System.out.println("Before TEXT1= " + TEXT1);
		String TEXT2 = "at widget.List.fillFrom(ListView.java:709)";
		System.out.println("Before TEXT2= " + TEXT2);

		System.out.println("After TEXT1= " + Regex.getSubString(TEXT1, regex));
		System.out.println("After TEXT2= " + Regex.getSubString(TEXT2, regex));

	}
}