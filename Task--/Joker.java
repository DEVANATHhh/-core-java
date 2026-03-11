class Joker
{
    String[] jokes;
    JokerText[] jokerText;

    Joker(String[] jokes, JokerText[] jokerText)
    {
        this.jokes = jokes;
        this.jokerText = jokerText;
    }

    void displayJoker()
    {
       

        if(this.jokes != null)
        {
          

            for(String j : jokes)
            {
                System.out.println("Joke: " + j);
            }
        }

        if(this.jokerText != null)
        {
           

            for(JokerText jt : jokerText)
            {
                if(jt != null)
                {
                    jt.displayJokerText();
                }
            }
        }
    }
}