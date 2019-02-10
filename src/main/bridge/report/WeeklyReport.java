package main.bridge.report;

import main.bridge.printer.Printer;

public class WeeklyReport extends Report {

	public WeeklyReport(Printer printer) {
		super(printer);
	}

	@Override
	protected String constructHeader() {
		return "weekly header";
	}

	@Override
	protected String constructBody() {
		return "weekly body";
	}

	@Override
	protected String constructFooter() {
		return "weekly footer";
	}
}
