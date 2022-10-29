public class StrategyGame extends ComputerGame{
    private String era;

    public void setEra(String era){
        this.era = era;
    }
    public String getEra(){
        return era;
    }
    public void result(int conquer_procent){
        if (conquer_procent == 100)
            System.out.println("Urah, you won that game");
        else
            System.out.println("you lost");
    }
    @Override
    public void play(){
        System.out.println("Lets take a look at the map");
    }
}
