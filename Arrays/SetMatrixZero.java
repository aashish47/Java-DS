package Arrays;
import java.util.ArrayList;

public class SetMatrixZero {
    public static void set(ArrayList<ArrayList<Integer>> a){
        if(a.size() == 0){
            return;
        }
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> column = new ArrayList<>();
        for(int i = 0; i < a.size(); i++){
            row.add(1);
        }
        for(int i = 0; i < a.get(0).size(); i++){
            column.add(1);
        }

        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j < a.get(i).size(); j++){
                if(a.get(i).get(j) == 0){
                    row.set(i, 0);
                    column.set(j, 0);
                }
            }
        }

        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j < a.get(i).size(); j++){
                if(row.get(i) == 0 || column.get(j) == 0){
                    a.get(i).set(j,0);
                }
            }
        }
    }
}
