package main.bridge.printer;

public class XmlPrinter implements Printer {

	@Override
	public String printHeader(String header) {
		return "<XML header> " + header + " </XML header>\n";
	}

	@Override
	public String printBody(String body) {
		return "<XML body> " + body + " </XML body>\n";
	}

	@Override
	public String printFooter(String footer) {
		return "<XML footer> " + footer + " </XML footer>\n";
	}

}
