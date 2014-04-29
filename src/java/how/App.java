package how;

/**
 * Sistema de saudações.
 */
public class App {

	public static void main(String[] args) {
		String visitorName = args[0];

		GreetingsService service  = new GreetingsService();

		String output = service.welcome(visitorName);

		System.out.println(output);
	}

}
