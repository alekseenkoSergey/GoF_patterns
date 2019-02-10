package main.bridge.report;

import main.bridge.printer.Printer;

public class MonthlyReport extends Report {

	public MonthlyReport(Printer printer) {
		super(printer);
	}

	@Override
	protected String constructHeader() {
		return "monthly header";
	}

	@Override
	protected String constructBody() {
		return "monthly body";
	}

	@Override
	protected String constructFooter() {
		return "monthly footer";
	}
}
