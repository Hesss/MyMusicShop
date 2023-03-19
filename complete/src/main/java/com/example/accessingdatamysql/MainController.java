package com.example.accessingdatamysql;

import com.example.accessingdatamysql.domain.Client;
import com.example.accessingdatamysql.domain.Message;
import com.example.accessingdatamysql.domain.Sales;
import com.example.accessingdatamysql.repos.ClientRepo;
import com.example.accessingdatamysql.repos.MessageRepo;
import com.example.accessingdatamysql.repos.SalesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
	@Autowired
	private MessageRepo messageRepo;
	@Autowired
	private ClientRepo clientRepo;
	@Autowired
	private SalesRepo salesRepo;


//	@GetMapping("/test")
//	public String test(
//			@RequestParam(name="name", required=false, defaultValue="World") String name,
//			Map<String, Object> model
//	) {
//		model.put("name", name);
//		return "test";
//	}

	@GetMapping("/")
	public String main(Map<String, Object> model) {
		Iterable<Message> messages = messageRepo.findAll();

		model.put("messages", messages);

		return "main";
	}


	@PostMapping("/")
	public String add(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
		Message message = new Message(text, tag);

		messageRepo.save(message);

		Iterable<Message> messages = messageRepo.findAll();

		model.put("messages", messages);

		return "main";
	}

	@PostMapping("filter")
	public String filter(@RequestParam String filter, Map<String, Object> model) {
		Iterable<Message> messages;

		if (filter != null && !filter.isEmpty()) {
			messages = messageRepo.findByTag(filter);
		} else {
			messages = messageRepo.findAll();
		}

		model.put("messages", messages);

		return "main";
	}

	@GetMapping("do1")
	public String do1(Map<String, Object> model) {
		Iterable<Client> clients = clientRepo.findAll();

		model.put("clients", clients);

		return "do1";
	}

	@PostMapping("do1")
	public String addClient(@RequestParam String surname, @RequestParam String name, @RequestParam String patronymic,
							@RequestParam String phone, @RequestParam String email, @RequestParam String login,
							@RequestParam String password, Map<String, Object> model) {
		Client client = new Client(surname, name, patronymic, phone, email, login, password);

		clientRepo.save(client);

		Iterable<Client> clients = clientRepo.findAll();

		model.put("clients", clients);

		return "do1";
	}

	@GetMapping("do2")
	public String do2(Map<String, Object> model) {
		Iterable<Sales> sales = salesRepo.findAll();

		model.put("sales", sales);

		return "do2";
	}

	@PostMapping("do2")
	public String addSale(@RequestParam Integer id_client, @RequestParam Integer id_seller, @RequestParam Integer id_musical_instrument,
						  @RequestParam String datesales, Map<String, Object> model) {
		Sales sale = new Sales(id_client, id_seller, id_musical_instrument, datesales);

		salesRepo.save(sale);

		Iterable<Sales> sales = salesRepo.findAll();

		model.put("sales", sales);

		return "do2";
	}

}
