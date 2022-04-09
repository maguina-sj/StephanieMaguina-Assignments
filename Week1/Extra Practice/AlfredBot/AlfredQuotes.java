import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Welcome %s, I am Alfred.", name);
    }
    public String guestGreeting(String name, String date) {
        Date newdate = new Date();
        return String.format("Welcome %s, the current date is %s", name, newdate);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "The current date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {  
            return "Alexis can't help you, she's too faded from earlier. What can I help you with?";
        }
        if (conversation.indexOf("Alfred") > -1) {
            return "Ready to be of assistance!";
        }
        return "Ok, my work here is done";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

