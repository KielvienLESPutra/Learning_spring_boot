package my.id.kielvien.lesp.learning_spring_boot.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import my.id.kielvien.lesp.learning_spring_boot.models.UserModel;

@Repository("memory_database")
public class UserAccessService implements UserDao{
	
	Logger logger = LoggerFactory.getLogger(UserAccessService.class);
	private List<UserModel> users = new ArrayList<UserModel>();
	
	private UserModel searchUserFromList(UUID id) {
		UserModel userFind = null;
		for(UserModel user : users) {
			if(user.getId().equals(id)) {
				continue;
			}else {
				userFind = user;
				break;
			}
		}
		return userFind; 
	}
	
	@Override
	public boolean addUser(UserModel user) {
		// TODO Auto-generated method stub
		logger.info("Start adding user to database with data : {}", user.toString());
		boolean result = false;
		try {
			users.add(user);
			result = true;
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("Error exception adding user : " + user.toString(), e);
		}
		return result;
	}

	@Override
	public boolean updateUser(UUID id, UserModel userUpdate) {
		// TODO Auto-generated method stub
		boolean result = false;
		try { 
			UserModel userFind = searchUserFromList(id);
			if(null != userFind) {
				userFind.setAddress(userUpdate.getAddress());
				userFind.setEmail(userUpdate.getEmail());
				userFind.setName(userUpdate.getName());
				userFind.setTelp(userUpdate.getTelp());
				result = true;
			}
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("Error exception update user : " + id, e);
		}
		return result;
	}

	@Override
	public List<UserModel> showUser() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public boolean deleteUser(UUID id) {
		// TODO Auto-generated method stub
		boolean result = false;
		try {
			UserModel userFind = searchUser(id);
			if(null != userFind) {
				users.remove(userFind);
				result = true;
			}
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("Error exception delete user : " + id, e);
		}
		return result;
	}

	@Override
	public UserModel searchUser(UUID id) {
		// TODO Auto-generated method stub
		UserModel userFind = searchUser(id);
		return userFind;
	}
}
