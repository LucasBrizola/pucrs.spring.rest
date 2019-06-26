package hello;

import org.springframework.web.client.RestTemplate;

public class QuoteService {

	private RestTemplate restTemplate;

	public QuoteService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	public Quote getQuote() {
		String link = "https://gturnquist-quoters.cfapps.io/api/random";
		return restTemplate.getForObject(link, Quote.class);
	}

}
