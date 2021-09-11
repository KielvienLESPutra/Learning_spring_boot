package my.id.kielvien.lesp.learning_spring_boot.dao;

import java.util.List;
import java.util.UUID;

import my.id.kielvien.lesp.learning_spring_boot.models.KprClientModel;

public interface KprClientDao {
	public boolean addKprClient(KprClientModel user);
	public boolean updateKprClient();
	public List<KprClientModel> showKprClient();
	public boolean deleteKprClient();
	public KprClientModel searchKprClient(UUID id);
}
