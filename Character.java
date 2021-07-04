public class Character { 
    int romeoPoints = 50;
    int barryPoints = 50;
    int alonsoPoints = 50;
    int sashiPoints = 50;
    int jamiePoints = 50;
    int nalaPoints = 50;
    int aliyahPoints = 50;
    int kaiPoints = 50;
    String name;

    Character() {
        this.name = "Mika";
    }
    Character(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public int getRomeoPoints() {
        return this.romeoPoints;
    }
    public int getBarryPoints() {
        return this.barryPoints;
    }
    public int getAlonsoPoints() {
        return this.alonsoPoints;
    }
    public int getSashiPoints() {
        return this.sashiPoints;
    }
    public int getJamiePoints() {
        return this.jamiePoints;
    }
    public int getNalaPoints() {
        return this.nalaPoints;
    }
    public int getAliyahPoints() {
        return this.aliyahPoints;
    }
    public int getKaiPoints() {
        return this.kaiPoints;
    }

    public void loseRomeo() {
        modifyRomeo(-25);
    }
    public void gainRomeo() {
        modifyRomeo(25);
    }
    public void modifyRomeo(int amount) {
        this.romeoPoints += amount;
    }

    public void loseBarry() {
        modifyBarry(-25);
    }
    public void gainBarry() {
        modifyBarry(25);
    }
    public void modifyBarry(int amount) {
        this.barryPoints += amount;
    }

    public void loseAlonso() {
        modifyAlonso(-25);
    }
    public void gainAlonso() {
        modifyAlonso(25);
    }
    public void modifyAlonso(int amount) {
        this.alonsoPoints += amount;
    }

    public void loseSashi() {
        modifySashi(-25);
    }
    public void gainSashi() {
        modifySashi(25);
    }
    public void modifySashi(int amount) {
        this.sashiPoints += amount;
    }

    public void loseJamie() {
        modifyJamie(-25);
    }
    public void gainJamie() {
        modifyJamie(25);
    }
    public void modifyJamie(int amount) {
        this.jamiePoints += amount;
    }

    public void loseNala() {
        modifyNala(-25);
    }
    public void gainNala() {
        modifyNala(25);
    }
    public void modifyNala(int amount) {
        this.nalaPoints += amount;
    }

    public void loseAliyah() {
        modifyAliyah(-25);
    }
    public void gainAliyah() {
        modifyAliyah(25);
    }
    public void modifyAliyah(int amount) {
        this.aliyahPoints += amount;
    }

    public void loseKai() {
        modifyKai(-25);
    }
    public void gainKai() {
        modifyKai(25);
    }
    public void modifyKai(int amount) {
        this.kaiPoints += amount;
    }
}
