
class DeleterThread extends Thread  {

    private Memory memory;
    DeleterThread(Memory m){
        this.memory = m;
    }
    @Override
    public void run() {
        while (memory.counter >= 0){
            try {
                this.join(5000);
                Memory.Data data = memory.getMin();
                if (data != null) {
                    System.out.println("Program deleted record with \"" +
                            data.string + "\" value.");
                    memory.deleteRecord(data.index);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
