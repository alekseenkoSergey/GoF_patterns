package main.bridge.report;

import main.bridge.printer.Printer;

public abstract class Report {

	private Printer printer;

	public Report(Printer printer) {
		this.printer = printer;
	}


	protected abstract String constructHeader();

	protected abstract String constructBody();

	protected abstract String constructFooter();


	public String print() {
		StringBuilder sb = new StringBuilder();
		sb.append(printer.printHeader(constructHeader()));
		sb.append(printer.printBody(constructBody()));
		sb.append(printer.printFooter(constructFooter()));
		return sb.toString();
	}

}
