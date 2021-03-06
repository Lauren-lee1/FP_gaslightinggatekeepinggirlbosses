
public class KLi extends LoveInterest{

    public KLi() {
        super("Kli");
        _source = "KLiLines/";
        setup();
    }

    public void setup() {
        //root
        _story = new StoryNode(_source + "intro.txt");

        StoryNode rollerblading = new StoryNode(_source + "rollerblading/rollerblading.txt");
        _story.setLeft(rollerblading);

        StoryNode gaming = new StoryNode(_source + "gaming/gaming.txt");
        _story.setMid(gaming);

        StoryNode what = new StoryNode(_source + "what/what.txt");
        _story.setRight(what);

        StoryNode fight = new StoryNode(_source + "fight/fight.txt");
        what.setLeft(fight);

        StoryNode talk = new StoryNode(_source + "talk/talk.txt");
        what.setMid(talk);

    }

    public void printBlurb() {
        String output = "";
        output += "A league player. Perhaps intelligence isn't the way to go with this man, but kindness and being confident will help? I don't even" + "\n";
        output += "know man league players... Don't go too hard with the athletic side or else there might be an accident..." + "\n";
        System.out.println(output);
    }

}
