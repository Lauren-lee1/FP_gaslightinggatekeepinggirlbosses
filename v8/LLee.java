package v8;
public class LLee extends LoveInterest{

    public LLee() {
        super("LLee");
        _source = "v7/LLeeLines/";
        setStory();
    }

    public void setStory() {
        //root
        _story = new StoryNode(_source + "intro.txt");
    }

    public void receiveItem() {

    }

}
