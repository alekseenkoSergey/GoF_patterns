package main.bridge.printer;

public class HtmlPrinter implements Printer {

	@Override
	public String printHeader(String header) {
		return "<HTML header> " + header + " </HTML header>\n";
	}

	@Override
	public String printBody(String body) {
		return "<HTML body> " + body + " </HTML body>\n";
	}

	@Override
	public String printFooter(String footer) {
		return "<HTML footer> " + footer + " </HTML footer>\n";
	}

}
