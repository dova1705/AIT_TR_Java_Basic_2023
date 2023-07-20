package practice_23.sentence_test;

public class Sentence {

    //поля класса
    private String sentence;

    //конструктор
    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    //сеттеры и геттеры

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }


    //методы класса


    //метод 1 количество слов
    public int wordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        int qWords = words.length;
        System.out.println("There are " + qWords + "  words in the sentence.");
        return qWords;
    }

    //метод 2 количество букв

    public int lettersInSentence (String sentence){
        String[] letters = sentence.replaceAll("[^а-яА-Яa-zA-Z0-9]", "").split("");
        System.out.println("There are " + letters.length + "  letters in the sentence.");
        return letters.length;
    }










}
/*



            int qSymbols = symbols.length;
            System.out.println("There are " + qSymbols + " symbols in the sentence.");
            int countOfLetters = 0;
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words[i].length(); j++) {
                    char с = words[i].charAt(j);
                    if ( с == ',' || с == '.' || с == '-' || с == '!' || с == '?' || с == '“'){
                        continue;
                    }
                    countOfLetters++;
                }
            }
            System.out.println("There are " + countOfLetters + " letters in the sentence.");



            sandor

            public int lettersInSentence(String sentence){
        int count = 0;
        for (char c : sentence.toCharArray()){  //пробегаем по всем символам в предложении
            if (Character.isLetter(c)){
                count++;
            }
        }
        return count;
    }
 */
