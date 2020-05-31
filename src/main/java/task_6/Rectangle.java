package task_6;

public class Rectangle extends Figure{

    private float width;
    private float height;

    Rectangle(float x, float y, float width, float height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public boolean isSquare(){
        return (width==height);
    }


}
