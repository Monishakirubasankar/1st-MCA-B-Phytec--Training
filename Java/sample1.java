 interface WhatsAppCalls
 {
      void mute();
      void call();
 }
 class AudioCall implements WhatsAppCalls {
 public void mute()
 {
    System.out.println("Audio call muted");
 }   
 public void call()
 {
    System.out.println("WhatsApp Audio call");
 }
 }
class sample1{
    public static void main(String[] args) {
        AudioCall a = new AudioCall();
        a.mute();
        a.call();
    }
}
