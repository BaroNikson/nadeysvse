public class nilit {
    public static void main(String[] args){

    }
}


 abstract class Building {
    private String title;
    private String address;
    private int yearOfConstruction;
    private String architectName;
    private boolean culturalMonument;
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;

    }
}


class  Library extends Building {



}
class House{}
class PoliceDepartment{}
class University{}
class ShoppingCenter{}
class HighRiseBuilding{}