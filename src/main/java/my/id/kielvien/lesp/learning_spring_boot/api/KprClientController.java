package my.id.kielvien.lesp.learning_spring_boot.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.id.kielvien.lesp.learning_spring_boot.models.KprClientModel;
import my.id.kielvien.lesp.learning_spring_boot.service.KprClientService;

@RequestMapping(value= "/kpr")
@RestController
public class KprClientController {
	private KprClientService kprClientService;
	
	@Autowired
	public KprClientController(KprClientService kprClientService) {
		this.kprClientService = kprClientService;
	}
	
	@PostMapping
	public void postAddUser(@RequestBody KprClientModel kpr) {
		kprClientService.addKprClient(kpr);
	}

	@PutMapping(path = "{id}")
	public void updateUser(@PathVariable("id") UUID id,@RequestBody KprClientModel kpr) {
		kprClientService.updateKprClient(id, kpr);
	}
	
	@DeleteMapping(path = "{id}")
	public void deleteUser(@PathVariable("id") UUID id) {
		kprClientService.deleteKprClient(id);
	}

	@GetMapping(path = "{id}")
	public KprClientModel searchUser(@PathVariable("id") UUID id) {
		return kprClientService.searchKprClient(id);
	}
	
	@GetMapping
	public List<KprClientModel> getAllUser() {
		return kprClientService.getAllKprClient();
	}
}
