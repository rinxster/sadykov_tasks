package task_5;

public abstract class Figure {
        float x;
        float y;
        String color;

        Figure(float x, float y){
            this.x=x;
            this.y=y;
        }

        public abstract float getArea();

        public abstract float getPerimeter();

    }
