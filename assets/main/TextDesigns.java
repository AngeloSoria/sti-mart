package main;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class TextDesigns {
    // Method Overloading
    public String GetText(String request) {
        String text = null;
        if (request.equalsIgnoreCase("brand")) {
            text = "\t███████╗████████╗██╗      ███╗   ███╗ █████╗ ██████╗ ████████╗\n"
                    + "\t██╔════╝╚══██╔══╝██║      ████╗ ████║██╔══██╗██╔══██╗╚══██╔══╝\n"
                    + "\t███████╗   ██║   ██║█████╗██╔████╔██║███████║██████╔╝   ██║   \n"
                    + "\t╚════██║   ██║   ██║╚════╝██║╚██╔╝██║██╔══██║██╔══██╗   ██║   \n"
                    + "\t███████║   ██║   ██║      ██║ ╚═╝ ██║██║  ██║██║  ██║   ██║   \n"
                    + "\t╚══════╝   ╚═╝   ╚═╝      ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   \n"
                    + "\n\t\t\tCASHIER MACHINE v1";
        }
        return text;
    }

    // Method Overloading
    public String GetText(String request, int repeatCount) {
        String text = null;

        if (request.equalsIgnoreCase("hr")) {
            text = "───".repeat(repeatCount);
        }
        return text;
    }

    public void printReceipt(ArrayList<Object[]> MyCart, double totalPrice) {
        System.out.println("\n\n");
        System.out.println(this.GetText("hr", 14));
        System.out.println("\t\t[RECEIPT]");
        System.out.println((new SimpleDateFormat("MM/dd/yyyy").format(new Date()) + "\t\t\t"
                + new SimpleDateFormat("hh:mm a").format(Calendar.getInstance().getTime())));
        System.out.println("STI Building, Tirona Highway,");
        System.out.println("Bacoor City, 4102 Cavite");
        System.out.println("(046) 970-1544");
        System.out.println("@bacoor.sti.edu");
        System.out.println(this.GetText("hr", 14));
        for (int index = 0; index < MyCart.size(); index++) {
            int dashLength = 25;
            if (MyCart.get(index)[1].toString().length() <= 8) {
                dashLength = dashLength + (9 - MyCart.get(index)[1].toString().length());
            } else if (MyCart.get(index)[1].toString().length() > 9) {
                dashLength = dashLength - (dashLength - MyCart.get(index)[1].toString().length());
                // System.out.println("Dash length: " + dashLength);
            }
            System.out.println(MyCart.get(index)[1] + " " + "-".repeat(dashLength) + " " + MyCart.get(index)[2]);
        }
        System.out.println("Total Price: PHP" + totalPrice);
        System.out.println(this.GetText("hr", 14));
        System.out.println("   THANKS FOR SHOPPING WITH STI-MART!");
        System.out.println(this.GetText("hr", 14));
    }

    public String MakeTabs(int tabCount) {
        return "\t".repeat(tabCount);
    }

    public void ClearConsole() {
        try {
            String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error clearing console: " + ex.getMessage());
        }
    }
}