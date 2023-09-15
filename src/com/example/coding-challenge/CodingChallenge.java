import java.time.LocalDateTime;

public class CodingChallenge {

    String message;
    

    // byte byteMessage;

    public CodingChallenge(String text) {
        message = text;
    }


    public String sendMessage() {
        
        LocalDateTime now = LocalDateTime.now();
        return message + " " + now; 

    }

    public String sendByteMessage() {
        
        LocalDateTime now = LocalDateTime.now();
        byte[] byteArrray = message.getBytes();
        return byteArrray + " " + now; 

    }






    
    public static void main(String[] args) throws Exception {

        // String text = "Hello World";
        // LocalDateTime now = LocalDateTime.now();
        
        CodingChallenge cc = new CodingChallenge("ceg World");
        System.out.println(cc.sendByteMessage());
        System.out.println(cc.sendMessage());

        
        
    }
}
