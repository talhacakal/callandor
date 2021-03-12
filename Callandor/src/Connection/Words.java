package Connection;

public class Words {
    private int id;
    private String english;
    private String turkish;
    private int forgotten;
    private String date;
    private String forgotten_date;

    public Words(int id, String english, String turkish, int forgotten, String date) {
        this.id = id;
        this.english = english;
        this.turkish = turkish;
        this.forgotten = forgotten;
        this.date = date;
    }
    public Words(int id, String english, String turkish, String date) {
        this.id = id;
        this.english = english;
        this.turkish = turkish;
        this.date = date;
    }
    
    public Words(String english, String turkish, int forgotten, String date, String forgotten_date) {
        this.english = english;
        this.turkish = turkish;
        this.forgotten = forgotten;
        this.date = date;
        this.forgotten_date = forgotten_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getTurkish() {
        return turkish;
    }

    public void setTurkish(String turkish) {
        this.turkish = turkish;
    }

    public int getForgotten() {
        return forgotten;
    }

    public void setForgotten(int forgotten) {
        this.forgotten = forgotten;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getForgotten_date(){
        return forgotten_date;
    }
    
    public void setForgotten_date(String forgotten_date){
        this.forgotten_date = forgotten_date;
    }
    
}