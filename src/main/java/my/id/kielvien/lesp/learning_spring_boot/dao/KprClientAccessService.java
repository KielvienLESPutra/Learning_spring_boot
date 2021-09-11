package my.id.kielvien.lesp.learning_spring_boot.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import my.id.kielvien.lesp.learning_spring_boot.models.KprClientModel;

@Repository("memory_database_kpr")
public class KprClientAccessService implements KprClientDao{
	
	Logger logger = LoggerFactory.getLogger(KprClientAccessService.class);
	private List<KprClientModel> kprClients = new ArrayList<KprClientModel>();
	
	private KprClientModel searchKprFromList(UUID id) {
		KprClientModel kprFind = null;
		for(KprClientModel kpr : kprClients) {
			if(!kpr.getId().equals(id)) {
				continue;
			}else {
				kprFind = kpr;
				break;
			}
		}
		return kprFind; 
	}
	
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
			logger.error("Error exception adding kpr : " + kpr.toString(), e);
		}
		return result;
	}

	@Override
	public boolean updateKprClient(UUID id, KprClientModel kpr) {
		// TODO Auto-generated method stub
		boolean result = false;
		try { 
			KprClientModel kprFind = searchKprFromList(id);
			if(null != kprFind) {
				kprFind.setIdClient(kpr.getIdClient());
				kprFind.setDp(kpr.getDp());
				kprFind.setInstalment(kpr.getInstalment());
				kprFind.setLoanInterest(kpr.getLoanInterest());
				kprFind.setTotal(kpr.getTotal());
				result = true;
			}
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("Error exception update kpr : " + id, e);
		}
		return result;
	}

	@Override
	public List<KprClientModel> showKprClient() {
		// TODO Auto-generated method stub
		return kprClients;
	}

	@Override
	public boolean deleteKprClient(UUID id) {
		// TODO Auto-generated method stub
		boolean result = false;
		try {
			KprClientModel kprFind = searchKprFromList(id);
			if(null != kprFind) {
				kprClients.remove(kprFind);
				result = true;
			}
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("Error exception delete kpr : " + id, e);
		}
		return result;
	}

	@Override
	public KprClientModel searchKprClient(UUID id) {
		// TODO Auto-generated method stub
		logger.info("Start search kpr with id : {}", id);
		KprClientModel kprFind = searchKprFromList(id);
		return kprFind;
	}
}
