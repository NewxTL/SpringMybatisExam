package com.hand;

import java.sql.SQLException;

import org.mybatis.spring.support.SqlSessionDaoSupport;




public class FilmDaoSp extends SqlSessionDaoSupport implements IDDao {
	
	public EntityWithID getByID(long ID) throws SQLException {
		return this.getSqlSession().selectOne("getByID_Film",ID);
	}

	public void delByID(long ID) throws SQLException {
		this.getSqlSession().delete("delByID_Film", ID);
	}
	
	public int getCountById(long ID) throws SQLException{
		return this.getSqlSession().selectOne("getCountById_Film",ID);
	}
	
	public void AddIdEntity(EntityWithID entity) throws SQLException {
		this.getSqlSession().insert("AddIdEntity_Film", entity);

	}
}
