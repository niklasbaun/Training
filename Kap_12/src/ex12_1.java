import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ex12_1 {

    /**
     * method to read a file and put it into a Stream
     * @param path the path to the file
     * @return a Stream of the file
     * @throws IOException if sth went wrong
     */
    public static Stream<String> words(String path) throws FileNotFoundException {
        //check if file exists
        if(!Files.exists(Paths.get(path))){
            throw new FileNotFoundException("File does not exist");
        }
        //read file with BufferedReader
        BufferedReader reader = new BufferedReader(new FileReader(path));
        //remove all punctuation
        Stream<String> read = reader.lines().map(line -> line.replaceAll("[^a-zA-Z ]", ""));
        //return Stream of the file in words
        return read.flatMap(line -> Stream.of(line.split("\\s+")));
    }


    /**
     * method to count how many times each word appears in a Stream
     * @param words thge input stream
     * @return a Map with the words and their count
     */
    static Map<String, Integer> countWords(Stream<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();
        //count the words
        words.forEach(word -> {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        });
        return wordCount;
    }

    /**
     * method to write the counted words to a file
     * @param countedWords the counted words in a map like method above
     * @param filepath the path to put the file
     */
    public static void writeCountedWords(Map<String, Integer> countedWords, String filepath) throws IOException {
        //create Writer
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
            //write the words and their count to the file
            countedWords.forEach((word, count) -> {
                try {
                    writer.write(word + " : " + count + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            //close the writer
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
