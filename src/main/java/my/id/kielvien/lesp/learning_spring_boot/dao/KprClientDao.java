package my.id.kielvien.lesp.learning_spring_boot.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import my.id.kielvien.lesp.learning_spring_boot.models.KprClientModel;

@Repository
public interface KprClientDao {
	public boolean addKprClient(KprClientModel user);
	public List<KprClientModel> showKprClient();
	public KprClientModel searchKprClient(UUID id);
	public boolean deleteKprClient(UUID id);
	public boolean updateKprClient(UUID id, KprClientModel kpr);
}
