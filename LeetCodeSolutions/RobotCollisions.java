package LeetCodeSolutions;
import java.util.*;

//LeetCode 2751 : Robot Collisions
public class RobotCollisions {
    //solution
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        TreeMap<Integer, Robot> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(positions[i], new Robot(i, healths[i], directions.charAt(i)));
        }

        Stack<Robot> st = new Stack<>();

        for (Robot r : map.values()) {
            if (st.isEmpty()) {
                st.push(r);
            } else {
                Robot top = st.peek();
                if (top.direction == r.direction) {
                    st.push(r);
                } else {
                    boolean rDestroyed = false;
                    while (!st.isEmpty() && top.direction == 'R' && r.direction == 'L') {
                        if (top.health == r.health) {
                            st.pop(); //both destroyed
                            rDestroyed = true;
                            break;
                        } else if (top.health > r.health) { //new robot destroyed
                            top.health -= 1;
                            rDestroyed = true;
                            break;
                        } else {
                            st.pop();
                            r.health -= 1;
                        }

                        if (!st.isEmpty())
                            top = st.peek();
                    }
                    if (!rDestroyed)
                        st.push(r);
                }
            }
        }

        List<Robot> survivers = new ArrayList<>();
        while (!st.isEmpty()) {
            survivers.add(st.pop());
        }

        Collections.sort(survivers);

        List<Integer> ans = new ArrayList<>();
        for (Robot r : survivers) {
            ans.add(r.health);
        }

        return ans;
    }

    class Robot implements Comparable<Robot> {
        int index;
        int health;
        char direction;

        Robot(int i, int h, char d) {
            index = i;
            health = h;
            direction = d;
        }

        @Override
        public int compareTo(Robot other) {
            return this.index - other.index;
        }
    }

}
