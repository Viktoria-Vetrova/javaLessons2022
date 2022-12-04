package task04.robot;

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void turnRight() {
        switch (this.direction) {
            case DOWN:
                this.direction = Direction.LEFT;
                break;
            case LEFT:
                this.direction = Direction.UP;
                break;
            case UP:
                this.direction = Direction.RIGHT;
                break;
            case RIGHT:
                this.direction = Direction.DOWN;
                break;
        }
    }

    public void turnLeft() {
        switch (this.direction) {
            case DOWN:
                this.direction = Direction.RIGHT;
                break;
            case RIGHT:
                this.direction = Direction.UP;
                break;
            case UP:
                this.direction = Direction.LEFT;
                break;
            case LEFT:
                this.direction = Direction.DOWN;
                break;
        }
    }

    public void stepForward() {
        switch (this.direction) {
            case DOWN:
                this.y = this.y - 1;
                break;
            case UP:
                this.y = this.y + 1;
                break;
            case LEFT:
                this.x = this.x - 1;
                break;
            case RIGHT:
                this.x = this.x + 1;
                break;
        }
    }
}
