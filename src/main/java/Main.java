public class Main {
    public static void main(String[] args){

        boolean validSelection = false;
        do {
            try {
                String[] quotes = {
                        "Talk is cheap. Show me the code. - Linus Torvalds",
                        "The only way to do great work is to love what you do. - Steve Jobs",
                        "Imagination is more important than knowledge. - Albert Einstein",
                        "Any sufficiently advanced technology is indistinguishable from magic. - Arthur C. Clarke",
                        "The best way to predict the future is to invent it. - Alan Kay",
                        "Premature optimization is the root of all evil. - Donald Knuth",
                        "Knowledge is power. - Francis Bacon",
                        "The journey of a thousand miles begins with a single step. - Lao Tzu",
                        "I think, therefore I am. - Rene Descartes",
                        "Programs must be written for people to read, and only incidentally for machines to execute. - Harold Abelson and Gerald Jay Sussman"
                };

                int selection = Console.displayQuote();

                if (selection >= 1 && selection <= quotes.length) {
                    System.out.println(quotes[selection - 1]);
                    validSelection = true;
                } else {
                    System.out.println("Invalid option please try again");
                }


            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }while(!validSelection);
    }

}
