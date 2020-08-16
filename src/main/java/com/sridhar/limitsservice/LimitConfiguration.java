package com.sridhar.limitsservice;

public class LimitConfiguration {
	private int minumum;
	private int maximum;
	
	public LimitConfiguration(int minumum, int maximum) {
		super();
		this.minumum = minumum;
		this.maximum = maximum;
	}

	public int getMinumum() {
		return minumum;
	}

	public void setMinumum(int minumum) {
		this.minumum = minumum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
}
