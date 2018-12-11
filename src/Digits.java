import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList = new ArrayList<>();

    public Digits(int num){
        String temp = ""+num;
        for(int i=0;i<temp.length();i++){
            digitList.add(Integer.parseInt(temp.substring(i,i+1)));
        }
    }

    public boolean isStrictlyIncreasing(){
        for(int i=1;i<digitList.size();i++){
            if(digitList.get(i)<=digitList.get(i-1)){
                return false;
            }
        }
        return true;
    }

    public String getDigitList(){
        String temp ="[";
        for(int i=0;i<digitList.size();i++){
            temp+=digitList.get(i) + ", ";
        }
        temp=temp.substring(0,temp.length()-2) + "]";
        return temp;
    }
}
