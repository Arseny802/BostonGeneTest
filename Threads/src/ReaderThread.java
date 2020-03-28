import java.util.Scanner;

public class ReaderThread extends Thread {

    private Memory memory;
    ReaderThread(Memory m){
        this.memory = m;
    }
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String inputString = scanner.nextLine();
            if (inputString.equals("stop")) break;
            Translator translator = new Translator(inputString);
            int value = translator.translate();
            if (value == 0) System.out.println("Incorrect input!");
            else memory.setRecord(inputString, value);
        }
        memory.deleteAll();
    }
}
