import java.util.List;

public class Holiday {

    private String name;
    private int day;
    private String month;


    Holiday(String name, int day , String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    boolean inSameMonth(Holiday first , Holiday second){

        return first.month.equalsIgnoreCase(second.month);
    }

    double avgDate(List<Holiday> array){

        double sum  = 0;
        int count = array.size();

        for (Holiday holiday : array) {

            sum += holiday.day;
        }

        return sum / count;
    }
}
