package my.id.kielvien.lesp.learning_spring_boot.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import my.id.kielvien.lesp.learning_spring_boot.dao.KprClientAccessService;
import my.id.kielvien.lesp.learning_spring_boot.models.KprClientModel;

public class KprClientService {
	private KprClientAccessService kprAccess;
	
	private KprClientModel calculateLoanInterestFlat(KprClientModel kpr) {
		if(0 <= kpr.getInstalment()) {
			double instalment = (kpr.getLoanInterest() * (kpr.getTotal() - kpr.getDp())) / 12;
			kpr.setInstalment(instalment);
		}
		return kpr;
	}
	
	@Autowired
	public KprClientService(@Qualifier("memory_database_kpr") KprClientAccessService kprAccess) {
		this.kprAccess = kprAccess;
	}
	
	public void addUser(KprClientModel kpr) {
		kprAccess.addKprClient(calculateLoanInterestFlat(kpr));
	}
	
	public boolean updateUser(UUID id, KprClientModel kpr) {
		return kprAccess.updateKprClient(id, calculateLoanInterestFlat(kpr));
	}
	
	public boolean deleteUser(UUID id) {
		return kprAccess.deleteKprClient(id);
	}
	
	public KprClientModel searchUser(UUID id) {
		return kprAccess.searchKprClient(id);
	}
	
	public List<KprClientModel> getAllUser(){
		return kprAccess.showKprClient();
	}
}
