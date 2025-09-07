package com.hardika;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String ACCOUNT_SID = "ACec71940514695ed4863c1382d8cb16e8";
        String AUTH_TOKEN = "f6b1ffd6f185c7862441e4b888bee8bf";        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        // Send SMS
        Message message = Message.creator(
                new PhoneNumber("+919157949949"),  // To (your number)
                new PhoneNumber("MGf40e1bdfed707f77a5a62f7038cf5df5"),   // From (your Twilio number)
                "Hello from my IntelliJ Twilio Java App!"
        ).create();

        System.out.println("✅ Message sent with SID: " + message.getSid());

    }
}