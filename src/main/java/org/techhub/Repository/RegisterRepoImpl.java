package org.techhub.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.techhub.model.Register;
@Repository("regRepo")
public class RegisterRepoImpl implements RegisterRepo  {
    @Autowired
    JdbcTemplate jdbcTemplate;
	@Override
	public boolean isRegister(Register register) {
	int value=jdbcTemplate.update("insert into mvcregister values('0',?,?,?)",
			new Object[] {register.getName(),register.getEmail(),register.getContact()});
	
		return value>0?true:false;
	}

}
