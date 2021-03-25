package com.Trimble.EMS.ApiImplementation;


import com.Trimble.EMS.RepositoryInterface.TokenRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Trimble.EMS.Repository.*;
import com.Trimble.EMS.Token.*;


@Service
public class TokenApiImpl{
	@Autowired
	public TokenRepositoryInterface tokenRepository;

	public String getToken() {
		return tokenRepository.getToken();
	}

}
