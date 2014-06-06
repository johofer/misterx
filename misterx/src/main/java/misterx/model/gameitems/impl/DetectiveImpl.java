package misterx.model.gameitems.impl;

import misterx.model.gameitems.Detective;
import misterx.model.gameitems.enums.DetectiveType;

public class DetectiveImpl extends AbstractCharacterImpl implements Detective {
	
	private static final long serialVersionUID = 8793276422928774055L;
	
	private DetectiveType type;
	
	public DetectiveImpl(DetectiveType type) {
		super();
		this.type = type;
	}

	@Override
	public DetectiveType getType() {
		return type;
	}

	@Override
	public String toString() {
		return type.toString() + "-Detective";
	}
}
