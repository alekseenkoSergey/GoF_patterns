package main.bridge;

import main.bridge.printer.HtmlPrinter;
import main.bridge.printer.XmlPrinter;
import main.bridge.report.MonthlyReport;
import main.bridge.report.WeeklyReport;

public class Main {

	public static void main(String[] args) {
		System.out.println(new WeeklyReport(new XmlPrinter()).print());
		System.out.println("-----------------------------------\n");
		System.out.println(new WeeklyReport(new HtmlPrinter()).print());
		System.out.println("-----------------------------------\n");
		System.out.println(new MonthlyReport(new XmlPrinter()).print());
		System.out.println("-----------------------------------\n");
		System.out.println(new MonthlyReport(new HtmlPrinter()).print());
	}
}
