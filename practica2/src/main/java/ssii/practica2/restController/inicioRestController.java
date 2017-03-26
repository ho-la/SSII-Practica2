package ssii.practica2.restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class inicioRestController {
	
	@RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "index";
    }
	// Add one attribute
	// The return value of the method is added to the model under the name "account"
	// You can customize the name via @ModelAttribute("myAccount")

	/*
	@ModelAttribute
	public Account addAccount(@RequestParam String number) {
	    return accountManager.findAccount(number);
	}
	*/
}

