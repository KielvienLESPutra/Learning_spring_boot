package my.id.kielvien.lesp.learning_spring_boot.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import my.id.kielvien.lesp.learning_spring_boot.dao.KprClientAccessService;
import my.id.kielvien.lesp.learning_spring_boot.models.KprClientModel;

public class KprClientService {
	private KprClientAccessService kprAccess;
	
	@Autowired
	public KprClientService(@Qualifier("memory_database_kpr") KprClientAccessService kprAccess) {
		this.kprAccess = kprAccess;
	}
	
	public void addUser(KprClientModel kpr) {
		kprAccess.addKprClient(kpr);
	}
	
	public boolean updateUser(UUID id, KprClientModel kpr) {
		return kprAccess.updateKprClient(id, kpr);
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
