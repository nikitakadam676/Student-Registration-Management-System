package org.techhub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.Repository.RegisterRepo;
import org.techhub.model.Register;
@Service("regService")
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    RegisterRepo regRepo;
	@Override
	public boolean isRegister(Register register) {
		// TODO Auto-generated method stub
		return regRepo.isRegister(register);
	}

}
