/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playpen.java.robot;

/**
 *
 * @author RW Simmons
 */
public class PlaypenJavaRobot {

    public static void main(String[] args) {
        // Created arena
        int[] aTheRobot = new int[RobotEnum.Robot_ATT.SIZE.ordinal()];
        aTheRobot[RobotEnum.Robot_ATT.POSITION_X.ordinal()] = -10;
        aTheRobot[RobotEnum.Robot_ATT.POSITION_Y.ordinal()] = 2;
        aTheRobot[RobotEnum.Robot_ATT.FUEL.ordinal()] = 77;

        //Create Robot 
        System.out.println("Battle bot time");
        BattleRobot battleRobot = new BattleRobot(aTheRobot);
        int[] returnRobot = battleRobot.getRobotStatus();

        for (int i : returnRobot) {
            System.out.println("Battle Over " + i);
        }
    }

}
