package com.hand;

import java.sql.SQLException;



public interface CanAddToDb {
	public void AddIdEntity(EntityWithID entity) throws SQLException;
	public void delByID(long ID) throws SQLException;
	public Film getLastFilm() throws SQLException;
}
