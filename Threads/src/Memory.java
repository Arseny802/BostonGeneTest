import java.util.ArrayList;

class Memory {

    class Data {
        String string = null;
        int value = 0;
        short index;
        Data(String str, int val, short i){
            this.string = str;
            this.value = val;
            this.index = i;
        }
    }

    private ArrayList<Data> memory = new ArrayList<>();
    short counter = 0;

    void setRecord(String str, int val){
        memory.add(new Data(str, val, counter));
        ++counter;
    }

    void deleteRecord(short index) {
        memory.remove(index);
        for (int i=index; i<counter-1; ++i){
            memory.get(i).index--;
        }
        counter--;
    }

    void deleteAll() {
        for (short i=counter; i>0; --i) {
            deleteRecord(i);
        }
        counter--;
    }

    Data getMin() {
        if (counter <= 0) return null;
        int minimum = 10000;
        short index = 0;
        for (short i=0; i<counter; ++i) {
            Data buf = memory.get(i);
            if (buf.value < minimum) {
                index = i;
                minimum = buf.value;
            }
        }
        return memory.get(index);
    }
}
