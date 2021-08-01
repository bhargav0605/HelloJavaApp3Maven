package com.phoenix.services;

import com.phoenix.math.Calculator;

public class CalculatorServices {
	private Calculator calculator;

	public CalculatorServices() {
		super();
	}

	public CalculatorServices(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	// business logic method
	public int addition(int x, int y) {
		return calculator.add(x, y);
	}
}
