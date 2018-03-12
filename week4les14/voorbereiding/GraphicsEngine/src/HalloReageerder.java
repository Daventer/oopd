public class HalloReageerder implements IReageerder {

    protected String test;

    public HalloReageerder(String test){
        this.test = test;
    }

    @Override
    public void doeActie(){
        System.out.println(this.test);
    }
}
