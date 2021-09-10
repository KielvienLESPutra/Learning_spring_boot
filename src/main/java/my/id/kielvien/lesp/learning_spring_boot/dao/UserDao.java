package my.id.kielvien.lesp.learning_spring_boot.dao;

import java.util.List;
import java.util.UUID;

import my.id.kielvien.lesp.learning_spring_boot.models.UserModel;

public interface UserDao {
	public boolean addUser(UserModel user);
	public List<UserModel> showUser();
	public boolean updateUser(UUID id, UserModel userUpdate);
	public boolean deleteUser(UUID id);
	public UserModel searchUser(UUID id);
}