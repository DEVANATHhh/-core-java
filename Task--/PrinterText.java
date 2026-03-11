class PrinterText
//for banner
{
    String message;

    PrinterText(String message)
    {
        this.message = message;
    }

    void displayPrinterText()
    {
        System.out.println("Printer Text: " + this.message);
    }
}