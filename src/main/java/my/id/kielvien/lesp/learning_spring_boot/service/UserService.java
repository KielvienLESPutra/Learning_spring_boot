package my.id.kielvien.lesp.learning_spring_boot.service;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jdk.internal.org.jline.utils.Log;
import my.id.kielvien.lesp.learning_spring_boot.dao.UserAccessService;
import my.id.kielvien.lesp.learning_spring_boot.models.UserModel;

@Service
public class UserService {
	private UserAccessService userAccess;
	
	@Autowired
	public UserService(@Qualifier("memory_database_user") UserAccessService userAccess) {
		this.userAccess = userAccess;
	}
	
	public void addUser(UserModel user) {
		userAccess.addUser(user);
	}
	
	public boolean updateUser(UUID id, UserModel user) {
		return userAccess.updateUser(id, user);
	}
	
	public boolean deleteUser(UUID id) {
		return userAccess.deleteUser(id);
	}
	
	public UserModel searchUser(UUID id) {
		return userAccess.searchUser(id);
	}
	
	public List<UserModel> getAllUser(){
		return userAccess.showUser();
	}
}
