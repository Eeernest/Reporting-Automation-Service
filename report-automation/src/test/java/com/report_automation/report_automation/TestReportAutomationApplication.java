package com.report_automation.report_automation;

import org.springframework.boot.SpringApplication;

public class TestReportAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.from(ReportAutomationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
