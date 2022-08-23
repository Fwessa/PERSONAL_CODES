public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyIntelligence();
        knight.sayMyAgility();


        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyIntelligence();
        mage.sayMyAgility();


        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyIntelligence();
        thief.sayMyAgility();


        Character Healer = new Character();

        Healer.strength = 30;
        Healer.agility = 50;
        Healer.intelligence = 200;
        Healer.name = "Fwessa";
        Healer.sayMyName();
        Healer.sayMyStrength();
        Healer.sayMyIntelligence();
        Healer.sayMyAgility();


    }
}
