package my.id.kielvien.lesp.learning_spring_boot.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import my.id.kielvien.lesp.learning_spring_boot.models.KprClientModel;

@Repository("memory_database_kpr")
public class KprClientAccessService implements KprClientDao{
	
	Logger logger = LoggerFactory.getLogger(KprClientAccessService.class);
	private List<KprClientModel> kprClients = new ArrayList<KprClientModel>();
	
	@Override
	public boolean addKprClient(KprClientModel kpr) {
		// TODO Auto-generated method stub
		logger.info("Start adding kpr client to database with data : {}", kpr.toString());
		boolean result = false;
		try {
			kprClients.add(kpr);
			result = true;
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("Error exception adding user : " + kpr.toString(), e);
		}
		return result;
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
