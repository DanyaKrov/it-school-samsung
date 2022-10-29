public class ComputerGame {
    private String name;
    private String studio;
    private Boolean multiplayer;
    private String year;

    public void setStudio(String studio) {
        this.studio = studio;
    }
    public String getStudio() {
        return studio;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMultiplayer(Boolean multiplayer) {
        this.multiplayer = multiplayer;
    }
    public Boolean getMultiplayer() {
        return multiplayer;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getYear() {
        return year;
    }
    public void play(){
        System.out.println("Lets take a look at the game");
    }
}
