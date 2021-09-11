package my.id.kielvien.lesp.learning_spring_boot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.id.kielvien.lesp.learning_spring_boot.service.KprClientService;

@RequestMapping(value= "/kpr")
@RestController
public class KprClientController {
	private KprClientService kprClientService;
	
	@Autowired
	public KprClientController(KprClientService kprClientService) {
		this.kprClientService = kprClientService;
	}
}
