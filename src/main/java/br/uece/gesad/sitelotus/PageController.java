package br.uece.gesad.sitelotus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class PageController {
	@RequestMapping("")
	public String index() {
		return "index";
	}
}
