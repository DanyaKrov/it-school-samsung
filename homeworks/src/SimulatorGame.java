public class SimulatorGame extends ComputerGame {
    private String proffesion;

    public void setProffesion(String proffesion){
        this.proffesion = proffesion;
    }
    public String getProffesion(){
        return proffesion;
    }
    @Override
    public void play() {
        System.out.println("Lets try new profession");
    }
}
