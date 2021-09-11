package my.id.kielvien.lesp.learning_spring_boot.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import my.id.kielvien.lesp.learning_spring_boot.dao.KprClientAccessService;
import my.id.kielvien.lesp.learning_spring_boot.dao.UserAccessService;
import my.id.kielvien.lesp.learning_spring_boot.models.KprClientModel;

@Service
public class KprClientService {
	private KprClientAccessService kprAccess;
	private UserAccessService userAccess;
	
	private KprClientModel calculateLoanInterestFlat(KprClientModel kpr) {
		if(0 <= kpr.getInstalment()) {
			double instalment = ((kpr.getTotal() - kpr.getDp()) / 12) + ((kpr.getLoanInterest()/100) * (kpr.getTotal() - kpr.getDp())) / 12;
			kpr.setInstalment(instalment);
		}
		return kpr;
	}
	
	@Autowired
	public KprClientService(@Qualifier("memory_database_kpr") KprClientAccessService kprAccess, 
			@Qualifier("memory_database_user") UserAccessService userAccess) {
		this.kprAccess = kprAccess;
		this.userAccess = userAccess;
	}
	
	public boolean addKprClient(KprClientModel kpr) {
		boolean result = false;
		if(null != userAccess.searchUser(kpr.getIdClient())) {
			result = kprAccess.addKprClient(calculateLoanInterestFlat(kpr));
		}
		return result;
	}
	
	public boolean updateKprClient(UUID id, KprClientModel kpr) {
		boolean result = false;
		if(null != userAccess.searchUser(kpr.getIdClient())) {
			result = kprAccess.updateKprClient(id, calculateLoanInterestFlat(kpr));
		}
		return result;
	}
	
	public boolean deleteKprClient(UUID id) {
		return kprAccess.deleteKprClient(id);
	}
	
	public KprClientModel searchKprClient(UUID id) {
		return kprAccess.searchKprClient(id);
	}
	
	public List<KprClientModel> getAllKprClient(){
		return kprAccess.showKprClient();
	}
}
