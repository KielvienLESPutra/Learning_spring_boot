package my.id.kielvien.lesp.learning_spring_boot.dao;

import java.util.List;
import java.util.UUID;

import my.id.kielvien.lesp.learning_spring_boot.models.KprClientModel;

public interface KprClientDao {
	public boolean addKprClient(KprClientModel user);
	public List<KprClientModel> showKprClient();
	public KprClientModel searchKprClient(UUID id);
	public boolean deleteKprClient(UUID id);
	public boolean updateKprClient(UUID id, KprClientModel kpr);
}
