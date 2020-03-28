public class Threads {

    public static void main(String[] args) {

        System.out.println("Program started. Enter some variable\n" +
                "from one to nine thousand nine hundred ninety nine\n" +
                "or print \"stop\" to stop the program.");
        Memory memory = new Memory();
        ReaderThread myReaderThread = new ReaderThread(memory);
        DeleterThread myDeleterThread = new DeleterThread(memory);

        myReaderThread.start();
        myDeleterThread.start();
    }
}
