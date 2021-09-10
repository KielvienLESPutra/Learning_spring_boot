package my.id.kielvien.lesp.learning_spring_boot.dao;

import java.util.List;

import my.id.kielvien.lesp.learning_spring_boot.models.KprClientModel;
import my.id.kielvien.lesp.learning_spring_boot.models.UserModel;

public interface KprClientDao {
	public boolean addKprClient(KprClientModel user);
	public boolean updateKprClient();
	public List<KprClientModel> showKprClient();
	public boolean deleteKprClient();
	public UserModel searchKprClient();
}
