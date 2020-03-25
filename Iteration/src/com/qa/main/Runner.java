package com.qa.main;

public class Runner {

	public static void main(String[] args) {

		AppendixB task_1 = new AppendixB();
		AppendixC task_2 = new AppendixC();
		TenTimes print = new TenTimes();
		NumberPrinting printing = new NumberPrinting();

		task_1.appendixLoop();
		task_2.appendixCLoop();
		print.printOneToTen();
		printing.printingNumber();

	}

}
