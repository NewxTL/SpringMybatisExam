package com.hand;

import java.io.Serializable;

public abstract class EntityWithID implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected long ID;

	public abstract void setID(long ID);

	public abstract long getID();
}
