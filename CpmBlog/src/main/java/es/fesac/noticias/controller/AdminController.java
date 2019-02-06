package es.fesac.noticias.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.fesac.noticias.dao.IUserRepository;
import es.fesac.noticias.model.User;
import es.fesac.noticias.model.bean.LoginBean;


@Controller
public class AdminController {
	
	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private HttpSession httpSession;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("userLogin", new LoginBean());
		return "Index";
	}
	
	@PostMapping("/login")
	public String validarLogin(@ModelAttribute("userLogin") LoginBean login, Model model) {
		User u= userRepository.getByEmailAndPassword(login.getEmail(), login.getPassword());
		if(u!= null) {
			httpSession.setAttribute("userLoggedIn", u);
			return "redirect:/post";
		}
		else{
			login.setPassword("");
			model.addAttribute("userLogin",login);
			model.addAttribute("error","Error al validar");
			return "login";
		}
					
	}
}
