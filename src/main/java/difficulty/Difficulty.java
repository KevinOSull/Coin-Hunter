package difficulty;

public class Difficulty {

    private int monsterCount;
    private int coinCount;
    private int trapCount;


    public Difficulty(int monsterCount,int coinCount,int trapCount){
        this.monsterCount = monsterCount;
        this.coinCount = coinCount;
        this.trapCount = trapCount;
    }

    public int getMonsterCount(){
        return this.monsterCount;
    }

    public int getCoinCount(){
        return this.coinCount;
    }

    public int getTrapCount(){
        return this.trapCount;
    }


}
