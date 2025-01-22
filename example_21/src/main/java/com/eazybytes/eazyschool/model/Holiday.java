package com.eazybytes.eazyschool.model;

import lombok.Data;

@Data
public class Holiday {

    public Holiday(String string, String string2, Type festival) {
		// TODO Auto-generated constructor stub
	}

	private final String day;
    private final String reason;
    private final Type type;

    public enum Type {
        FESTIVAL, FEDERAL
    }
}
