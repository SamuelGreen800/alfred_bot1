import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        
        return "Hello, lovely to see you, " + name;
    }

    public String guestGreeting(String name, String daypPeriod) {
        return "Good " + daypPeriod +", " + name;

    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "The current time is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1){
            return "Right away sir. She's not sophisticated enough for that";
        }

        if(conversation.indexOf("Alfred") > -1){
            return "How may I be of assistance?";
        }
        
        if(conversation.indexOf("Bruce") > -1){
            return "How may I be of service, master Wayne?";
        }

        else
            return "In that case, I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

