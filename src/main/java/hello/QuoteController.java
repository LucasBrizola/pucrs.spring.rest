package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class QuoteController {

	private static final Logger Log = LoggerFactory.getLogger(QuoteController.class);
	
	@Autowired
	private QuoteService qs;
	
	@GetMapping("/quotes")
	public String showQuote(Model model) {
		Quote quote = qs.getQuote();
		Log.info(quote.toString());
		model.addAttribute("q", quote);
		return "quoteDetails";
	}
}
