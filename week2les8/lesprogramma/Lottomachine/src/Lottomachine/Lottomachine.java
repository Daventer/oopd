package Lottomachine;

public class Lottomachine {
    public void voerTrekkingUit(){
        Glazenbol glazenbol = new Glazenbol(45);
        glazenbol.verzamelAlleBallen();

        Scorebord scorebord = new Scorebord();
        scorebord.maakLeeg();

        for(int i = 0; i < 6; i++){
            Lottobal bal = glazenbol.schepBal();
            scorebord.plaatsBal(bal);
        }

        Lottobal bonusBal = glazenbol.schepBal();
        scorebord.plaatsBonusBal(bonusBal);

        scorebord.sorteerBallen();

        scorebord.printScorebord();
    }
}
