class Scanner
{
    String[] models;
    ScannerText[] scannerText;

    Scanner(String[] models, ScannerText[] scannerText)
    {
        this.models = models;
        this.scannerText = scannerText;
    }

    void displayScanner()
    {
        for(String m : models)
        {
            System.out.println("Model: " + m);
        }

        for(ScannerText st : scannerText)
        {
            st.displayScannerText();
        }
    }
}