import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("Elif");
        name.add("Rana");
        name.add("Aslı");

        System.out.println("ArrayList: " + name);

        String arr[] = new String[name.size()];

        //toArray öğesinin içindeki öğeleri ArrayList yeni bir Objet diziye koplayalar
        name.toArray(arr);
        System.out.print("Array: ");
        for(String item:arr){
            System.out.print(item + ", ");
        }

    }
}
