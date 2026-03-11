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
        for(String j : jokes)
        {
            System.out.println("Joke: " + j);
        }

        for(JokerText jt : jokerText)
        {
            jt.displayJokerText();
        }
    }
}