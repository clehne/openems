package io.openems.edge.ess.refu88k;

import io.openems.edge.common.channel.doc.OptionsEnum;

public enum VendorOperatingState implements OptionsEnum {
	UNDEFINED (-1, "Undefinded")	
	;

	private final int value;
	private final String name;

	private VendorOperatingState(int value, String name) {
		this.value = value;
		this.name = name;
	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public OptionsEnum getUndefined() {
		return UNDEFINED;
	}

}