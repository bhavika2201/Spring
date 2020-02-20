package com.log;

public class DbLogger implements Log {

	private Format format;
	
	public DbLogger(Format format) {
		super();
		this.format = format;
	}

	@Override
	public void log() {
		format.format();
		System.out.println("dblogger");
	}

}
