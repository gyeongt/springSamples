package ssg.com.a.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssg.com.a.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Autowired
	SqlSession session;

	@Override
	public int idcheck(String id) {
		
		int count = session.selectOne("Member.idcheck", id);
		
		return count;
	}

	@Override
	public int addMember(MemberDto member) {
	
		int count = session.insert("Member.addMember", member);
		
		return count;
	}

	@Override
	public MemberDto login(MemberDto dto) {	
		
		return session.selectOne("Member.login", dto);
	}
	
	



	
	
	
	
	
}
