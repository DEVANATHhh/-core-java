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
     

        if(this.models != null)
        {
            

            for(String m : models)
            {
                System.out.println("Model: " + m);
            }
        }

        if(this.scannerText != null)
        {
           
            for(ScannerText st : scannerText)
            {
                if(st != null)
                {
                    st.displayScannerText();
                }
            }
        }
    }
}