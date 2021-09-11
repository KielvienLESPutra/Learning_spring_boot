package my.id.kielvien.lesp.learning_spring_boot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import my.id.kielvien.lesp.learning_spring_boot.models.KprClientModel;
import my.id.kielvien.lesp.learning_spring_boot.models.UserModel;

@Repository("memory_database_kpr")
public class KprClientAccessService implements KprClientDao{
	@Override
	public boolean addKprClient(KprClientModel user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateKprClient() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<KprClientModel> showKprClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteKprClient() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserModel searchKprClient() {
		// TODO Auto-generated method stub
		return null;
	}
}
