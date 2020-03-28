import java.util.ArrayList;

class Translator {

    private String string = null;
    private int integer = 0;
    private ArrayList<String> stringList = new ArrayList<>();
    private ArrayList<Integer> integerList = new ArrayList<>();

    Translator(String str){
        this.string = str;
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");
        stringList.add("six");
        stringList.add("seven");
        stringList.add("eight");
        stringList.add("nine");
        stringList.add("ten");
        stringList.add("eleven");
        stringList.add("twelve");
        stringList.add("thirteen");
        stringList.add("fourteen");
        stringList.add("fifteen");
        stringList.add("sixteen");
        stringList.add("seventeen");
        stringList.add("eighteen");
        stringList.add("nineteen");
        stringList.add("twenty");
        stringList.add("thirty");
        stringList.add("forty");
        stringList.add("fifty");
        stringList.add("sixty");
        stringList.add("seventy");
        stringList.add("eighty");
        stringList.add("ninety");
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);
        integerList.add(11);
        integerList.add(12);
        integerList.add(13);
        integerList.add(14);
        integerList.add(15);
        integerList.add(16);
        integerList.add(17);
        integerList.add(18);
        integerList.add(19);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);
        integerList.add(80);
        integerList.add(90);
    }
    int translate(){
        for (String val : string.split(" ")) {
            short bufferInt = 0;
            for (String num : stringList){
                if (num.equals(val)) {
                    bufferInt += integerList.get(stringList.indexOf(num));
                    integer += bufferInt;
                    break;
                }
            }
            if (bufferInt == 0) {
                switch (val) {
                    case "hundred":
                        integer *= 100;
                        break;
                    case "thousand":
                        integer *= 1000;
                        break;
                    default:
                        return 0;
                }
            }
        }
        return integer;
    }
}
