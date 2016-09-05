package com.hand;

import java.sql.SQLException;



public interface IDDao {
	
	public EntityWithID getByID(long ID) throws SQLException;

	
	public void delByID(long ID) throws SQLException;
}
