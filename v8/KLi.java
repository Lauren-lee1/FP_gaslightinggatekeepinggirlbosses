package v8;
public class KLi extends LoveInterest{

    public KLi() {
        super("Kli");
        _source = "v7/KLiLines/";
        setStory();
    }

    public void setStory() {
        //root
        _story = new StoryNode(_source + "intro.txt");

        StoryNode rollerblading = new StoryNode(_source + "Rollerblading/Rollerblading.txt");
        _story.setLeft(rollerblading);
    }

    public void receiveItem() {

    }

}
