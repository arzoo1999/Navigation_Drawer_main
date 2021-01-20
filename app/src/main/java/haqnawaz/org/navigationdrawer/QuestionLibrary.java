package haqnawaz.org.navigationdrawer;
public class QuestionLibrary {

    public static String[] mQuestions = {
            "Jenny ___________ tired",
            " Today is Wednesday. Yesterday it ___________ Tuesday.",
            "It's Thursday today. Tomorrow it ___________ Friday",

            "___________ lots of animals in the zoo",
            "How many people ___________ in your family?",
            " Where ___________ Sarah live?",

            " ___________ to London on the train yesterday?",
            " Jack ___________ English, Spanish and a bit of French.",
            "Babies ..... when they are hungry",

            "How many students in your class ..... from Korea?"


    };

    public String mChoices [][] = {
            {"be", "is", "has","have"},
            {"were", "is", "be","was"},  {"be", "was", "will be","will"},  {"There", "There is", "There are","There aren't"},  {"are there", "is there", "there are","there"},
            {"are", "is", "do","does"},  {"Did Mary went", "Did Mary go", "Mary go","Mary goes"},  {"speaks", "speak", "speaking","is speaking"},  {"cries", "cry", "cried","are crying"},
            {"comes", "come", "came","are coming"}
    };

    public String mCorrectAnswers[] = {"is", "was", "will be", "There are","are there","does","Did Mary go","speaks","cry","are coming"};



    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }









}
