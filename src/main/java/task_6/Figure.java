package task_6;

abstract class Figure {

    float x;
    float y;

    Figure(float x, float y){

        this.x=x;
        this.y=y;
    }

    public abstract boolean isSquare();


}
