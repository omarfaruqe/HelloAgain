public class HelloWorld {
    private int roll;
    private String name;
    private boolean passed;
    public HelloWorld(){ /* Constructor */
        roll = 100;
        name = "CSE";
        passed = true;
    }
    public HelloWorld(int roll, String name, boolean passed){ /* Constructor */
        this.roll = roll;
        this.name = name;
        this.passed = passed;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public int getRoll() {
        return roll;
    }

    public boolean isPassed() {
        return passed;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        HelloWorld helloWorld2 = new HelloWorld(300,"SHU", true);
        helloWorld.setName("ICE");
        helloWorld.setRoll(400);
        helloWorld.setPassed(false);
        System.out.println(helloWorld2.getName());
        System.out.println(helloWorld.getRoll());
        System.out.println(helloWorld2.isPassed());
    }
}