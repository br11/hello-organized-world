package how.service;

import java.util.Calendar;

/**
 * Serviço de saudações.
 */
public class GreetingsService {

    public String welcome(String visitorName, formal) {
		int now = getHour();

		String message;
		if (now < 12) {
			message = Greetings.GOOD_MORNING.getMessage();
		} else if (now < 18) {
			message = Greetings.GOOD_AFTERNOON.getMessage();
		} else {
			message = Greetings.GOOD_NIGHT.getMessage();
		}

		String messageTemplate;
		if (formal) {
			messageTemplate = message + ", %s";
		} else {
			messageTemplate = message + ", Sr(a). %s";
		}

		return String.format(messageTemplate, visitorName);
	}

	private int getHour() {
		return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
	}
}
