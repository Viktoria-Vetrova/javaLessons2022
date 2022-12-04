package task04;

import task04.robot.Direction;
import task04.robot.Robot;

public class Main {

    public static void main(String args[]) {
        Task04 task1 = new Task04();
        Task04 task2 = new Task04();
        Task04 task3 = new Task04("new string");

        Person person1 = new Person("Vika");
        Person person2 = new Person("Sasha", 30);

        person1.talk("Hi");
        person2.move("outside");

        Robot robot1 = new Robot(1, 2, Direction.DOWN);
        Robot robot2 = new Robot(-10, -6, Direction.DOWN);
        Robot robot3 = new Robot(-10, -6, Direction.DOWN);

        robot1.turnRight();
        robot1.stepForward();
        robot1.turnRight();
        robot1.turnLeft();
        robot1.stepForward();
        robot1.turnLeft();
        robot1.stepForward();
        System.out.println("robot1 x: " + robot1.getX() + " " + "y: " + robot1.getY());

        moveRobot(robot1, 10, -2);
        moveRobot(robot2, -1, -3);
        moveRobot(robot3, -10, -3);
        System.out.println("robot1 x: " + robot1.getX() + " " + "y: " + robot1.getY());
        System.out.println("robot2 x: " + robot2.getX() + " " + "y: " + robot2.getY());
        System.out.println("robot3 x: " + robot3.getX() + " " + "y: " + robot3.getY());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getDirection() != Direction.LEFT && toX - robot.getX() < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        } else if (robot.getDirection() != Direction.RIGHT && toX - robot.getX() > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getDirection() != Direction.DOWN && toY - robot.getY() < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        } else if (robot.getDirection() != Direction.UP && toY - robot.getY() > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
